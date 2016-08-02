package com.example.tacademy.tnkapplication;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    TabLayout tabs;
    ViewPager pager;
    MainPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabs = (TabLayout)findViewById(R.id.tabs);
        pager = (ViewPager)findViewById(R.id.pager);
        mAdapter = new MainPagerAdapter(getSupportFragmentManager());

        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                setTitle("pager : " + position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        pager.setAdapter(mAdapter);

        tabs.setupWithViewPager(pager);

        tabs.removeAllTabs();

        //Setting tabs
        tabs.addTab(tabs.newTab().setText("예약코드"));
        tabs.addTab(tabs.newTab().setText("출시코드"));
        tabs.addTab(tabs.newTab().setText("커뮤니티"));
        tabs.addTab(tabs.newTab().setText("설정"));




    }
}
