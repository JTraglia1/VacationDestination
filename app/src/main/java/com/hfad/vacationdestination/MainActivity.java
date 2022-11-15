package com.hfad.vacationdestination;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpReyclerView();
        //System.out.println("This works");
    }

    private void setUpReyclerView()
    {
        RecyclerView rv = findViewById(R.id.recyclerView);

        //Adapter
        MyAdapter adapter = new MyAdapter(getSupportFragmentManager());
        rv.setAdapter(adapter);

        //Manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        rv.setLayoutManager(layoutManager);
    }
}