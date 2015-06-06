package com.example.mriganka.letslearn;


import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class SubAlphabetFragment extends Fragment {

    public static final String EXAMPLE_IMAGE_SOURCE = "example_image_src";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflatedView = inflater.inflate(
                R.layout.fragment_sub_alphabet, container, false);

        constructLayout(inflatedView);
        return inflatedView;
    }

    public interface OnActiveFragmentListener {
        public void onActiveFragment();
    }


    private void constructLayout(View inflatedView) {
        ImageView iv = (ImageView) inflatedView.findViewById(R.id.example_image);
        // From bundle we will get the source of the image and other info
        String imageSource = getArguments().getString(EXAMPLE_IMAGE_SOURCE);
        if(imageSource == null || imageSource.isEmpty())
            throw new IllegalArgumentException("Image source for example-image is null or empty");

        setImageFromImageSource(iv, imageSource);
    }

    private void setImageFromImageSource(ImageView iv, String imageSource) {
        Resources res = getResources();
        int imageId = res.getIdentifier(imageSource, "drawable", getActivity().getPackageName());
        System.err.println(imageSource + " : " + imageId);
        Drawable drawable = res.getDrawable(imageId);
        iv.setImageDrawable(drawable);
    }
}
