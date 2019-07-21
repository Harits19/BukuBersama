package com.example.bukubersama;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KoleksiBukuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koleksi_buku);

        Button tambahKoleksiBuku= findViewById(R.id.tambahKoleksiButton);
        Button detailBukuButton= findViewById(R.id.detailBukuButton);


        tambahKoleksiBuku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KoleksiBukuActivity.this, UnggahBukuActivity.class);
                startActivity(intent);
            }
        });
        detailBukuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KoleksiBukuActivity.this, DetailBukuActivity.class);
                startActivity(intent);
            }
        });

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabLayout.addTab(tabLayout.newTab().setText("Semua"));
        tabLayout.addTab(tabLayout.newTab().setText("Biografi"));
        tabLayout.addTab(tabLayout.newTab().setText("Ilmiah"));
        tabLayout.addTab(tabLayout.newTab().setText("Novel"));
        tabLayout.addTab(tabLayout.newTab().setText("Tafsir"));
    }
}
