package com.example.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

String f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void img1(View view) {
        f="l1";
Intent intent=new Intent(MainActivity.this,CityBased.class);
intent.putExtra("loc",f);

 startActivity(intent);
    }

    public void img2(View view) {
        f="l2";
        Intent intent=new Intent(MainActivity.this,CityBased.class);
        intent.putExtra("loc",f);

        startActivity(intent);
    }

    public void img3(View view) {
        f="l3";
        Intent intent=new Intent(MainActivity.this,CityBased.class);
        intent.putExtra("loc",f);

        startActivity(intent);
    }

    public void img4(View view) {
        f="l4";
        Intent intent=new Intent(MainActivity.this,CityBased.class);
        intent.putExtra("loc",f);

        startActivity(intent);
    }

    public void img5(View view) {
        f="l5";
        Intent intent=new Intent(MainActivity.this,CityBased.class);
        intent.putExtra("loc",f);

        startActivity(intent);
    }


}
