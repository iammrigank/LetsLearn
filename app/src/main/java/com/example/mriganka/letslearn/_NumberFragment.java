package com.example.mriganka.letslearn;

import android.content.Intent;
import android.os.Bundle;

/**
 * Created by mriganka on 6/1/15.
 */
public class _NumberFragment extends _CommonLessonFragment {
    @Override
    protected _FragmentData getFragmentDataObject() {
        Bundle bundleArgs = getArguments();
        return new _NumberFragmentData(bundleArgs.getInt(CURRENT_PAGE_POSITION), getResources(), getActivity());
    }

    @Override
    protected void goToLessonHome() {
        startActivity(new Intent(getActivity(), _NumberLessonActivity.class));
    }

    @Override
    protected int getSubViewPagerResourceId() {
        return R.id.sub_number_view_pager;
    }

    @Override
    protected _CommonSubPagerAdapter buildAdapter() {
        return new NumberSubPagerAdapter(getChildFragmentManager());
    }
}
