package com.example.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements Callback{

    private FragmentTransaction mFragmentTransaction;

    private FragmentManager mFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFragmentManager = getFragmentManager();

        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.fragment_container, new FragmentOne());
        mFragmentTransaction.commit();
    }

    @Override
    public void onClickEvent(int id) {
        mFragmentTransaction = mFragmentManager.beginTransaction();

        Fragment result = null;
        switch(id){
            case R.id.buttonOne:
                result = new FragmentTwo();
                break;
            case R.id.buttonTwo:
                result = new FragmentOne();
                break;
        }
        mFragmentTransaction.replace(R.id.fragment_container, result);
        mFragmentTransaction.addToBackStack(null);
        mFragmentTransaction.commit();
    }
}
