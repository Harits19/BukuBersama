package com.example.bukubersama.Beranda;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import com.example.bukubersama.KoleksiBukuActivity;
import com.example.bukubersama.PeminjamanActivity.PinjamBukuActivity;
import com.example.bukubersama.R;
import com.example.bukubersama.SearchActivity.SearchActivity;
import com.example.bukubersama.TantanganActivity.TantanganActivity;

import java.util.ArrayList;

public class BerandaFragment extends Fragment {
    private RecyclerView recyclerViewBerita, recyclerViewTantangan;
    private BeritaAdapter beritaAdapter;
    private TantanganAdapter tantanganAdapter;
    private ArrayList<Berita> beritaArrayList;
    private ArrayList<Tantangan> tantanganArrayList;
    private ImageButton pinjamButton, tukarButton, tantanganButton, koleksiButton;

    RelativeLayout relativeLayoutSearch;








    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_beranda, container, false);


        relativeLayoutSearch = view.findViewById(R.id.relativeSearch);
        pinjamButton = view.findViewById(R.id.pinjamBuku_button);
        tukarButton = view.findViewById(R.id.tukarBuku_button);
        tantanganButton = view.findViewById(R.id.tantangan_button);
        koleksiButton = view.findViewById(R.id.koleksiBuku_button);

        relativeLayoutSearch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(getActivity(), SearchActivity.class));
            }
        });

        pinjamButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(getActivity(), PinjamBukuActivity.class));
            }
        });

        tukarButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(getActivity(),PinjamBukuActivity.class));
            }
        });

        tantanganButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(getActivity(), TantanganActivity.class));
            }
        });

        koleksiButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(getActivity(), KoleksiBukuActivity.class));
            }
        });




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
