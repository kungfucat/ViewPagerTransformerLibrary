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

### 5. Random Transformer

Select a Random Transformer from the available ones.

Options :```viewPager.setPageTransformer(true,new RandomTransformer());```

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
          compile 'com.github.kungfucat:ViewPagerTransformerLibrary:v1.0.0'
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
