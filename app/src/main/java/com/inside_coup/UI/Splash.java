package com.inside_coup.UI;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.inside_coup.R;


public class Splash extends Activity {
    private static int SPLASH_SCREEN_TIME_OUT = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash.this,
                        Welcome_screen.class);
                startActivity(i);

                finish();

            }
        }, SPLASH_SCREEN_TIME_OUT);
    }
}