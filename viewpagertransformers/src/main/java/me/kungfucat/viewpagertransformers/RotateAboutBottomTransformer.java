package me.kungfucat.viewpagertransformers;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.View;

public class RotateAboutBottomTransformer implements ViewPager.PageTransformer {
    @Override
    public void transformPage(@NonNull View page, float position) {

        final float width = page.getWidth(), height = page.getHeight();

//        Rotate about centre bottom part
        page.setPivotX(width / 2);
        page.setPivotY(height);
//        Rotate 20 degrees in anticlockwise
//        If want to rotate clockwise, use negative sign
        page.setRotation(position * 20);

    }
}
