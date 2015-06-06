package com.example.mriganka.letslearn;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

/**
 * Created by mriganka on 6/1/15.
 */
public class _NumberPagerActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alphabet_view_pager); //TODO: Change to number_view_pager

        ViewPager alphabetViewPager = (ViewPager) findViewById(R.id.alphabet_view_pager);
        alphabetViewPager.setAdapter(getBuiltAdapter());
    }

    protected PagerAdapter getBuiltAdapter() {
        return null; //TODO : Correct this
    }
}
