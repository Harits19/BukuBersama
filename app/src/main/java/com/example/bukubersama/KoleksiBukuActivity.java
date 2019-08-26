package com.example.bukubersama;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class KoleksiBukuActivity extends AppCompatActivity {

    private Button tambahKoleksiBuku, detailBukuButton;

    private RecyclerView recyclerView;
    private KoleksiAdapter adapter;
    private ArrayList<Koleksi> koleksiArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koleksi_buku);

//Konfigurasi Recycleview
        addData();
        recyclerView = findViewById(R.id.bukuLayout);
        adapter = new KoleksiAdapter(koleksiArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(KoleksiBukuActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
//        tambahKoleksiBuku = findViewById(R.id.tambahKoleksiButton);
//        detailBukuButton = findViewById(R.id.detailBukuButton);
//
//
//        tambahKoleksiBuku.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(KoleksiBukuActivity.this, UnggahBukuActivity.class);
//                startActivity(intent);
//            }
//        });
//        detailBukuButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(KoleksiBukuActivity.this, DetailBukuActivity.class);
//                startActivity(intent);
//            }
//        });

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabLayout.addTab(tabLayout.newTab().setText("Semua"));
        tabLayout.addTab(tabLayout.newTab().setText("Biografi"));
        tabLayout.addTab(tabLayout.newTab().setText("Ilmiah"));
        tabLayout.addTab(tabLayout.newTab().setText("Novel"));
        tabLayout.addTab(tabLayout.newTab().setText("Tafsir"));
    }

    void addData() {
        koleksiArrayList = new ArrayList<>();
        koleksiArrayList.add(new Koleksi("ABA"));
        koleksiArrayList.add(new Koleksi("BB"));
        koleksiArrayList.add(new Koleksi("CC"));
        koleksiArrayList.add(new Koleksi("DD"));

    }
}
