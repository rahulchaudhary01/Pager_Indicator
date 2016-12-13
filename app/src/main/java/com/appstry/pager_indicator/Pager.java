package com.appstry.pager_indicator;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.viewpagerindicator.CirclePageIndicator;
import com.viewpagerindicator.PageIndicator;

public class Pager extends AppCompatActivity {

    PagerAdapter mAdapter;
    ViewPager mPager;
    PageIndicator mIndicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager);

        mAdapter = new PagerAdapter(getSupportFragmentManager());

        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        CirclePageIndicator indicator = (CirclePageIndicator)findViewById(R.id.indicator);
        mIndicator = indicator;
        indicator.setViewPager(mPager);

        final float density = getResources().getDisplayMetrics().density;
        indicator.setBackgroundColor(0x00000000);
        indicator.setRadius(5 * density);
        indicator.setPageColor(0xFFFFFFFF);
        indicator.setFillColor(0x880000FF);
        indicator.setStrokeColor(0xFF000000);
        indicator.setStrokeWidth(2 * density);
    }
}
