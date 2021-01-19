package com.kuldeepsiraswar.zookaresult;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.kuldeepsiraswar.zookaresult.NotificationTab.LastDate;
import com.kuldeepsiraswar.zookaresult.NotificationTab.Upcoming;


public class Notification extends Fragment  {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.notification_nested_tab, container, false);
        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.container_main);
        SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(getChildFragmentManager());
        mViewPager.setAdapter(mSectionsPagerAdapter);

        return view;

    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setTitle("Notification");
    }

    private class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return Upcoming.newInstance(1);
                case 1:
                    return LastDate.newInstance(2);
                default:
                    return Upcoming.newInstance(1);
            }

        }

        @Override
        public int getCount() {
            // Show 4 total pages.
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {

            switch (position) {
                case 0:
                    return "Upcomming";
                case 1:
                    return "Last Date Form";
            }

            return null;
        }
    }
}