package com.example.mriganka.letslearn;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by mriganka on 6/3/15.
 */
public abstract class _CommonSubPagerAdapter extends FragmentStatePagerAdapter {
    public _CommonSubPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public abstract Fragment getItem(int position);

    @Override
    public abstract int getCount();
}
