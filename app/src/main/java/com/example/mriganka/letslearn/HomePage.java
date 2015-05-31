package com.example.mriganka.letslearn;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

public class HomePage extends ActionBarActivity {

    Handler handlerTimer = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        // Showing the splash screen for 2-3 seconds
        final View splashLayout = (RelativeLayout) findViewById(R.id.splashLayout);
        splashLayout.bringToFront();
        final Animation fadeOutAnim = AnimationUtils.loadAnimation(HomePage.this, R.anim.splash_fadeout);
        handlerTimer.postDelayed(new Runnable() {
            public void run() {
                splashLayout.startAnimation(fadeOutAnim);
                splashLayout.setVisibility(View.GONE);
            }
        }, 3000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lesson_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void startLessonActivity(View view) {
        Intent lessonTypeIntent;

        int buttonClicked = view.getId();
        switch(buttonClicked) {
            case R.id.button_learn_alphabets:
                // start that intent
                lessonTypeIntent = new Intent(this, LearnAlphaNumActivity.class);
                lessonTypeIntent.putExtra("alphabet",true);
                break;
            case R.id.button_learn_numbers:
                //start numbers wala intent
                lessonTypeIntent = new Intent(this, LearnAlphaNumActivity.class);
                lessonTypeIntent.putExtra("alphabet",false);
                break;
            case R.id.button_quiz:
                // start quiz wala intent
                lessonTypeIntent = new Intent(this, QuizActivity.class);
                break;
            default:
                lessonTypeIntent = new Intent(this, HomePage.class);
        }

        // Starting that new Activity now
        startActivity(lessonTypeIntent);
    }
}
