package com.example.belajar_login_cantik;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class PerkiraanActivity extends AppCompatActivity {
    private CuacaAdapter adapter;
    private ArrayList<Kota> kotaArrayList;
    RecyclerView recyclerView;
    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

    Fragment hariFragment;
    Fragment besokFragment;
    Fragment lusaFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_perkiraan);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

        hariFragment = new HariFragment();
        besokFragment = new BesokFragment();
        lusaFragment = new LusaFragment();

    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return hariFragment;
            } else if (position == 1) {
                return besokFragment;
            } else if (position == 2) {
                return lusaFragment;
            }
            Log.d("masuk","iniMasuk");
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}
