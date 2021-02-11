package com.geektech.homework666;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;

import Title.Exchange;

public class MainActivity extends AppCompatActivity {


    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.viewpager);

        setViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }


    private void setViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Exchange(), "Exchange");
        adapter.addFragment(new DateTime(), "Date&Time");
        adapter.addFragment(new More(), "More");
        viewPager.setAdapter(adapter);

    }
}