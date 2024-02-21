package com.example.denisakprototype2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class StepsWidget extends LinearLayout {

    private TextView stepsCountTextView;

    public StepsWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.widget_steps, this, true);
        stepsCountTextView = findViewById(R.id.stepsCountTextView);
        updateStepsCount(0); // Set initial value
    }

    public void updateStepsCount(int stepsCount) {
        stepsCountTextView.setText(String.valueOf(stepsCount));
        // Implement any additional logic for updating steps count display
    }
}
