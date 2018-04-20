package me.kungfucat.viewpagertransformers;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.Random;

public class RandomTransformer implements ViewPager.PageTransformer {

    private ViewPager.PageTransformer transformer = new DefaultTransformer();

    public RandomTransformer() {
        int numberOfTransformers = 4;

        transformer = new DefaultTransformer();
        Random random = new Random();
        int temp = random.nextInt(numberOfTransformers);
        switch (temp) {
            case 0:
                transformer = new TranslationYTransformer();
                break;
            case 1:
                transformer = new CubeOutTransformer();
                break;
            case 2:
                transformer = new DefaultTransformer();
                break;
            case 3:
                transformer = new ScaleTransformer();
                break;
        }
    }

    @Override
    public void transformPage(@NonNull View page, float position) {

        transformer.transformPage(page, position);
    }
}
