package com.example.mriganka.letslearn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by mriganka on 6/5/15.
 */
public class _CommonSubFragment extends Fragment {
    public static final String PARENT_KEY = "parent-key";
    private static final int LAYOUT_TO_BE_INFLATED = R.layout.sub_fragment_lesson_common;
    private View inflatedView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO : resource is the common layout
        View inflatedView = inflater.inflate(LAYOUT_TO_BE_INFLATED, container, false);


    }
}
