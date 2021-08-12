package com.geek.reandroid1_7_hw.UI.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geek.reandroid1_7_hw.R;
import com.geek.reandroid1_7_hw.UI.Activity.LocationAdapter;
import com.geek.reandroid1_7_hw.UI.Activity.MainModel;

import java.util.ArrayList;

public class LocationFragment extends Fragment {

    private RecyclerView rv;
    private LocationAdapter adapter;
    private ArrayList<MainModel> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_location, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRecycler(view);
    }

    private void initRecycler(View view) {
        rv = view.findViewById(R.id.locationRv);
        adapter = new LocationAdapter();
        rv.setAdapter(adapter);
        rv.setLayoutManager(new GridLayoutManager(getParentFragment().getContext(), 2));
        adapter.setList(list);
    }

    private void createList() {
        list = new ArrayList<>();
        list.add(new MainModel("Planet", "Earth (C-162)"));
        list.add(new MainModel("Space Station", "Citadel of Ricks"));
        list.add(new MainModel("Microverse", "Bepis 9"));
        list.add(new MainModel("TV", "Purge Planet"));
        list.add(new MainModel("Cluster", "Abadango"));
        list.add(new MainModel("Planet", "Earth (C-162"));
        list.add(new MainModel("Planet", "Earth (C-162"));
        list.add(new MainModel("Planet", "Earth (C-162"));
        list.add(new MainModel("Planet", "Earth (C-162"));
        list.add(new MainModel("Planet", "Earth (C-162"));
        list.add(new MainModel("Planet", "Earth (C-162"));
    }
}