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
import com.geek.reandroid1_7_hw.UI.Activity.MainModel;
import com.geek.reandroid1_7_hw.UI.Activity.CharacterAdapter;
import com.geek.reandroid1_7_hw.UI.Interface.OnItemClickListener;

import java.util.ArrayList;

public class CharacterFragment extends Fragment implements OnItemClickListener {

    private RecyclerView rv;
    private CharacterAdapter adapter;
    private ArrayList<MainModel> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_character, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRecycler(view);
    }

    private void createList() {
        list = new ArrayList<>();
        list.add(new MainModel(R.drawable.image, "Dead", "Agency Director"));
        list.add(new MainModel(R.drawable.image, "Dead", "Agency Director"));
        list.add(new MainModel(R.drawable.image, "Dead", "Agency Director"));
        list.add(new MainModel(R.drawable.image, "Dead", "Agency Director"));
        list.add(new MainModel(R.drawable.image, "Dead", "Agency Director"));
        list.add(new MainModel(R.drawable.image, "Dead", "Agency Director"));
        list.add(new MainModel(R.drawable.image, "Dead", "Agency Director"));
        list.add(new MainModel(R.drawable.image, "Dead", "Agency Director"));
        list.add(new MainModel(R.drawable.image, "Dead", "Agency Director"));
    }

    private void initRecycler(View view) {
        rv = view.findViewById(R.id.characterRv);
        adapter = new CharacterAdapter();
        rv.setAdapter(adapter);
        adapter.setList(list);
        adapter.setListener(this);
        rv.setLayoutManager(new GridLayoutManager(getParentFragment().getContext(), 2));
    }

    @Override
    public void onClick(MainModel mainModel) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("key", mainModel);
        DetailsFragment detailsFrag = new DetailsFragment();
        detailsFrag.setArguments(bundle);
        getChildFragmentManager().beginTransaction()
                    .replace(R.id.characterFragment, detailsFrag, null).commit();
    }
}