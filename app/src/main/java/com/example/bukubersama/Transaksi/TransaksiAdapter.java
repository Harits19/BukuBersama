package com.example.bukubersama.Transaksi;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bukubersama.R;

import java.util.ArrayList;

public class TransaksiAdapter extends RecyclerView.Adapter<TransaksiAdapter.TransaksiViewHolder> {


    private ArrayList<Transaksi> dataList;

    public TransaksiAdapter(ArrayList<Transaksi> dataList) {
        this.dataList = dataList;
    }

    @Override
    public TransaksiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycleview_transaksi_pinjam_atau_tukar, parent, false);
        return new TransaksiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TransaksiViewHolder holder, int position) {
//        holder.judul.setText(dataList.get(position).getJudul());

    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class TransaksiViewHolder extends RecyclerView.ViewHolder {
        private TextView judul;

        public TransaksiViewHolder(View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.judulBuku);
        }
    }
}