package com.example.mygallery;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListFragment extends Fragment implements View.OnClickListener {

    public interface ImageSelectedCallback {
        public void setImageSeclected(int index);
    }

    ImageSelectedCallback imageSelectedCallback;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof ImageSelectedCallback)
            imageSelectedCallback = (ImageSelectedCallback) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.fragment_list, container, false);
        Button firstButton = rootview.findViewById(R.id.button);
        Button secondButton = rootview.findViewById(R.id.button2);
        Button thirdButton = rootview.findViewById(R.id.button3);
        firstButton.setOnClickListener(this);
        secondButton.setOnClickListener(this);
        thirdButton.setOnClickListener(this);

        return rootview;
    }

    @Override
    public void onClick(View view) {
//        MainActivity mainActivity = (MainActivity) getContext();
//        mainActivity.setImageSeclected(0);
        int id = view.getId();
//        imageSelectedCallback.setImageSeclected(0);

        if (id == R.id.button)
            imageSelectedCallback.setImageSeclected(0);
        else if (id == R.id.button2)
            imageSelectedCallback.setImageSeclected(1);
        else if (id == R.id.button3)
            imageSelectedCallback.setImageSeclected(2);
    }
}