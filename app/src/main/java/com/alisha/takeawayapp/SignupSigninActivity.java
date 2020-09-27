package com.alisha.takeawayapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.alisha.takeawayapp.tabs.FirstSignUp;
import com.alisha.takeawayapp.tabs.Tab1Fragment;
import com.google.android.material.tabs.TabLayout;

public class SignupSigninActivity extends AppCompatActivity {
    private TabAdapter adapter1, adapter2;
    private TabLayout tabLayout;
    private ViewPager viewPager2;
    Toolbar top_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_signin);
        getSupportActionBar().hide();
        viewPager2 = (ViewPager) findViewById(R.id.viewPager2);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        top_img = findViewById(R.id.toolbar_img);

        adapter2 = new TabAdapter(getSupportFragmentManager());
        adapter2.addFragment(new Tab1Fragment(), "Sign In");
        adapter2.addFragment(new FirstSignUp(), "Sign Up");
//        adapter2.addFragment(new Tab3Fragment(), "Tab 3");
        viewPager2.setAdapter(adapter2);
        tabLayout.setupWithViewPager(viewPager2);
        top_img.setBackgroundResource(R.drawable.img_sign_in);

        viewPager2.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                if (i == 1)
                    top_img.setBackgroundResource(R.drawable.img_sign);
                else
                    top_img.setBackgroundResource(R.drawable.img_sign_in);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

    }
}