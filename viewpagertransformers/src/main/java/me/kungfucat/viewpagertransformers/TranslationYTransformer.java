package me.kungfucat.viewpagertransformers;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.View;

// setTranslationY changes the Y coordinate according to the parameter passed
// This parameter is measured from the top of the screen
// So at the top of the screen this value=0
// And the bottom of the screen is = page height


// When going to the page on the right, the value of position parameter changes from 1 to 0
// So when we swipe right, if we want the page to go from bottom to top of the screen
// We need to pass the height varying from page height to 0
// This can be easily calculated using position*pageheight

public class TranslationYTransformer implements ViewPager.PageTransformer {
    public static final int TOP_TO_BOTTOM = 1, BOTTOM_TO_TOP = 2;
    public int ANIMATE_TYPE = 2;

    public TranslationYTransformer(){

    }

    public TranslationYTransformer(int ANIMATE_TYPE) {
        this.ANIMATE_TYPE = ANIMATE_TYPE;
    }

    @Override
    public void transformPage(@NonNull View page, float position) {

        int width = page.getWidth(), height = page.getHeight();

        if (position <= 0) {
            // This page is way off-screen to the left.
            page.setTranslationX(0);
        } else if (position <= 1) {
//            Log.d("POSITION", position * height + "!!");
            if (ANIMATE_TYPE == TOP_TO_BOTTOM) {
                page.setTranslationY(-position * (height));
            } else if (ANIMATE_TYPE == BOTTOM_TO_TOP) {
                page.setTranslationY(position * (height));
            }
        } else {
            // This page is way off-screen to the right.
            page.setTranslationX(0);

        }
    }
}
