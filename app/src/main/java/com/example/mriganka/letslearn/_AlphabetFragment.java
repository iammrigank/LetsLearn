package com.example.mriganka.letslearn;

import android.content.Intent;
import android.os.Bundle;

/**
 * Created by mriganka on 5/10/15.
 */
public class _AlphabetFragment extends _CommonLessonFragment {

    @Override
    protected _FragmentData getFragmentDataObject() {
        Bundle bundleArgs = getArguments();
        return new _AlphabetFragmentData(bundleArgs.getInt(CURRENT_PAGE_POSITION), getResources(), getActivity());
    }

    @Override
    protected void goToLessonHome() {
        startActivity(new Intent(getActivity(), _AlphabetLessonActivity.class));
    }

    @Override
    protected int getSubViewPagerResourceId() {
        return R.id.sub_alphabet_view_pager;
    }

    @Override
    protected _CommonSubPagerAdapter buildAdapter() {
        return new AlphabetSubPagerAdapter(getChildFragmentManager());
    }
}
