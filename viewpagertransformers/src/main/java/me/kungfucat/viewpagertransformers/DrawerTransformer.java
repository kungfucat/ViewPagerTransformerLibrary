package me.kungfucat.viewpagertransformers;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.View;

public class DrawerTransformer implements ViewPager.PageTransformer {
    @Override
    public void transformPage(@NonNull View page, float position) {
        int width = page.getWidth();

        if (position < -1) {
            page.setTranslationX(0);
        } else if (position > 0 && position <= 1) {
            page.setTranslationX(-width/2 * position);
        } else {
            page.setTranslationX(0);
        }
    }
}
