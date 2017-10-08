package ua.sertox.football.Team;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Locale;

import ua.sertox.football.R;

public class Odder extends AppCompatActivity {
    private SectionsPagerAdapter OdderSectionsPagerAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odder);

        OdderSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(OdderSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }


    public static class SquadFragment extends Fragment {

        public SquadFragment() {
        }

        public static SquadFragment newInstance() {
            SquadFragment squadFragment = new SquadFragment();
            return squadFragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_squad, container, false);
            return rootView;
        }
    }

    public static class RivalsFragment extends Fragment {

        public RivalsFragment() {
        }

        public static RivalsFragment newInstance() {
            RivalsFragment rivalsFragment = new RivalsFragment();
            return rivalsFragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_rivals, container, false);
            return rootView;
        }
    }

    public static class ChempFragment extends Fragment {

        public ChempFragment() {
        }

        public static ChempFragment newInstance() {
            ChempFragment chempFragment = new ChempFragment();
            return chempFragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_chemp, container, false);
            return rootView;
        }
    }

    public static class TrainingFragment extends Fragment {

        public TrainingFragment() {
        }

        public static TrainingFragment newInstance() {
            TrainingFragment trainingFragment = new TrainingFragment();
            return trainingFragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_training, container, false);
            return rootView;
        }
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch(position){
                case 0:
                    return SquadFragment.newInstance();
                case 1:
                    return RivalsFragment.newInstance();
                case 2:
                    return ChempFragment.newInstance();
                case 3:
                    return TrainingFragment.newInstance();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0:
                    return getString(R.string.squad).toUpperCase(l);
                case 1:
                    return getString(R.string.rivals).toUpperCase(l);
                case 2:
                    return getString(R.string.chemp).toUpperCase(l);
                case 3:
                    return getString(R.string.training).toUpperCase(l);
            }
            return null;
        }
    }
}
