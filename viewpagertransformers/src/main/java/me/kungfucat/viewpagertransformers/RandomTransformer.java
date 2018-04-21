package me.kungfucat.viewpagertransformers;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.Random;

public class RandomTransformer implements ViewPager.PageTransformer {

    private ViewPager.PageTransformer transformer = new DefaultTransformer();

    public RandomTransformer() {
        int optionsAvailable = 12;

        transformer = new DefaultTransformer();
        Random random = new Random();
        int temp = random.nextInt(optionsAvailable);
        switch (temp) {
            case 0:
                transformer = new TranslationYTransformer(TranslationYTransformer.TOP_TO_BOTTOM);
                break;
            case 1:
                transformer = new TranslationYTransformer(TranslationYTransformer.BOTTOM_TO_TOP);
                break;
            case 2:
                transformer = new DefaultTransformer();
                break;
            case 3:
                transformer = new ScaleTransformer();
                break;
            case 4:
                transformer = new CubeOutTransformer(CubeOutTransformer.CUBE_ANGLE_45);
                break;
            case 5:
                transformer = new CubeOutTransformer(CubeOutTransformer.CUBE_ANGLE_60);
                break;
            case 6:
                transformer = new CubeOutTransformer(CubeOutTransformer.CUBE_ANGLE_90);
                break;
            case 7:
                transformer = new WindmillTransformer(WindmillTransformer.TOP_LEFT_CORNER);
                break;
            case 8:
                transformer = new WindmillTransformer(WindmillTransformer.BOTTOM_RIGHT_CORNER);
                break;
            case 9:
                transformer = new ZoomOutPageTransformer(true);
                break;
            case 10:
                transformer = new ZoomOutPageTransformer(false);
                break;
            case 11:
                transformer = new DepthPageTransformer();
                break;
        }
    }

    @Override
    public void transformPage(@NonNull View page, float position) {
        transformer.transformPage(page, position);
    }
}
