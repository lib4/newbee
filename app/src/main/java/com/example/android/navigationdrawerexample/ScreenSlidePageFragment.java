package com.example.android.navigationdrawerexample;

import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by anasabubacker on 27/08/2015.
 */
public class ScreenSlidePageFragment  extends Fragment {

    private int position;
    private ImageView image;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_screen_slide_page, container, false);

        image = (ImageView)rootView.findViewById(R.id.image);

        int imageId = 0;


        switch(position) {
            case 0:
                imageId = R.drawable.personal_information;
                break;
            case 1:
                imageId = R.drawable.personal_development;
                break;
            case 2:
                imageId = R.drawable.company_guide;
                break;
            case 3:
                imageId = R.drawable.payroll;
                break;
            case 4:
                imageId = R.drawable.coworkers;
                break;

        }

        image.setImageResource(imageId);


        return rootView;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
