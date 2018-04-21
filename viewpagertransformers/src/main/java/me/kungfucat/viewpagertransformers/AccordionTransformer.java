package me.kungfucat.viewpagertransformers;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.View;

public class AccordionTransformer implements ViewPager.PageTransformer {
    @Override
    public void transformPage(@NonNull View page, float position) {
        int width = page.getWidth(), height = page.getHeight();

        if (position < -1) {
            page.setScaleX(0);
        } else if (position < 0) {
//            For the page going off screen,
//            start from the right side of the page
//            and scale it down
            float scale = 1 + position;
            page.setPivotX(width);
            page.setScaleX(scale);
        } else if (position < 1) {
//            For the page enetering the scene,
//            for the left side, set pivot, i.e. initial value=0, and expand from there
            float scale = 1 - position;
            page.setPivotX(0);
            page.setScaleX(scale);
        } else {
            page.setScaleX(0);
        }
    }
}
