package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<News> newsArrayList;
    MyAdapter myAdapter;
    String[] newsHeading;
    String[] newsDetail;
    int[] imageResourceId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        newsArrayList = new ArrayList<News>();

        newsHeading = new String[]{
                "Biden aims to expand vaccines for adults and children",
                "Just got my first shot, helping the world to be a safer place",
                "Local trains to be suspended in Bengal from tomorrow in view of covid-19",
                "MHA asks states,UTs to ensure there are no fires in hospitals",
                "Australian citizen sues PM Morrison over flight ban from india",
                "Former India hockey coach Kaushik hospitalised after testing positive for COVID",
                "Delhi records 20,960 fresh covid-19 infections, positivity rate at 26.37%",
                "Barcelona church offers open-air space for Ramadan",
                "Trillions of cicadas set to emerge in the US, here's why",
                "Homemaker, economist: Candidates from all walks of life in Bengal assembly"
        };

        newsDetail = new String[]{
               getString(R.string.new_1),
               getString(R.string.new_2),
               getString(R.string.new_3),
               getString(R.string.new_4),
               getString(R.string.new_5),
               getString(R.string.new_6),
               getString(R.string.new_7),
               getString(R.string.new_8),
               getString(R.string.new_9),
               getString(R.string.new_10)
        };

        imageResourceId = new int[]{
                R.drawable.a,
                R.drawable.b,
                R.drawable.c,
                R.drawable.d,
                R.drawable.e,
                R.drawable.f,
                R.drawable.g,
                R.drawable.h,
                R.drawable.i,
                R.drawable.j,
        };



        getData();


    }

    private void getData() {

        for (int i=0;i<newsHeading.length;i++){

            News news = new News(newsHeading[i],newsDetail[i],imageResourceId[i]);
            newsArrayList.add(news);

        }

        
        myAdapter = new MyAdapter(this,newsArrayList);
        recyclerView.setAdapter(myAdapter);
        myAdapter.notifyDataSetChanged();

    }

}