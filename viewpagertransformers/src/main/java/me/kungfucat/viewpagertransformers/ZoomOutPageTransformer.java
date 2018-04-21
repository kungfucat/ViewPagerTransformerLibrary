package me.kungfucat.viewpagertransformers;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.View;

public class ZoomOutPageTransformer implements ViewPager.PageTransformer {
    private static final float MIN_SCALE = 0.85f;
    private static final float MIN_ALPHA = 0.5f;

    public boolean isFadeEnabled = true;

    public ZoomOutPageTransformer() {

    }

    public ZoomOutPageTransformer(boolean isFadeEnabled) {
        this.isFadeEnabled = isFadeEnabled;
    }

    @Override
    public void transformPage(@NonNull View page, float position) {
        int width = page.getWidth();
        int height = page.getHeight();

        if (position < -1) {
            page.setAlpha(0);

        } else if (position <= 1) {
            // Modify the default slide transition to shrink the page as well
            float scaleFactor = Math.max(MIN_SCALE, 1 - Math.abs(position));
            float vertMargin = height * (1 - scaleFactor) / 2;
            float horzMargin = width * (1 - scaleFactor) / 2;
            if (position < 0) {
                page.setTranslationX(horzMargin - vertMargin / 2);
            } else {
                page.setTranslationX(-horzMargin + vertMargin / 2);
            }
            // Scale the page down (between MIN_SCALE and 1)
            page.setScaleX(scaleFactor);
            page.setScaleY(scaleFactor);

            if (isFadeEnabled) {
                // Fade the page relative to its size.
                page.setAlpha(MIN_ALPHA +
                        (scaleFactor - MIN_SCALE) /
                                (1 - MIN_SCALE) * (1 - MIN_ALPHA));
            }
        } else {
            page.setAlpha(0);
        }
    }
}