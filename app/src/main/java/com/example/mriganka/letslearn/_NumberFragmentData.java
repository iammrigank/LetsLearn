package com.example.mriganka.letslearn;

import android.app.Activity;
import android.content.res.Resources;

/**
 * Created by mriganka on 6/1/15.
 */
public class _NumberFragmentData extends _FragmentData {


    public _NumberFragmentData(int position, Resources res, Activity activity) {
        super(position, res, activity);
    }

    protected String getAudioSourceURI() {
        return "audio_" + position;
    }

    protected String getImageSourceURI() {
        return "image_" + position;
    }
}
