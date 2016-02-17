package com.example.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentTwo extends AbstractFragment {

    @Override
    protected int getLayout() {
        return R.layout.fragment_two_layout;
    }

    @Override
    protected int getButton() {
        return R.id.buttonTwo;
    }
}
