package com.example.bukubersama;


import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class BeritaAdapter extends RecyclerView.Adapter<BeritaAdapter.BeritaViewHolder> {


    private ArrayList<Berita> dataList;

    public BeritaAdapter(ArrayList<Berita> dataList) {
        this.dataList = dataList;
    }

    @Override
    public BeritaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycleview_berita, parent, false);
        return new BeritaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BeritaViewHolder holder, int position) {
//        holder.judul.setText(dataList.get(position).getJudul());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class BeritaViewHolder extends RecyclerView.ViewHolder {
        private TextView judul;


        public BeritaViewHolder(View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.judulBerita);
        }
    }
}