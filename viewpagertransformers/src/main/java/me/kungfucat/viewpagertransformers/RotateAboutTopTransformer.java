package me.kungfucat.viewpagertransformers;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.View;

public class RotateAboutTopTransformer implements ViewPager.PageTransformer {

    @Override
    public void transformPage(@NonNull View page, float position) {

        final float width = page.getWidth();

        //Rotate about top centre of screen, i.e pivoted at width/2 and 0
        page.setPivotX(width/2);
        page.setPivotY(0f);
        page.setRotation(-position*20);

    }
}
