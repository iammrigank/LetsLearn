package com.example.mriganka.letslearn;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by mriganka on 5/10/15.
 */
public abstract class  _CommonLessonFragment extends Fragment {
    public static final String CURRENT_PAGE_POSITION = "position";
    private static final int LAYOUT_TO_BE_INFLATED = R.layout.fragment_lesson_common;

    private View inflatedView;
    private MediaPlayer audioForFragment;

    protected abstract _FragmentData getFragmentDataObject();

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        inflatedView = inflater.inflate(getLayoutResourceId(), container, false);

        _FragmentData fragmentData = getFragmentDataObject();
        setMainImage(fragmentData);
        initializeMedia(fragmentData);
        setOnClickEventsForButtons();
        setAdapterToSubViewPager();

        return inflatedView;
    }

    private void setOnClickEventsForButtons() {
        final Button goToLessonHome = (Button) inflatedView.findViewById(R.id.button_take_me_home_fragment_main);
        goToLessonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToLessonHome();
            }
        });

        final Button speakTheContentOfFragment = (Button) inflatedView.findViewById((R.id.button_speak_fragment_main));
        speakTheContentOfFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speakTheContentOfFragment();
            }
        });

        final Button goToQuiz = (Button) inflatedView.findViewById(R.id.button_start_quiz_fragment_main);
        goToQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToQuiz();
            }
        });
    }

    // Methods for different button events
    protected abstract void goToLessonHome();

    protected abstract int getSubViewPagerResourceId();

    private void speakTheContentOfFragment() {
        audioForFragment.start();System.err.println("I am speaking when pressed");
    }

    protected void goToQuiz() {
        startActivity(new Intent(getActivity(), QuizActivity.class));
    }

    // Methods for setting main image
    private void setMainImage(_FragmentData fragmentData) {
        getImageView().setImageDrawable(fragmentData.getImageDrawable());
    }

    private ImageView getImageView() {
        return (ImageView) inflatedView.findViewById(getImageResourceId());
    }

    protected int getImageResourceId() {
        return R.id.main_picture;
    }

    // Layout that will be inflated.
    protected int getLayoutResourceId() {
        return LAYOUT_TO_BE_INFLATED;
    }

    // About audio...
    private void initializeMedia(_FragmentData fragmentData) {
        audioForFragment = fragmentData.getMedia();
    }

    // Adapter to hold inner PagerView
    private void setAdapterToSubViewPager() {
        getSubViewPager().setAdapter(buildAdapter());
    }

    private ViewPager getSubViewPager() {
        return (ViewPager) inflatedView.findViewById(getSubViewPagerResourceId());
    }

    //TODO: More inheritance here

//    private SubAlphabetPagerAdapter buildAdapter() {
//        return (new SubAlphabetPagerAdapter(getChildFragmentManager()));
//    }

    protected abstract _CommonSubPagerAdapter buildAdapter();

}
