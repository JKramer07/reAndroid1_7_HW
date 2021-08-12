package com.geek.reandroid1_7_hw.UI.Activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geek.reandroid1_7_hw.R;
import com.geek.reandroid1_7_hw.UI.Fragments.DetailsFragment;
import com.geek.reandroid1_7_hw.UI.Interface.OnItemClickListener;

import java.util.ArrayList;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.ViewHolder> {

    private ArrayList<MainModel> list = new ArrayList<>();
    private OnItemClickListener listener;

    public void setListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public void setList(ArrayList<MainModel> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_character_rv, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
        holder.itemView.setOnClickListener(v ->{
            listener.onClick(list.get(position));

        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView image;
        private TextView name, secName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.characterIv);
            name = itemView.findViewById(R.id.characterNameTv);
            secName = itemView.findViewById(R.id.characterSecondNameTv);
        }

        public void onBind(MainModel mainModel) {
            image.setImageResource(mainModel.getImage());
            name.setText(mainModel.getName());
            secName.setText(mainModel.getSecName());
        }
    }
}
