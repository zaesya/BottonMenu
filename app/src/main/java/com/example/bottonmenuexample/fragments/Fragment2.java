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

public class Fragment2 extends Fragment implements adapterbangun.ItemClickListener {

    RecyclerView rvBangunRuang;
    List<item> listDataBangunRuang = new ArrayList<>();
    adapterbangun adapter;
    int[] ImageGeometry={R.drawable.ku,R.drawable.ba,R.drawable.sil,R.drawable.ker};
    public Fragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvBangunRuang = view.findViewById(R.id.rvBangunRuang);


        menu();

        adapter = new adapterbangun(getContext(), listDataBangunRuang);
        rvBangunRuang.setAdapter(adapter);
        rvBangunRuang.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter.setClickListener(this);
    }
    public void menu(){
        String[] namaBangunn = getResources().getStringArray(R.array.namaBangunRug);
        String[] descBangunn = getResources().getStringArray(R.array.deskripsiBangunRug);


        for (int i = 0; i < namaBangunn.length;i++){
            listDataBangunRuang.add(new item(ImageGeometry[i],namaBangunn[i],descBangunn[i]));
        }
    }

    @Override
    public void onItemClick(View view, int position) {
        if (adapter.getItem(position).getNamaBangunn().equals("Kubus")) {
            Intent intent = new Intent(getActivity(), kubus.class);
            startActivity(intent);
        } else if (adapter.getItem(position).getNamaBangunn().equals("Balok")) {
            Intent intent = new Intent(getActivity(), balok.class);
            startActivity(intent);
        } else if (adapter.getItem(position).getNamaBangunn().equals("Silinder")) {
            Intent intent = new Intent(getActivity(), silinder.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(getActivity(), kerucut.class);
            startActivity(intent);
        }
    }
}

