package com.lfoliveira.lasalle.swipeviewmyexample1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class SwipeAdapter extends FragmentStatePagerAdapter {


    //create the constructor
    public SwipeAdapter (FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new NumberFragment();

        Bundle args = new Bundle();
        args.putInt("number", position + 1);
        fragment.setArguments(args);

        return  fragment;


    }

    @Override
    public int getCount() {
        return 3;
    }
}
