package com.example.mriganka.letslearn;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class AlphabetPager extends FragmentActivity {

    ViewPager alphabetPager;
    AlphabetPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alphabet_pager_layout);

        alphabetPager = (ViewPager) findViewById(R.id.alphabet_pager);
        pagerAdapter = new AlphabetPagerAdapter(getSupportFragmentManager());
        alphabetPager.setAdapter(pagerAdapter);
    }
}
