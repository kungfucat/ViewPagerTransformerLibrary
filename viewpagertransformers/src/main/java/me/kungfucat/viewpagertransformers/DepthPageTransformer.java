package me.kungfucat.viewpagertransformers;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.View;

public class DepthPageTransformer implements ViewPager.PageTransformer {
    private static final float MIN_SCALE = 0.5f;

    @Override
    public void transformPage(@NonNull View page, float position) {
        int width = page.getWidth(), height = page.getHeight();

        if (position < -1) {
            page.setAlpha(0);
        } else if (position < 0) {
//            Use the Default transformer for the page leaving the screen
        } else if (position <= 1) {
            // Fade the page out
            page.setAlpha(1 - position);

//           Counteract the default Transition
            page.setTranslationX(-width * position);

            // Scale the page down (between MIN_SCALE and 1)
            float scaleFactor = MIN_SCALE
                    + (1 - MIN_SCALE) * (1 - Math.abs(position));
            page.setScaleX(scaleFactor);
            page.setScaleY(scaleFactor);

        } else {
            page.setAlpha(0);
        }

    }
}
