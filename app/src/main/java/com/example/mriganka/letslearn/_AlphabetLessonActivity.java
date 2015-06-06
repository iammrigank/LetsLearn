package com.example.mriganka.letslearn;

import android.content.Intent;


public class _AlphabetLessonActivity extends _CommonLessonActivity {
    
    @Override
    protected int getSwipeButtonResourceId() {
        return R.id.swipe_alphabet_button;
    }

    @Override
    protected _CommonGridImageAdapter getAdapterForGridView() {
        return new _AlphabetGridImageAdapter(this);
    }

    // From BaseLessonActivity
    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_alphabet_lesson;
    }

    @Override
    protected void startLesson() {
        startActivity(new Intent(this, _AlphabetPagerActivity.class));
    }
}
