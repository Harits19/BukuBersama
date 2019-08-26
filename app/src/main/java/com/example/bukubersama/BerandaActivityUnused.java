package com.example.bukubersama;

//ACTIVITY TIDAK TERPAKAI


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class BerandaActivityUnused extends AppCompatActivity {

    private LinearLayout koleksiLayout;
    private Button pinjamBukuButton, topUpButton;
    private RelativeLayout profileLayout;
    private RecyclerView recyclerViewBerita, recyclerViewTantangan;
    private BeritaAdapter beritaAdapter;
    private TantanganAdapter tantanganAdapter;
    private ArrayList<Berita> beritaArrayList;
    private ArrayList<Tantangan> tantanganArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda_unused);

        addDataBerita();
        recyclerViewBerita = findViewById(R.id.berita_recycleView);
        beritaAdapter = new BeritaAdapter(beritaArrayList);
        RecyclerView.LayoutManager layoutManagerBerita = new LinearLayoutManager(BerandaActivityUnused.this);
        recyclerViewBerita.setLayoutManager(layoutManagerBerita);
        recyclerViewBerita.setAdapter(beritaAdapter);

        addDataTantangan();
        recyclerViewTantangan = findViewById(R.id.tantangan_recycleView);
        tantanganAdapter = new TantanganAdapter(tantanganArrayList);
        RecyclerView.LayoutManager layoutManagerTantangan = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewTantangan.setLayoutManager(layoutManagerTantangan);
        recyclerViewTantangan.setAdapter(tantanganAdapter);

//        topUpButton = findViewById(R.id.topupButton);
//        koleksiLayout = findViewById(R.id.koleksiLayout);
//        pinjamBukuButton = findViewById(R.id.pinjamBukuButton);
//        profileLayout = findViewById(R.id.editprofile_layout);
//
//
//        profileLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(BerandaActivity.this, EditProfileActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        pinjamBukuButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(BerandaActivity.this, PinjamBukuActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        koleksiLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(BerandaActivity.this, KoleksiBukuActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        topUpButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(BerandaActivity.this, TopUpActivity.class);
//                startActivity(intent);
//            }
//        });

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//            Window w = getWindow();
//            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
//        }

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
