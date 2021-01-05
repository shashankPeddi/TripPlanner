package com.example.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void register(View view) {
        Toast.makeText(this, "Registration Sucessful", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Register.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
