package com.example.denisakprototype2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class HealthTipsAdapter extends RecyclerView.Adapter<HealthTipsAdapter.HealthTipViewHolder> {

    private List<HealthTip> healthTips;


    public HealthTipsAdapter(List<HealthTip> healthTips) {
        this.healthTips = healthTips;
    }

    @NonNull
    @Override
    public HealthTipViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_health_tip, parent, false);
        return new HealthTipViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HealthTipViewHolder holder, int position) {
        HealthTip healthTip = healthTips.get(position);
        holder.titleTextView.setText(healthTip.getTitle());
        holder.descriptionTextView.setText(healthTip.getDescription());
    }

    @Override
    public int getItemCount() {
        return healthTips.size();
    }

    static class HealthTipViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        TextView descriptionTextView;

        HealthTipViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
        }
    }
}