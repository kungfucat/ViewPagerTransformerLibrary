package me.kungfucat.viewpagertransformers;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.View;

// For the incoming page,
// 1. x should start from distance width and move towards left
// 2. y should start from height/2 and increase further
// For this page, value of position decrease from 1 to 0,
// For width : When position = 1, we want it to be towards the right of screen, and when it is 0, we want it towards left of screen, i.e final value
// For height : When position = 1, we want it to have a height of height/2 and when 0, should be = height, i.e final value
// It is clear that in this case, height and width should be scaled according to 1-position, keeping pivots in mind
// The final values will be achieved, we just specify the way to get there with setScale functions

// Same logic can be applied for the page leaving the screen
public class ScaleTransformer implements ViewPager.PageTransformer {
    @Override
    public void transformPage(@NonNull View page, float position) {

        int width = page.getWidth(), height = page.getHeight();

        if (position < 0) {
            page.setPivotX(0);
            page.setPivotY(height / 2);
            float scaleToSet = 1f + position;
            page.setScaleX(scaleToSet);
            page.setScaleY(scaleToSet);
        } else if (position <= 1) {
            float scaleToSet = 1f - position;
            page.setPivotX(width);
            page.setPivotY(height / 2);
            page.setScaleX(scaleToSet);
            page.setScaleY(scaleToSet);
        } else {
        }
    }
}
