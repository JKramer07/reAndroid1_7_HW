package com.geek.reandroid1_7_hw.UI.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geek.reandroid1_7_hw.R;

import java.util.ArrayList;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.ViewHolder> {

    private ArrayList<MainModel> list;

    public void setList(ArrayList<MainModel> list) {
        this.list = new ArrayList<>();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_location_rv, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView planet, planetName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            planet = itemView.findViewById(R.id.planetTv);
            planetName = itemView.findViewById(R.id.planetNameTv);
        }

        public void onBind(MainModel mainModel) {
            planet.setText(mainModel.getName());
            planetName.setText(mainModel.getSecName());
        }
    }
}
