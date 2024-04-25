package com.example.bottonmenuexample.fragments;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.bottonmenuexample.R;
import com.example.bottonmenuexample.adapterbangun;
import com.example.bottonmenuexample.balok;
import com.example.bottonmenuexample.kerucut;
import com.example.bottonmenuexample.kubus;
import com.example.bottonmenuexample.lingkaran;
import com.example.bottonmenuexample.item;
import com.example.bottonmenuexample.persegi;
import com.example.bottonmenuexample.persegipanjang;
import com.example.bottonmenuexample.segitiga;
import com.example.bottonmenuexample.silinder;

import java.util.ArrayList;
import java.util.List;

public class Fragment1 extends Fragment implements adapterbangun.ItemClickListener {

    RecyclerView rvBangunDatar;
    List<item> listDataBangunDatar = new ArrayList<>();
    adapterbangun adapter;
    int[] ImageGeometry={R.drawable.pers,R.drawable.persp,R.drawable.seg,R.drawable.li};

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvBangunDatar = view.findViewById(R.id.rvBangunDatar);


        menu();

        adapter = new adapterbangun(getContext(), listDataBangunDatar);
        rvBangunDatar.setAdapter(adapter);
        rvBangunDatar.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter.setClickListener(this);
    }
    public void menu(){
        String[] namaBangunn = getResources().getStringArray(R.array.namaBangunDtr);
        String[] descBangunn = getResources().getStringArray(R.array.deskripsiBangunnDtr);

        for (int i = 0; i < namaBangunn.length;i++){
            listDataBangunDatar.add(new item(ImageGeometry[i],namaBangunn[i],descBangunn[i]));
        }
    }

    @Override
    public void onItemClick(View view, int position) {
        if (adapter.getItem(position).getNamaBangunn().equals("persegi")) {
            Intent intent = new Intent(getActivity(), persegi.class);
            startActivity(intent);
        } else if (adapter.getItem(position).getNamaBangunn().equals("persegi panjang")) {
            Intent intent = new Intent(getActivity(), persegipanjang.class);
            startActivity(intent);
        } else if (adapter.getItem(position).getNamaBangunn().equals("segitiga")) {
            Intent intent = new Intent(getActivity(), segitiga.class);
            startActivity(intent);
        } else if (adapter.getItem(position).getNamaBangunn().equals("lingkaran")) {
            Intent intent = new Intent(getActivity(), lingkaran.class);
            startActivity(intent);
        }
    }
}

