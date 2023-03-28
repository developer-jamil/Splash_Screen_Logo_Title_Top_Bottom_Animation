package com.jamillabltd.splashscreenlogotitletopbottomanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    ImageView logo;
    TextView appName;
    Animation Splash_top,Splash_bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //for animation
        logo = findViewById(R.id.logo);
        appName = findViewById(R.id.appName);

        Splash_top = AnimationUtils.loadAnimation(this, R.anim.top_anim);
        Splash_bottom = AnimationUtils.loadAnimation(this, R.anim.bottom_anim);

        logo.setAnimation(Splash_top);
        appName.setAnimation(Splash_bottom);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
                finish();
            }
        },2500);

    }
}