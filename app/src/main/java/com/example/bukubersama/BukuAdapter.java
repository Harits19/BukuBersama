package com.example.bukubersama;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class BukuAdapter extends RecyclerView.Adapter<BukuAdapter.BukuViewHolder> {


    private ArrayList<Buku> dataList;

    public BukuAdapter(ArrayList<Buku> dataList) {
        this.dataList = dataList;
    }

    @Override
    public BukuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_test, parent, false);
        return new BukuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BukuViewHolder holder, int position) {
        holder.judul.setText(dataList.get(position).getJudul());
//        holder.txtNpm.setText(dataList.get(position).getNpm());
//        holder.txtNoHp.setText(dataList.get(position).getNohp());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class BukuViewHolder extends RecyclerView.ViewHolder{
        private TextView judul, txtNpm, txtNoHp;

        public BukuViewHolder(View itemView) {
            super(itemView);
            judul= (TextView) itemView.findViewById(R.id.judulBuku);
//            txtNpm = (TextView) itemView.findViewById(R.id.txt_npm_mahasiswa);
//            txtNoHp = (TextView) itemView.findViewById(R.id.txt_nohp_mahasiswa);
        }
    }
}