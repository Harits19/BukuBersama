package com.example.bukubersama;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

public class PinjamBukuActivity extends AppCompatActivity {

    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinjam_buku);
        myDialog = new Dialog(this);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycleView1);

        adapter = new BukuAdapter(bukuArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(PinjamBukuActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);


        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabLayout.addTab(tabLayout.newTab().setText("Semua"));
        tabLayout.addTab(tabLayout.newTab().setText("Biografi"));
        tabLayout.addTab(tabLayout.newTab().setText("Ilmiah"));
        tabLayout.addTab(tabLayout.newTab().setText("Novel"));
        tabLayout.addTab(tabLayout.newTab().setText("Tafsir"));
    }

    public void ShowPopup(View v) {
        TextView txtclose;
        myDialog.setContentView(R.layout.popup_detail_pembayaran_peminjaman);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    private RecyclerView recyclerView;
    private BukuAdapter adapter;
    private ArrayList<Buku> bukuArrayList;


    void addData(){
        bukuArrayList = new ArrayList<>();
        bukuArrayList.add(new Buku("AA"));
        bukuArrayList.add(new Buku("BB"));
        bukuArrayList.add(new Buku("CC"));
        bukuArrayList.add(new Buku("DD"));

    }

}
