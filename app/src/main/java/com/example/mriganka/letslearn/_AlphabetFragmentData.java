package com.example.mriganka.letslearn;

import android.app.Activity;
import android.content.res.Resources;

/**
 * Created by mriganka on 6/1/15.
 */
public class _AlphabetFragmentData extends _FragmentData {
    public _AlphabetFragmentData(int position, Resources res, Activity activity) {
        super(position, res, activity);
    }

    @Override
    protected String getAudioSourceURI() {
        char alphabet = (char) ('a' + position);
        return "audio_" + alphabet;
    }

    @Override
    protected String getImageSourceURI() {
        char alphabet = (char) ('a' + position);
        return "image_" + alphabet;
    }
}
