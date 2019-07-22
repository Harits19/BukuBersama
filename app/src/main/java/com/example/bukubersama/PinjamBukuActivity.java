package com.example.bukubersama;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class PinjamBukuActivity extends AppCompatActivity {

    Dialog myDialog;

    private RecyclerView recyclerView;
    private BukuAdapter adapter;
    private ArrayList<Buku> bukuArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinjam_buku);
        //Konfigurasi PopUp
        myDialog = new Dialog(this);

        //Konfigurasi Recycleview
        addData();
        recyclerView = findViewById(R.id.bukuLayout);
        adapter = new BukuAdapter(bukuArrayList);
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

    //Konfigurasi PopUp
    public void ShowPopup(View v) {
        TextView txtclose;
        myDialog.setContentView(R.layout.popup_detail_pembayaran_peminjaman);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    //Konfigurasi Recycleview
    void addData() {
        bukuArrayList = new ArrayList<>();
        bukuArrayList.add(new Buku("AA"));
        bukuArrayList.add(new Buku("BB"));
        bukuArrayList.add(new Buku("CC"));
        bukuArrayList.add(new Buku("DD"));

    }

    //Handler Layout
    public void ShowDetailBukuPeminjaman(View view) {
        Intent intent = new Intent(PinjamBukuActivity.this, DetailBukuYangDipinjamActivity.class);
        startActivity(intent);
    }
}
