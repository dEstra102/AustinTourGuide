package com.example.sp4.austintourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter{

    private Context context;

    public FragmentAdapter(Context context, FragmentManager fragMan) {
        super(fragMan);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0 ){
            return new HistoricFragment();
        } else if (position == 1){
            return new FoodFragment();
        } else if (position == 2){
            return new AttractionsFragment();
        } else {
            return new FestivalFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position){
        if (position == 0){
            return context.getString(R.string.title_historic);
        } else if (position == 1){
            return context.getString(R.string.title_food);
        } else if (position == 2){
            return context.getString(R.string.title_attractions);
        } else {
            return context.getString(R.string.title_festivals);
        }
    }
}
