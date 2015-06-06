package com.example.mriganka.letslearn;

import android.content.Context;

/**
 * Created by mriganka on 6/2/15.
 */
public class _AlphabetGridImageAdapter extends _CommonGridImageAdapter {
    public _AlphabetGridImageAdapter(Context context) {
        super(context);
    }

    @Override
    protected int getCountForTotalObjects() {
        return 26;
    }

    @Override
    protected String getImageResourceURI(int position) {
        char alphabet = (char) position;
        return "image_" + alphabet;
    }
}
