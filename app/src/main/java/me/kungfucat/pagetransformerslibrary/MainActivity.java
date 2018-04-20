package me.kungfucat.pagetransformerslibrary;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

import me.kungfucat.viewpagertransformers.RandomTransformer;
import me.kungfucat.viewpagertransformers.ScaleTransformer;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    ArrayList<Integer> colorArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);

        colorArrayList = new ArrayList<>();
        colorArrayList.add(Color.parseColor("#E53935"));
        colorArrayList.add(Color.parseColor("#000000"));
        colorArrayList.add(Color.parseColor("#7B1FA2"));
        colorArrayList.add(Color.parseColor("#F4511E"));
        colorArrayList.add(Color.parseColor("#43A047"));

        ViewPagerAdapter pagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), colorArrayList);
        viewPager.setAdapter(pagerAdapter);


//        viewPager.setPageTransformer(true, new DefaultTransformer());
//        viewPager.setPageTransformer(true, new TranslationYTransformer(TranslationYTransformer.TOP_TO_BOTTOM));
//        viewPager.setPageTransformer(true,new CubeOutTransformer());
        viewPager.setPageTransformer(true, new RandomTransformer());
    }


    class ViewPagerAdapter extends FragmentPagerAdapter {

        ArrayList<Integer> arrayList;

        public ViewPagerAdapter(FragmentManager fm, ArrayList<Integer> arrayList) {
            super(fm);
            this.arrayList = arrayList;
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            if (position < arrayList.size()) {
                fragment = ViewPagerFragment.newInstance(arrayList.get(position), position);
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return arrayList.size();
        }
    }
}


