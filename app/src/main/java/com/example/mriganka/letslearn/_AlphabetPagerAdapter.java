package com.example.mriganka.letslearn;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by mriganka on 5/10/15.
 */
public class _AlphabetPagerAdapter extends _CommonPagerAdapter {
    public _AlphabetPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    protected _CommonLessonFragment getFragmentToActivate() {
        return new _AlphabetFragment();
    }

    @Override
    public int getCount() {
        return 2;
    }

}