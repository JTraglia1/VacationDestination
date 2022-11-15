package com.hfad.vacationdestination;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class DialogShowDestination extends DialogFragment
{
    private VacationDestination vacationDestination;

    public DialogShowDestination(VacationDestination vd)
    {
        vacationDestination = vd;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState)
    {
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_show_destination, null);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        RadioButton rbFavorite = dialogView.findViewById(R.id.rbFavorite);
        TextView tvTitle = dialogView.findViewById(R.id.tvDestination);
        ImageView imvDestinationImage = dialogView.findViewById(R.id.imvDestinationImage);
        Button btnDoneShowingNote = dialogView.findViewById(R.id.btnDoneShowingNote);

        tvTitle.setText(vacationDestination.getPlaceName());
        imvDestinationImage.setImageResource(vacationDestination.getImageID());

        if (vacationDestination.isFavorite())
        {
            rbFavorite.setClickable(false);
            rbFavorite.setChecked(true);
        }
        else
        {
            rbFavorite.setClickable(false);
            rbFavorite.setChecked(false);
        }

        btnDoneShowingNote.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                dismiss();
            }
        });

        builder.setView(dialogView);

        return builder.create();
    }


}
