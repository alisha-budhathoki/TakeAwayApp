package com.alisha.takeawayapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.alisha.takeawayapp.tabs.Tab1Fragment;
import com.alisha.takeawayapp.tabs.Tab2Fragment;
import com.alisha.takeawayapp.tabs.Tab3Fragment;
import com.google.android.material.tabs.TabLayout;

public class SignupSigninActivity extends AppCompatActivity {
    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_signin);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment(), "Tab 1");
        adapter.addFragment(new Tab2Fragment(), "Tab 2");
        adapter.addFragment(new Tab3Fragment(), "Tab 3");viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
}
}