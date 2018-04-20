package me.kungfucat.viewpagertransformers;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.View;

// pivots basically are the central point of the animations
// i.e animations will begin from there,
// so for rotation, for the page leaving, we want it to be rotated about pivotX=width, i.e the right side of that page
// for pivotY we begin from half the height. We can begin from a steeper height and will look like it rises and rotates at the same time
// then we simply rotate the pages as wanted
public class CubeOutTransformer implements ViewPager.PageTransformer {
    public static final float CUBE_ANGLE_45 = 45f, CUBE_ANGLE_60 = 60f, CUBE_ANGLE_90 = 90f;
    public float angleToRotateAt = CUBE_ANGLE_45;

    public CubeOutTransformer() {

    }

    public CubeOutTransformer(float cubeAngle) {
        this.angleToRotateAt = cubeAngle;
    }

    @Override
    public void transformPage(@NonNull View page, float position) {
        int width = page.getWidth();
        int height = page.getHeight();

        if (position <= 0) {
//            If used page.setRotation(0) here, and the right page comes into focus(i.e. swiped left)
//            Then only the right page will be animated(entering the screen) and not the current page (leaving the screen)
//            So here, needed to animate the page leaving the screen
            page.setPivotX(width);
            page.setPivotY(height / 2);
//            page.setRotationY(45f * position);
            page.setRotationY(angleToRotateAt * position);
        } else if (position <= 1) {
//            Log.d("POSITION", position * height + "!!");
            page.setPivotX(0f);
            page.setPivotY(height / 2);
//            page.setRotationY(45f * position);
            page.setRotationY(angleToRotateAt * position);
        } else {
            page.setRotation(0);
        }
    }
}
