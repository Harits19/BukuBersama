package com.example.bukubersama.Akun;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bukubersama.Akun.Koleksi;
import com.example.bukubersama.Akun.KoleksiAdapter;
import com.example.bukubersama.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;


public class AkunFragment extends Fragment {

    private BarChart mBarChart;
    private RecyclerView recyclerViewKoleksi;
    private KoleksiAdapter koleksiAdapter;
    private ArrayList<Koleksi> koleksiArrayList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_akun, container, false);


        mBarChart = view.findViewById(R.id.chart);

        float groupSpace = 0.08f;
        float barSpace = 0.02f;
        float barWidth = 0.45f;
        float tahunAwal = 2016f;

        // Data-data yang akan ditampilkan di Chart
        List<BarEntry> dataPemasukan = new ArrayList<BarEntry>();
        dataPemasukan.add(new BarEntry(2016, 1500000));
        dataPemasukan.add(new BarEntry(2017, 1430000));
        dataPemasukan.add(new BarEntry(2018, 1750000));
        dataPemasukan.add(new BarEntry(2019, 1390000));

        List<BarEntry> dataPengeluaran = new ArrayList<BarEntry>();
        dataPengeluaran.add(new BarEntry(2016, 500000));
        dataPengeluaran.add(new BarEntry(2017, 430000));
        dataPengeluaran.add(new BarEntry(2018, 750000));
        dataPengeluaran.add(new BarEntry(2019, 390000));

        // Pengaturan atribut bar, seperti warna dan lain-lain
        BarDataSet dataSet1 = new BarDataSet(dataPemasukan, "Pemasukan");
        dataSet1.setColor(ColorTemplate.JOYFUL_COLORS[0]);

        BarDataSet dataSet2 = new BarDataSet(dataPengeluaran, "Pengeluaran");
        dataSet2.setColor(ColorTemplate.JOYFUL_COLORS[1]);

        // Membuat Bar data yang akan di set ke Chart
        BarData barData = new BarData(dataSet1, dataSet2);

        // Pengaturan sumbu X
        XAxis xAxis = mBarChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM.BOTTOM);
        xAxis.setCenterAxisLabels(true);

        // Agar ketika di zoom tidak menjadi pecahan
        xAxis.setGranularity(1f);

        // Diubah menjadi integer, kemudian dijadikan String
        // Ini berfungsi untuk menghilankan koma, dan tanda ribuah pada tahun
        xAxis.setValueFormatter(new IAxisValueFormatter() {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                return String.valueOf((int) value);
            }
        });

        //Menghilangkan sumbu Y yang ada di sebelah kanan
        mBarChart.getAxisRight().setEnabled(false);

        // Menghilankan deskripsi pada Chart
        mBarChart.getDescription().setEnabled(false);

        // Set data ke Chart
        // Tambahkan invalidate setiap kali mengubah data chart
        mBarChart.setData(barData);
        mBarChart.getBarData().setBarWidth(barWidth);
        mBarChart.getXAxis().setAxisMinimum(tahunAwal);
        mBarChart.getXAxis().setAxisMaximum(tahunAwal + mBarChart.getBarData().getGroupWidth(groupSpace, barSpace) * 4);
        mBarChart.groupBars(tahunAwal, groupSpace, barSpace);
        mBarChart.setDragEnabled(true);
        mBarChart.invalidate();

        addDataTantangan();
        recyclerViewKoleksi = view.findViewById(R.id.koleksi_recycleView);
        koleksiAdapter = new KoleksiAdapter(koleksiArrayList);
        RecyclerView.LayoutManager layoutManagerTantangan = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerViewKoleksi.setLayoutManager(layoutManagerTantangan);
        recyclerViewKoleksi.setAdapter(koleksiAdapter);

        return view;
    }

    private void addDataTantangan() {

        koleksiArrayList = new ArrayList<>();
        koleksiArrayList.add(new Koleksi("AA"));
        koleksiArrayList.add(new Koleksi("BB"));
        koleksiArrayList.add(new Koleksi("CC"));
        koleksiArrayList.add(new Koleksi("DD"));
    }
}