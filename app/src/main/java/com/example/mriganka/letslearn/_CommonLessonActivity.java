package com.example.mriganka.letslearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

public abstract class _CommonLessonActivity extends AppCompatActivity {
    protected abstract int getLayoutResourceId();
    protected abstract void startLesson();
    protected abstract int getSwipeButtonResourceId();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResourceId());

        setListenerForSwipeButton(getSwipeButtonResourceId());
        setListenersForFooterElements();

        // Grid
        setUpTheGridView();
    }

    private void setUpTheGridView() {
        GridView gridView = (GridView) findViewById(R.id.shared_grid_view);
        gridView.setAdapter(getAdapterForGridView());

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(_CommonLessonActivity.this, "" + position,
                        Toast.LENGTH_SHORT).show();

            }
        });
    }

    protected abstract _CommonGridImageAdapter getAdapterForGridView();

    private void setListenerForSwipeButton(int swipeButtonId) {
        Button swipe = (Button) findViewById(swipeButtonId);
        swipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startLesson();
            }
        });
    }

    protected void setListenersForFooterElements() {
        Button home = (Button) findViewById(R.id.button_take_me_home_lesson_activity);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToHome();
            }
        });

        Button quiz = (Button) findViewById(R.id.button_start_quiz_lesson_activity);
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToQuiz();
            }
        });
    }

    protected void goToHome() {
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }

    protected void goToQuiz() {
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }
}
