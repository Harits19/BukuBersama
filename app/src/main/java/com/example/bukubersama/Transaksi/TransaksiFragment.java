package com.example.bukubersama.Transaksi;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bukubersama.R;

public class TransaksiFragment extends Fragment {


//    private RecyclerView recyclerViewTransaksi;
//    private TransaksiAdapter transaksiAdapter;
//    private ArrayList<Transaksi> transaksiArrayList;

    //TabLayout
    ViewPager viewPager;
    TabLayout tabLayout;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_transaksi, container, false);

        tabLayout = (TabLayout) view.findViewById(R.id.tabLayout_tantangan);
        tabLayout.addTab(tabLayout.newTab().setText("Pinjam"));
        tabLayout.addTab(tabLayout.newTab().setText("Tukar"));
        viewPager=(ViewPager)view.findViewById(R.id.viewPager_tantangan);


        TabLayoutAdapter adapter = new TabLayoutAdapter(getActivity(), getChildFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



//        addDataTransaksi();
//        recyclerViewTransaksi = view.findViewById(R.id.transaksi_recycleView);
//        transaksiAdapter = new TransaksiAdapter(transaksiArrayList);
//        RecyclerView.LayoutManager layoutManagerTransaksi = new LinearLayoutManager(getActivity());
//        recyclerViewTransaksi.setLayoutManager(layoutManagerTransaksi);
//        recyclerViewTransaksi.setAdapter(transaksiAdapter);
        return view;
    }

//    void addDataTransaksi() {
//        transaksiArrayList = new ArrayList<>();
//        transaksiArrayList.add(new Transaksi("AA"));
//        transaksiArrayList.add(new Transaksi("BB"));
//        transaksiArrayList.add(new Transaksi("CC"));
//        transaksiArrayList.add(new Transaksi("DD"));
//
//    }

}