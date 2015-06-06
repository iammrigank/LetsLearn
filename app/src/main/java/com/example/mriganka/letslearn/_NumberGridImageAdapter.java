package com.example.mriganka.letslearn;

import android.content.Context;

/**
 * Created by mriganka on 6/2/15.
 */
public class _NumberGridImageAdapter extends _CommonGridImageAdapter {
    public _NumberGridImageAdapter(Context context) {
        super(context);
    }

    @Override
    protected int getCountForTotalObjects() {
        return 10;
    }

    @Override
    protected String getImageResourceURI(int position) {
        return "image_" + position;
    }
}
