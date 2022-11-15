package com.hfad.vacationdestination;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private ArrayList<VacationDestination> destinationList;
    private FragmentManager fragmentManager;

    public MyAdapter(FragmentManager fragmentManager)
    {
        this.fragmentManager = fragmentManager;
        destinationList = Database.getDestinations();
    }

    //Creates an empty view of a single row - inflate a vacation_row_item
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.vacation_row_item, parent, false);

        //System.out.println("DONE CREATING A SINGLE ROW's VIEW.");

        return new MyViewHolder(view);
    }

    //Total in the list
    @Override
    public int getItemCount()
    {
        return destinationList.size();
    }

    //Binds data to an empty row view
    //position - index in the list that you want to show
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        VacationDestination vd = destinationList.get(position);
        holder.setData(vd, position);

        //System.out.println("DONE POPULATING A ROW: " + position + " " + vd.getPlaceName());
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        //handles to the view inside one row
        private ImageView imvDestinationPicture;
        private TextView tvDestinationName;
        private ImageView imvDelete;
        private ImageView imvMakeCopy;
        private ImageView imvBlankStar;

        private int currentPositionInList = -1;
        private VacationDestination currentDestination = null;

        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);

            imvDestinationPicture = itemView.findViewById(R.id.imvPlace);
            tvDestinationName = itemView.findViewById(R.id.tvPlaceName);
            imvDelete = itemView.findViewById(R.id.imvDelete);
            imvMakeCopy = itemView.findViewById(R.id.imvMakeCopy);
            imvBlankStar = itemView.findViewById(R.id.imvBlankStar);

            imvDelete.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    destinationList.remove(currentPositionInList);
                    notifyItemRemoved(currentPositionInList);
                    notifyItemRangeChanged(currentPositionInList, destinationList.size());
                }
            });

            imvMakeCopy.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    destinationList.add(currentPositionInList, currentDestination);
                    notifyItemRemoved(currentPositionInList);
                    notifyItemRangeChanged(currentPositionInList, destinationList.size());
                }
            });

            imvBlankStar.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    if (!currentDestination.isFavorite())
                    {
                        imvBlankStar.setImageResource(R.drawable.colored_star);
                        currentDestination.setFavorite(true);
                    }
                    else
                    {
                        imvBlankStar.setImageResource(R.drawable.blank_star);
                        currentDestination.setFavorite(false);
                    }
                }
            });

            itemView.setClickable(true);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view)
        {
            DialogShowDestination dialogShowDestination = new DialogShowDestination(currentDestination);
            dialogShowDestination.show(fragmentManager, "");
        }

        public void setData(VacationDestination vacationDestination, int position)
        {
            imvDestinationPicture.setImageResource(vacationDestination.getImageID());
            tvDestinationName.setText(vacationDestination.getPlaceName());
            currentPositionInList = position;
            currentDestination = vacationDestination;
        }

    }

}
