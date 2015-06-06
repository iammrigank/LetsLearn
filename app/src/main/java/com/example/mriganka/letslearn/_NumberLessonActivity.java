package com.example.mriganka.letslearn;

import android.content.Intent;


public class _NumberLessonActivity extends _CommonLessonActivity {

    @Override
    protected int getSwipeButtonResourceId() {
        return R.id.swipe_number_button;
    }

    @Override
    protected _CommonGridImageAdapter getAdapterForGridView() {
        return new _NumberGridImageAdapter(this);
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_number_lesson;
    }

    @Override
    protected void startLesson() {
        startActivity(new Intent(this, _NumberPagerActivity.class));
    }
}
