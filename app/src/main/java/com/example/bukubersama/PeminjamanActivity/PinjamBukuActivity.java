package com.example.bukubersama.PeminjamanActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.bukubersama.R;
import com.example.bukubersama.SearchActivity.SearchActivity;

import java.util.ArrayList;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class PinjamBukuActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PeminjamanBukuAdapter adapter;
    RelativeLayout relativeLayoutSearch;
    private ArrayList<PeminjamanBuku> bukuArrayList;
    private CardView cardView1, cardView2;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinjam_buku);
        relativeLayoutSearch = findViewById(R.id.relativeSearch);

        relativeLayoutSearch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(PinjamBukuActivity.this, SearchActivity.class));
            }
        });

        //Konfigurasi Recycleview
        addData();
        recyclerView = findViewById(R.id.bukuLayout);
        adapter = new PeminjamanBukuAdapter(bukuArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(PinjamBukuActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        //Konfigurasi TabLayout
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabLayout.addTab(tabLayout.newTab().setText("Semua"));
        tabLayout.addTab(tabLayout.newTab().setText("Biografi"));
        tabLayout.addTab(tabLayout.newTab().setText("Ilmiah"));
        tabLayout.addTab(tabLayout.newTab().setText("Novel"));
        tabLayout.addTab(tabLayout.newTab().setText("Tafsir"));


    }


    //Konfigurasi Recycleview
    void addData() {
        bukuArrayList = new ArrayList<>();
        bukuArrayList.add(new PeminjamanBuku("AA"));
        bukuArrayList.add(new PeminjamanBuku("BB"));
        bukuArrayList.add(new PeminjamanBuku("CC"));
        bukuArrayList.add(new PeminjamanBuku("DD"));

    }

    //Handler Layout
    public void ShowDetailBukuPeminjaman(View view) {
        Intent intent = new Intent(PinjamBukuActivity.this, DetailBukuYangDipinjamActivity.class);
        startActivity(intent);
    }
}
