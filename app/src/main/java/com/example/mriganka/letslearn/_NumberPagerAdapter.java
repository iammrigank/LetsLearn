package com.example.mriganka.letslearn;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by mriganka on 6/2/15.
 */
public class _NumberPagerAdapter extends _CommonPagerAdapter {

    public _NumberPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    protected _CommonLessonFragment getFragmentToActivate() {
        return new _NumberFragment();
    }

}
