package com.example.odstask;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class VPAdapter extends FragmentPagerAdapter {

    Context context;
    int totalTabs;

    public VPAdapter(@NonNull FragmentManager fm,Context context,int totalTabs) {
        super(fm);
        this.context=context;
        this.totalTabs=totalTabs;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                Fragment1 fragment1 = new Fragment1();
                return  fragment1;

            case 1:
                Fragment2 fragment2 = new Fragment2();
                return fragment2;

            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return totalTabs;
    }


//    private final ArrayList<Fragment> fragmentArrayList = new ArrayList<>();
//    private final ArrayList<String> fragmentTitle = new ArrayList<>();
//
//    public VPAdapter(@NonNull FragmentManager fm, int behavior) {
//        super(fm, behavior);
//    }
//
//    @NonNull
//    @Override
//    public Fragment getItem(int position) {
//
//        return fragmentArrayList.get(position);
//    }
//
//    @Override
//    public int getCount() {
//        return fragmentArrayList.size();
//    }
//
//    public void addFragment(Fragment fragment, String title){
//
//        fragmentArrayList.add(fragment);
//        fragmentTitle.add(title);
//    }
//
//    @Nullable
//    @Override
//    public CharSequence getPageTitle(int position) {
//
//        return fragmentTitle.get(position);
//    }
}
