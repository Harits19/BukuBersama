package com.example.bukubersama.Beranda;

import android.widget.ImageView;

public class Tantangan {

    private String judul, pengarang, hargaSewa;
    private ImageView gambarBuku;

    public Tantangan(String judul) {
        this.judul = judul;

    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(String hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public ImageView getGambarBuku() {
        return gambarBuku;
    }

    public void setGambarBuku(ImageView gambarBuku) {
        this.gambarBuku = gambarBuku;
    }
}
