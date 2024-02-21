package com.example.denisakprototype2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MedicineIntakeWidget extends LinearLayout {

    private TextView medicineIntakeTextView;

    public MedicineIntakeWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.widget_medicine_intake, this, true);
        medicineIntakeTextView = findViewById(R.id.medicineIntakeTextView);
        updateMedicineIntake(0); // Set initial value
    }

    public void updateMedicineIntake(int medicineIntake) {
        medicineIntakeTextView.setText(String.valueOf(medicineIntake));
        // Implement any additional logic for updating medicine intake display
    }
}
