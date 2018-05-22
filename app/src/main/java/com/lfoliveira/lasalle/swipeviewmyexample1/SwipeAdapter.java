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

        if (position == 0){
            return new RedFragment();
        } else if (position == 1){
            return new BlueFragment();
        }
        return new GreenFragment();

    }

    @Override
    public int getCount() {
        return 3;
    }
}
