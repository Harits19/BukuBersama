package com.example.bukubersama;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class KoleksiAdapter extends RecyclerView.Adapter<KoleksiAdapter.KoleksiViewHolder> {


    private ArrayList<Koleksi> dataList;

    public KoleksiAdapter(ArrayList<Koleksi> dataList) {
        this.dataList = dataList;
    }

    @Override
    public KoleksiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycleview_koleksi_buku, parent, false);
        return new KoleksiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(KoleksiViewHolder holder, int position) {
        holder.judul.setText(dataList.get(position).getJudul());

    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class KoleksiViewHolder extends RecyclerView.ViewHolder {
        private TextView judul;

        public KoleksiViewHolder(View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.judulBuku);
        }
    }
}