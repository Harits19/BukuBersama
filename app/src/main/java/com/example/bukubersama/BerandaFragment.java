package com.example.bukubersama;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class BerandaFragment extends Fragment {
    private RecyclerView recyclerViewBerita, recyclerViewTantangan;
    private BeritaAdapter beritaAdapter;
    private TantanganAdapter tantanganAdapter;
    private ArrayList<Berita> beritaArrayList;
    private ArrayList<Tantangan> tantanganArrayList;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_beranda, container, false);


        addDataBerita();
        recyclerViewBerita = view.findViewById(R.id.berita_recycleView);
        beritaAdapter = new BeritaAdapter(beritaArrayList);
        RecyclerView.LayoutManager layoutManagerBerita = new LinearLayoutManager(getActivity());
        recyclerViewBerita.setLayoutManager(layoutManagerBerita);
        recyclerViewBerita.setAdapter(beritaAdapter);

        addDataTantangan();
        recyclerViewTantangan = view.findViewById(R.id.tantangan_recycleView);
        tantanganAdapter = new TantanganAdapter(tantanganArrayList);
        RecyclerView.LayoutManager layoutManagerTantangan = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerViewTantangan.setLayoutManager(layoutManagerTantangan);
        recyclerViewTantangan.setAdapter(tantanganAdapter);

        return view;

    }

    void addDataBerita() {
        beritaArrayList = new ArrayList<>();
        beritaArrayList.add(new Berita("AA"));
        beritaArrayList.add(new Berita("BB"));
        beritaArrayList.add(new Berita("CC"));
        beritaArrayList.add(new Berita("DD"));

    }

    void addDataTantangan() {
        tantanganArrayList = new ArrayList<>();
        tantanganArrayList.add(new Tantangan("AA"));
        tantanganArrayList.add(new Tantangan("BB"));
        tantanganArrayList.add(new Tantangan("CC"));
        tantanganArrayList.add(new Tantangan("DD"));

    }
}
