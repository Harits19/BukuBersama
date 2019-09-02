package com.example.bukubersama.PeminjamanActivity;


import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bukubersama.R;

import java.util.ArrayList;

public class PeminjamanBukuAdapter extends RecyclerView.Adapter<PeminjamanBukuAdapter.BukuViewHolder> {


    private ArrayList<PeminjamanBuku> dataList;

    public PeminjamanBukuAdapter(ArrayList<PeminjamanBuku> dataList) {
        this.dataList = dataList;
    }

    @Override
    public BukuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycleview_pinjam_buku, parent, false);
        return new BukuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BukuViewHolder holder, int position) {
//        holder.judul.setText(dataList.get(position).getJudul());


    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class BukuViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView1, cardView2;
        private TextView judul;

        public BukuViewHolder(final View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.judulBuku);
            cardView1 = itemView.findViewById(R.id.cardview1);
            cardView2 = itemView.findViewById(R.id.cardview2);

            cardView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemView.getContext().startActivity(new Intent(itemView.getContext(), DetailBukuYangDipinjamActivity.class));
                }
            });

            cardView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemView.getContext().startActivity(new Intent(itemView.getContext(), DetailBukuYangDipinjamActivity.class));
                }
            });



        }
    }
}