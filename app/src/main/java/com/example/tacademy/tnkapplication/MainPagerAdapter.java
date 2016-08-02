package com.example.tacademy.tnkapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Tacademy on 2016-08-02.
 */
public class MainPagerAdapter extends FragmentPagerAdapter {

    public MainPagerAdapter(FragmentManager fm){super(fm);}

    @Override
    public Fragment getItem(int position) {
        return  MessageFragment.newInstance("pager : " + position);
    }

    @Override
    public int getCount() {return 4;}

    @Override
    public CharSequence getPageTitle(int position) {return "tab"+position;}
}
