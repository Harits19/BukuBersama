package com.example.bukubersama;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class BerandaActivity extends AppCompatActivity {

    private LinearLayout koleksiLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

      Button topUpButton = findViewById(R.id.topupButton);
      koleksiLayout = findViewById(R.id.koleksiLayout);

        RelativeLayout profileLayout = findViewById(R.id.editprofile_layout);
        profileLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BerandaActivity.this, EditProfileActivity.class);
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

//        LinearLayout linear_layout = findViewById(R.id.linear_layout);
//
//        Animation slide_up = AnimationUtils.loadAnimation(getApplicationContext(),
//                R.anim.slide_up);
//        slide_up.setDuration(500);
    }
}
