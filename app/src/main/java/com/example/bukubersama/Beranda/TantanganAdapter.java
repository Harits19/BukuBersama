package com.example.bukubersama.Beranda;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bukubersama.R;

import java.util.ArrayList;

public class TantanganAdapter extends RecyclerView.Adapter<TantanganAdapter.TantanganViewHolder> {


    private ArrayList<Tantangan> dataList;

    public TantanganAdapter(ArrayList<Tantangan> dataList) {
        this.dataList = dataList;
    }

    @Override
    public TantanganViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycleview_tantangan, parent, false);
        return new TantanganViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TantanganViewHolder holder, int position) {
//        holder.judul.setText(dataList.get(position).getJudul());

    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class TantanganViewHolder extends RecyclerView.ViewHolder {
        private TextView judul;

        public TantanganViewHolder(View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.judulTantangan);
        }
    }
}