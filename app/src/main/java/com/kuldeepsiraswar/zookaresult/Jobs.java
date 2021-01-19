package com.kuldeepsiraswar.zookaresult;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.kuldeepsiraswar.zookaresult.Jobs_Tab.All_Jobs;
import com.kuldeepsiraswar.zookaresult.Jobs_Tab.BANK;
import com.kuldeepsiraswar.zookaresult.Jobs_Tab.ENGINEERING;
import com.kuldeepsiraswar.zookaresult.Jobs_Tab.POLICEANDDEFENCE;
import com.kuldeepsiraswar.zookaresult.Jobs_Tab.RAILWAY;
import com.kuldeepsiraswar.zookaresult.Jobs_Tab.SSC;
import com.kuldeepsiraswar.zookaresult.Jobs_Tab.TEACHING;
import com.kuldeepsiraswar.zookaresult.Jobs_Tab.UPSC;

import org.jetbrains.annotations.NotNull;


public class Jobs extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.new_jobs_nested_tab, container, false);
        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.container_main);
        SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(getChildFragmentManager());
        mViewPager.setAdapter(mSectionsPagerAdapter);

        return view;

    }


    private static class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @NotNull
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return All_Jobs.newInstance(1);
                case 1:
                    return SSC.newInstance(4);
                case 2:
                    return BANK.newInstance(2);
                case 3:
                    return RAILWAY.newInstance(3);
                case 4:
                    return TEACHING.newInstance(5);
                case 5:
                    return POLICEANDDEFENCE.newInstance(6);
                case 6:
                    return UPSC.newInstance(7);
                case 7:
                    return ENGINEERING.newInstance(8);
                default:
                    return All_Jobs.newInstance(9);
            }

        }

        @Override
        public int getCount() {
            // Show 4 total pages.
            return 8;
        }

        @Override
        public CharSequence getPageTitle(int position) {

            switch (position) {
                case 0:
                    return "ALL JOBS";
                case 1:
                    return "SSC";
                case 2:
                    return "BANK";
                case 3:
                    return "RAILWAY";
                case 4:
                    return "TEACHING";
                case 5:
                    return "POLICE & DEFENCE";
                case 6:
                    return "UPSC";
                case 7:
                    return "ENGINEERING";
            }

            return null;
        }
    }

}