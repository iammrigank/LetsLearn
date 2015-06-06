package com.example.mriganka.letslearn;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;

/**
 * Created by mriganka on 6/1/15.
 */
public abstract class _FragmentData {

    int position;
    Drawable imageDrawable;
    MediaPlayer mediaForFragment;
    final Activity attachedActivity;
    final Resources activityResources;

    public _FragmentData(int position,
                         Resources res,
                         Activity activity) {
        this.position = position;
        this.attachedActivity = activity;
        this.activityResources = res;

        // Initialize all the data needed.
        setMedia();
        setImageDrawable();
    }

    public MediaPlayer getMedia() {
        return mediaForFragment;
    }

    public Drawable getImageDrawable() {
        return imageDrawable;
    }


    protected abstract String getAudioSourceURI();
    protected abstract String getImageSourceURI();

    private void setMedia() {
        mediaForFragment = MediaPlayer.create(attachedActivity, getMediaId());
    }

    private int getMediaId() {System.err.println("---------->" + getAudioSourceURI());
        return activityResources.getIdentifier(
                getAudioSourceURI(),
                "raw",
                attachedActivity.getPackageName());
    }

    private void setImageDrawable() {System.err.println("---------->  " + getImageId());
        imageDrawable = activityResources.getDrawable(getImageId());
    }

    private int getImageId() {System.err.println("---------->  " + getImageSourceURI());
        return  activityResources.getIdentifier(
                getImageSourceURI(),
                "drawable",
                attachedActivity.getPackageName());
    }
}
