package com.alisha.takeawayapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.alisha.takeawayapp.tabs.Tab1Fragment;
import com.alisha.takeawayapp.tabs.Tab2Fragment;
import com.alisha.takeawayapp.tabs.Tab3Fragment;
import com.alisha.takeawayapp.tabs.Top3Fragment;
import com.alisha.takeawayapp.tabs.TopTab2Fragment;
import com.alisha.takeawayapp.tabs.TopTabFragment;
import com.google.android.material.tabs.TabLayout;

public class SignupSigninActivity extends AppCompatActivity {
    private TabAdapter adapter1, adapter2;
    private TabLayout tabLayout;
    private ViewPager viewPager1, viewPager2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_signin);
        getSupportActionBar().hide();
        viewPager1 = (ViewPager) findViewById(R.id.viewPager1);
        viewPager2 = (ViewPager) findViewById(R.id.viewPager2);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

//        adapter1 = new TabAdapter(getSupportFragmentManager());
//        adapter1.addTopFragemnt(new TopTabFragment());
//        adapter1.addTopFragemnt(new TopTab2Fragment());
//        adapter1.addTopFragemnt(new Top3Fragment());

        adapter2 = new TabAdapter(getSupportFragmentManager());
        adapter2.addFragment(new Tab1Fragment(), "Tab 1");
        adapter2.addFragment(new Tab2Fragment(), "Tab 2");
        adapter2.addFragment(new Tab3Fragment(), "Tab 3");
        viewPager2.setAdapter(adapter2);
        tabLayout.setupWithViewPager(viewPager2);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                System.out.println("jndkjdssn");
//                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
}
}