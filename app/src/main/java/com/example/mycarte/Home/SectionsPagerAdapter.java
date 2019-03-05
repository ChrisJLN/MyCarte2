package com.example.mycarte.Home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for storing fragment for tabs
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter
{
    private static final String TAG = "SectionsPagerAdapter";
    private final List<Fragment> mFramentList = new ArrayList<>();

    public SectionsPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
        return mFramentList.get(position);
    }

    @Override
    public int getCount()
    {
        return mFramentList.size();
    }

    public void addFragment(Fragment fragment)
    {
        mFramentList.add(fragment);
    }
}
