package ua.sertox.football;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class TemplateTeamActivity extends AppCompatActivity {

    TextView templateTeamName;
    TextView chemp;
    TextView skillTeam;
    TextView skillTeamScore;
    TextView costTeam;
    TextView costaTeamScore;
    TextView moneyTeam;
    TextView moneyTeamScore;
    TextView nextRival;
    TextView nextRivalTeam;
    Button btnSend;

    private SectionsPagerAdapter DynamoSectionsPagerAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template_team);

        templateTeamName = (TextView) findViewById(R.id.dynamo);
        chemp = (TextView) findViewById(R.id.chemp);
        skillTeam = (TextView) findViewById(R.id.skillTeam);
        skillTeamScore = (TextView) findViewById(R.id.skillTeamScore);
        costTeam = (TextView) findViewById(R.id.costTeam);
        costaTeamScore = (TextView) findViewById(R.id.costTeamScore);
        moneyTeam = (TextView) findViewById(R.id.moneyTeam);
        moneyTeamScore = (TextView) findViewById(R.id.moneyTeamScore);
        nextRival = (TextView) findViewById(R.id.nextRival);
        nextRivalTeam= (TextView) findViewById(R.id.nextRivalTeam);

        btnSend = (Button) findViewById(R.id.btnSend);

        templateTeamName.setText(R.string.dynamo);
        chemp.setText(R.string.chemp);
        skillTeam.setText(R.string.skillTeam);
        costTeam.setText(R.string.costTeam);
        moneyTeam.setText(R.string.moneyTeam);
        nextRival.setText(R.string.nextRival);

        btnSend.setText(R.string.send);

        DynamoSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(DynamoSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }
    public static class SquadFragment extends Fragment {

        public SquadFragment() {
        }

        public static SquadFragment newInstance(int sectionNumber) {
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

        public static RivalsFragment newInstance(int sectionNumber3) {
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

        public static ChempFragment newInstance(int sectionNumber3) {
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

        public static TrainingFragment newInstance(int sectionNumber3) {
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
                    return SquadFragment.newInstance(0);
                case 1:
                    return RivalsFragment.newInstance(1);
                case 2:
                    return ChempFragment.newInstance(2);
                case 3:
                    return TrainingFragment.newInstance(3);
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
