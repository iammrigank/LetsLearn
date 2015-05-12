package com.example.mriganka.letslearn;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by mriganka on 5/10/15.
 */
public class AlphabetPagerAdapter extends FragmentStatePagerAdapter {
    public AlphabetPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment alphabetFragment = new AlphabetFragment();
        Bundle argsToAlphabetFragment = new Bundle();
        char currentChar = (char) ('a' + i);
        argsToAlphabetFragment.putChar(AlphabetFragment.alphabetKey, currentChar);
        argsToAlphabetFragment.putString(AlphabetFragment.alphabetImageSource, "image_"
                + currentChar);
        alphabetFragment.setArguments(argsToAlphabetFragment);

        return alphabetFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

}
