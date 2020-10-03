package com.alisha.takeawayapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.alisha.takeawayapp.bottomNavItems.HomeFragment;
import com.alisha.takeawayapp.bottomNavItems.OrderFragment;
import com.alisha.takeawayapp.bottomNavItems.ProfileFragement;
import com.alisha.takeawayapp.bottomNavItems.SettingFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_main);
        bottomNavigation = findViewById(R.id.navigation);
        bottomNavigation.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        openFragment(new HomeFragment());
    }
    BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.navigation_home:
                            System.out.println("dssndj");
                            openFragment(new HomeFragment());
                            return true;
                        case R.id.navigation_order:
                            openFragment(new OrderFragment());
                            return true;
                        case R.id.navigation_setting:
                            openFragment(new SettingFragment());
                            return true;
                        case R.id.navigation_profile:
                            openFragment(new ProfileFragement());
                            return true;
                    }
                    return false;
                }

            };

    public void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}