package com.kuldeepsiraswar.zookaresult;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.kuldeepsiraswar.zookaresult.ResultTab.AllResult;
import com.kuldeepsiraswar.zookaresult.ResultTab.BoardResult;
import com.kuldeepsiraswar.zookaresult.ResultTab.UniversityResult;


public class Result extends Fragment  {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.result_nested_tab, container, false);
        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.container_main);
        SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(getChildFragmentManager());
        mViewPager.setAdapter(mSectionsPagerAdapter);

        return view;

    }


    private class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return AllResult.newInstance(1);
                case 1:
                    return UniversityResult.newInstance(2);
                case 2:
                    return BoardResult.newInstance(3);
                default:
                    return AllResult.newInstance(1);
            }

        }

        @Override
        public int getCount() {
            // Show 4 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {

            switch (position) {
                case 0:
                    return "All Result";
                case 1:
                    return "University";
                case 2:
                    return "Board";

            }

            return null;
        }
    }
}