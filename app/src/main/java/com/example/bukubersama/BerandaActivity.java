package com.example.bukubersama;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class BerandaActivity extends AppCompatActivity {

    private LinearLayout koleksiLayout;
    private Button pinjamBukuButton, topUpButton;
    private RelativeLayout profileLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        topUpButton = findViewById(R.id.topupButton);
        koleksiLayout = findViewById(R.id.koleksiLayout);
        pinjamBukuButton = findViewById(R.id.pinjamBukuButton);
        profileLayout = findViewById(R.id.editprofile_layout);


        profileLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BerandaActivity.this, EditProfileActivity.class);
                startActivity(intent);
            }
        });

        pinjamBukuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BerandaActivity.this, PinjamBukuActivity.class);
                startActivity(intent);
            }
        });

        koleksiLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BerandaActivity.this, KoleksiBukuActivity.class);
                startActivity(intent);
            }
        });

        topUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BerandaActivity.this, TopUpActivity.class);
                startActivity(intent);
            }
        });

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

    }
}
