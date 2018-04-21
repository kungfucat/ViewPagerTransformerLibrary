# ViewPagerTransformerLibrary
A library that contains animations for the viewpager in android.

<br>

[![Release](https://jitpack.io/v/com.github.kungfucat/ViewPagerTransformerLibrary.svg)](https://jitpack.io/#com.github.kungfucat/ViewPagerTransformerLibrary)

## Transformers Available 

### 1. Default Transformer

Options : ```viewPager.setPageTransformer(true, new DefaultTransformer());```

<p align="center">
<img src="https://user-images.githubusercontent.com/20863182/39063239-fc26c966-44e7-11e8-8514-331f4ec06fd0.gif"/>
</p>


### 2. CubeOut Transformer

Options :

- Not specifying Cube Angle:  ```viewPager.setPageTransformer(true, new CubeOutTransformer());```

- Specifying Cube Angle:  ```viewPager.setPageTransformer(true, new CubeOutTransformer(CubeOutTransformer.CUBE_ANGLE_60));```

> Angle options available are CUBE_ANGLE_45 (45°), CUBE_ANGLE_60 (60°) & CUBE_ANGLE_90 (90°).

<p align="center">
<img src="https://user-images.githubusercontent.com/20863182/39063732-a1e8625a-44e9-11e8-9ed0-43785f1febef.gif"/>
</p>


### 3. Scale Transformer

Options : ```viewPager.setPageTransformer(true, new ScaleTransformer());```

<p align="center">
<img src="https://user-images.githubusercontent.com/20863182/39063845-f25f6dc8-44e9-11e8-9e51-e5e8549fcb28.gif" width="270" height="480"/>
</p>



### 4. TranslateY Transformer

Options : 
- Not specifying movement direction:  ```viewPager.setPageTransformer(true, new TranslationYTransformer());```

- Specifying movement direction:  ```viewPager.setPageTransformer(true, new TranslationYTransformer(TOP_TO_BOTTOM));```

> Movement options available are TOP_TO_BOTTOM & BOTTOM_TO_TOP.


<p align="center">
          <img src="https://user-images.githubusercontent.com/20863182/39064113-ec1262f8-44ea-11e8-9113-0c4cacefadca.gif" width="270" height="480"/>
</p>

### 5. DepthPage Transformer

Options : ```viewPager.setPageTransformer(true, new DepthPageTransformer());```

<p align="center">
          <img src="https://user-images.githubusercontent.com/20863182/39081022-567d1e3c-4557-11e8-8eda-a42d06f84763.gif" width="270" height="480"/>
</p>


### 6. Drawer Transformer

Options : ```viewPager.setPageTransformer(true, new DrawerTransformer());```

<p align="center">
          <img src="https://user-images.githubusercontent.com/20863182/39081035-a84aa3ba-4557-11e8-95bf-c050f439b5d3.gif" width="270" height="480"/>
</p>


### 7. Windmill Transformer

Options : 
- Not specifying rotation pivot:  ```viewPager.setPageTransformer(true, new WindmillTransformer());```

- Specifying pivot point:  ```viewPager.setPageTransformer(true, new WindmillTransformer(WindmillTransformer.TOP_LEFT_CORNER));```

> Pivot options available are TOP_LEFT_CORNER & BOTTOM_RIGHT_CORNER.


<p align="center">
          <img src="https://user-images.githubusercontent.com/20863182/39081072-62256d92-4558-11e8-8b79-b97c906db041.gif" width="270" height="480"/>
</p>

### 8. ZoomOut Transformer

Options : 
- Default, i.e Fade Enabled :  ```viewPager.setPageTransformer(true, new ZoomOutTransformer());```
- Disabling Fade option :  ```viewPager.setPageTransformer(true, new ZoomOutTransformer(false));```

<p align="center">
          <img src="https://user-images.githubusercontent.com/20863182/39081079-74b2e6a6-4558-11e8-893f-cb123484d634.gif" width="270" height="480"/>
</p>


### 9. RaiseFromCenter Transformer

Options : ```viewPager.setPageTransformer(true, new RaiseFromCenterTransformer());```

<p align="center">
          <img src="https://user-images.githubusercontent.com/20863182/39087431-7f02efb4-45be-11e8-84f9-7b5c4064f9a2.gif" width="270" height="480"/>
</p>


### 10. RotateAboutTop Transformer

Options : ```viewPager.setPageTransformer(true, new RotateAboutTopTransformer());```

<p align="center">
          <img src="https://user-images.githubusercontent.com/20863182/39087482-3a1b0d5e-45bf-11e8-8e06-a22090848eaf.gif" width="270" height="480"/>
</p>


### 11. RotateAboutBottom Transformer

Options : ```viewPager.setPageTransformer(true, new RotateAboutBottomTransformer());```

<p align="center">
          <img src="https://user-images.githubusercontent.com/20863182/39087486-5721df22-45bf-11e8-84fe-3f0dc05056b4.gif" width="270" height="480"/>
</p>


### 12. Accordion Transformer

Options : ```viewPager.setPageTransformer(true,new AccordionTransformer());```

<p align="center">
          <img src="https://user-images.githubusercontent.com/20863182/39087683-4b5ff13a-45c2-11e8-8aa7-b2e3ecfeb5d8.gif" width="270" height="480"/>
</p>


### 13. Random Transformer

Select a Random Transformer from the available ones.

Options :```viewPager.setPageTransformer(true, new RandomTransformer());```

<br>

## Add to your project

- Add the jitpack maven repository
```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

- Add the dependency

```groovy	
dependencies {
          compile 'com.github.kungfucat:ViewPagerTransformerLibrary:v1.2.0'
}
```

## Usage 
```java
        ViewPager viewPager = findViewById(R.id.viewPager);
        ViewPagerAdapter pagerAdapter = new YourViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        viewPager.setPageTransformer(true, new CubeOutTransformer());
```

## Contributing

> To get started...

### Step 1

- 🍴 Fork this repo!

### Step 2

- 👯 Clone this repo to your local machine.

### Step 3

- **HACK AWAY!** 🔨🔨🔨

### Step 4

- 🔃 Create a new pull request using <a href="https://github.com/kungfucat/ViewPagerTransformerLibrary/compare" target="_blank">`https://github.com/kungfucat/ViewPagerTransformerLibrary/compare`</a>.

<br>

## Developed By

Harsh Bhardwaj ([kungfucat](https://github.com/kungfucat))
