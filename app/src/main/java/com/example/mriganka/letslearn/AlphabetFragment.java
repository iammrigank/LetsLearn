package com.example.mriganka.letslearn;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mriganka on 5/10/15.
 */
public class AlphabetFragment extends Fragment {
    public static final String alphabetKey = "alphabet";
    public static final String alphabetImageSource = "src";

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(
                R.layout.fragment_learn_alphabets, container, false);

        Bundle args = getArguments();
        TextView tv = (TextView) rootView.findViewById(R.id.alphabet_name);
        tv.setText(Character.toString(args.getChar(alphabetKey)));

        ImageView iv = (ImageView) rootView.findViewById(R.id.alphabet_image);
        String imageName = args.getString(alphabetImageSource);

        Resources res = getResources();
        int imageId = res.getIdentifier(imageName, "drawable", getActivity().getPackageName());
        Drawable drawable = res.getDrawable(imageId);
        iv.setImageDrawable(drawable);

        return rootView;
    }
}
