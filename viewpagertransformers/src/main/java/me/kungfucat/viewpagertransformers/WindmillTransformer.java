package me.kungfucat.viewpagertransformers;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.View;

public class WindmillTransformer implements ViewPager.PageTransformer {

    public static final int TOP_LEFT_CORNER = 0, BOTTOM_RIGHT_CORNER = 1;
    public int rotateAbout = 0;

    public WindmillTransformer() {

    }

    public WindmillTransformer(int rotateAbout) {
        this.rotateAbout = rotateAbout;
    }

    @Override
    public void transformPage(@NonNull View page, float position) {

        float width = page.getWidth(), height = page.getHeight();

        if (position < -1) {
            page.setRotation(0);
            page.setAlpha(0);
        } else if (position <= 1) {

//            Log.d("POSITION", position * height + "!!");
            if (rotateAbout == TOP_LEFT_CORNER) {
//                Set Pivot at the top left coordinates, i.e 0,0
                page.setPivotX(0);
                page.setPivotY(0);
//                For the incoming page, rotate 90,
//                for the right page, position goes from 1 to 0
//                So rotation by position*90, negative sign for anticlockwise
                page.setRotation(-position * 90);
//                While rotating also bring the page into focus, so -position*width
                page.setTranslationX(-position * width);
                page.setAlpha(1);
            } else {
                page.setPivotX(width);
                page.setPivotY(height);
                page.setRotation(position * 90);
                page.setTranslationX(-position * width);
                page.setAlpha(1);
            }

        } else {
            page.setRotation(0);
            page.setAlpha(0);
        }

    }
}
