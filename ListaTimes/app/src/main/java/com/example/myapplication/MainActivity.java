package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import com.example.myapplication.adapter.AdapterTimes;
import com.example.myapplication.model.Time;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerTime;
    private ArrayList<Time> times = new ArrayList<>();
    private AdapterTimes adapterTimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerTime = findViewById(R.id.recycler_time);
        recyclerTime.setLayoutManager(new LinearLayoutManager(this));

        Time time1 = new Time("Flamengo", 5);
        times.add(time1);

        Time time2 = new Time("Vasco", 1);
        times.add(time2);

        Time time3 = new Time("Fluminense", 3);
        times.add(time3);

        adapterTimes = new AdapterTimes(times);
        recyclerTime.setAdapter(adapterTimes);
    }
}
