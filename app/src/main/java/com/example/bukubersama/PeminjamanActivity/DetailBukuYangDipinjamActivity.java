package com.example.bukubersama.PeminjamanActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.bukubersama.PesanActivity.PesanActivity;
import com.example.bukubersama.R;

public class DetailBukuYangDipinjamActivity extends AppCompatActivity {

    Dialog myDialog;
    Button pesanButton, pinjamButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_buku_yang_dipinjam);

//        myDialog = new Dialog(this);
//        pinjamButton = findViewById(R.id.pinjam_button);
//        pesanButton = findViewById(R.id.pesan_button);
//
//
//        pinjamButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                myDialog.setContentView(R.layout.popup_detail_pembayaran_peminjaman);
//                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//                myDialog.show();
//            }
//        });

        pesanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetailBukuYangDipinjamActivity.this, PesanActivity.class));
            }
        });



    }
}
