package me.kungfucat.viewpagertransformers;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.View;

public class RaiseFromCenterTransformer implements ViewPager.PageTransformer {
    @Override
    public void transformPage(@NonNull View page, float position) {
        int width = page.getWidth(), height = page.getHeight();

        if (position < -1) {
            page.setTranslationX(0);
        } else if (position < 0) {

            float scale = 1 + position;
            page.setPivotX(width/2);
            page.setPivotY(height/2);
            page.setScaleY(scale);
            page.setScaleX(scale);
//            Counteract the default motion
            page.setTranslationX(-position*width);
        } else if (position < 1) {
            float scale = 1 - position;
            page.setPivotX(width/2);
            page.setPivotY(height/2);
            page.setScaleY(scale);
            page.setScaleX(scale);
//            Counteract the default motion
            page.setTranslationX(-width * position);

        } else {
            page.setTranslationX(0);
        }
    }
}
