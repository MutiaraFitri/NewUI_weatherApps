package com.example.belajar_login_cantik;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class LusaFragment extends Fragment {

    private RecyclerView recyclerView;
    private PerkiraanAdapter adapter;
    private ArrayList<Kota> kotaArrayList;

    public LusaFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragmen_lusa, container, false);
        // 1. get a reference to recyclerView
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.fragmen_lusa_r);

        // 2. set layoutManger
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // this is data fro recycler view
        kotaArrayList = new ArrayList<>();
        kotaArrayList.add(new Kota("Dimas Maulana", "1414370309", "123456789"));
        kotaArrayList.add(new Kota("Fadly Yonk", "1214234560", "987654321"));
        kotaArrayList.add(new Kota("Ariyandi Nugraha", "1214230345", "987648765"));
        kotaArrayList.add(new Kota("Aham Siswana", "1214378098", "098758124"));


        // 3. create an adapter
        adapter = new PerkiraanAdapter(kotaArrayList);

        recyclerView.setAdapter(adapter);
        // 5. set item animator to DefaultAnimator
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return rootView;
    }

}
