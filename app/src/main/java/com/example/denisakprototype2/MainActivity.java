package com.example.denisakprototype2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;


import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HealthTip healthTip1 = new HealthTip("Exercise Regularly", "Stay active for at least 30 minutes a day.");
        HealthTip healthTip2 = new HealthTip("Stay Hydrated", "Drink at least 8 glasses of water daily.");
        HealthTip healthTip3 = new HealthTip("Get Enough Sleep", "Ensure 7-9 hours of quality sleep each night.");

        List<HealthTip> healthTipsList = new ArrayList<>();
        healthTipsList.add(healthTip1);
        healthTipsList.add(healthTip2);
        healthTipsList.add(healthTip3);

        //Health Tips Carousel
        ViewPager2 viewPagerHealthTips = findViewById(R.id.viewPagerHealthTips);
        HealthTipsAdapter healthTipsAdapter;
        healthTipsAdapter = new HealthTipsAdapter(healthTipsList);
        viewPagerHealthTips.setAdapter(healthTipsAdapter);

        RecyclerView recyclerView = findViewById(R.id.recyclerView); // Replace with your RecyclerView ID
        healthTipsAdapter = new HealthTipsAdapter(healthTipsList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(healthTipsAdapter);
    }
    }