package br.senac.sp.tablayoutapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new OneFragment(), "One");
        adapter.addFragment(new TwoFragment(), "Two");
        adapter.addFragment(new ThreeFragment(), "Three");

        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
    }
}
