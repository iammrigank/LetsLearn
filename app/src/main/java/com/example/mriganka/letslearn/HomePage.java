package com.example.mriganka.letslearn;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.HashMap;
import java.util.Map;

public class HomePage extends AppCompatActivity {

    Handler handlerTimer = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        animateSplashScreen();
        initiateButtonListeners();
    }

    private void animateSplashScreen() {
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

    private void initiateButtonListeners() {
        initializeButtonIdToIntentMap();

        Button pressedButton;
        for(final int buttonId : buttonToIntentMap.keySet()) {
            pressedButton = getButtonFromId(buttonId);
            pressedButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(buttonToIntentMap.get(buttonId));
                }
            });
        }
    }

    private void initializeButtonIdToIntentMap() {
        buttonToIntentMap = new HashMap<Integer, Intent>();

        buttonToIntentMap.put(R.id.button_homepage_learn_alphabets,
                new Intent(this, _AlphabetLessonActivity.class));
        buttonToIntentMap.put(R.id.button_homepage_learn_numbers,
                new Intent(this, _NumberLessonActivity.class));
        buttonToIntentMap.put(R.id.button_homepage_quiz,
                new Intent(this, QuizActivity.class));
    }

    private Button getButtonFromId(int buttonId) {
        return (Button) findViewById(buttonId);
    }

    private Map<Integer, Intent> buttonToIntentMap;
}
