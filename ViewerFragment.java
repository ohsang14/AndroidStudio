package com.example.mygallery;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ViewerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ViewerFragment extends Fragment {
    ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_viewer, container, false);

        imageView = rootView.findViewById(R.id.imageView);
        return rootView;
    }
    public void setImage(int resId){
        System.out.println(resId);
        imageView.setImageResource(resId);
    }
}