package com.example.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
public class StartActivity extends AppCompatActivity {

    private ImageView logo;
    private static int splashTimeOut=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        logo=(ImageView)findViewById(R.id.logo);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(StartActivity.this,LoginActivity.class);
                startActivity(i);
                finish();
            }
        },splashTimeOut);


    }
    }