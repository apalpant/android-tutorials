package com.example.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentOne extends Fragment {

    private Callback callback;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.callback = (Callback) activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one_layout, container, false);
        Button buttonOne = (Button) view.findViewById(R.id.buttonOne);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                callback.onButtonClick(R.id.buttonOne);
            }
        });
        return view;
    }

}
