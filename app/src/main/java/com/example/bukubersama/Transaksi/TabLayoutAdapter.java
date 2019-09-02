package com.example.bukubersama.Transaksi;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;

import com.example.bukubersama.Transaksi.TransaksiPinjamFragment;
import com.example.bukubersama.Transaksi.TransaksiTukarFragment;

public class TabLayoutAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public TabLayoutAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TransaksiPinjamFragment transaksiPinjamFragment = new TransaksiPinjamFragment();
                return transaksiPinjamFragment;
            case 1:
                TransaksiTukarFragment transaksiTukarFragment = new TransaksiTukarFragment();
                return transaksiTukarFragment;
//            case 2:
//                MovieFragment movieFragment = new MovieFragment();
//                return movieFragment;
            default:
                return null;
        }
    }
    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}