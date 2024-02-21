package com.example.denisakprototype2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WaterIntakeWidget extends LinearLayout {

    private TextView waterIntakeTextView;

    public WaterIntakeWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.widget_water_intake, this, true);
        waterIntakeTextView = findViewById(R.id.waterIntakeTextView);
        updateWaterIntake(0); // Set initial value
    }

    public void updateWaterIntake(int waterIntake) {
        waterIntakeTextView.setText(String.valueOf(waterIntake));
        // Implement any additional logic for updating water intake display
    }
}
