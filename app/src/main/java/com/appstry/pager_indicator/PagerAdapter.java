package com.appstry.pager_indicator;

/**
 * Created by RAHUL CHAUDHARY on 11/5/2016.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter{
    private int[] offerImages = {
            R.drawable.car_1,
            R.drawable.car_2,
            R.drawable.car_3,
            R.drawable.car_4
    };

    private int mCount = offerImages.length;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new TestFragment(offerImages[position]);
    }

    @Override
    public int getCount() {
        return mCount;
    }

    public void setCount(int count) {
        if (count > 0 && count <= 10) {
            mCount = count;
 //           notifyDataSetChanged();
        }
    }
}