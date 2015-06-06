package com.example.mriganka.letslearn;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by mriganka on 6/3/15.
 */
public abstract class _CommonPagerAdapter extends FragmentStatePagerAdapter {
    public _CommonPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public abstract int getCount();
    protected abstract _CommonLessonFragment getFragmentToActivate();

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = getFragmentToActivate();
        fragment.setArguments(getBundleArguments(position));
        return fragment;
    }

    protected Bundle getBundleArguments(int position) {
        Bundle args = new Bundle();
        args.putInt(_CommonLessonFragment.CURRENT_PAGE_POSITION, position);
        return args;
    }
}
