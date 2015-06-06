package com.example.mriganka.letslearn;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by mriganka on 5/17/15.
 */
public class AlphabetSubPagerAdapter extends _CommonSubPagerAdapter {
    String parentFragmentKey;

    public AlphabetSubPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = new SubAlphabetFragment();
        fragment.setArguments(getBundleArguments(i));
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    public void setParentFragmentKey(String key) {
        parentFragmentKey = key;
    }

    private Bundle getBundleArguments(int i) {
        Bundle args = new Bundle();
        args.putString(SubAlphabetFragment.EXAMPLE_IMAGE_SOURCE,
                "example_image_" + parentFragmentKey + "_" + i);

        return args;
    }
}
