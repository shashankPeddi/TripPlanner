package com.example.tourguide;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
EditText et1,et2;
Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        login = findViewById(R.id.login);
login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(et1.getText().toString().equalsIgnoreCase("trip")&&et2.getText().toString().equalsIgnoreCase("trip")){
            Intent intent =new Intent(LoginActivity.this,MainActivity.class);
            startActivity(intent);finish();
        }
        else
            Toast.makeText(LoginActivity.this, "Invalid username or password", Toast.LENGTH_LONG).show();
    }
});
    }

    public void register(View view) {
        Intent intent  = new Intent(LoginActivity.this,Register.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Exit")
                .setMessage("Are you sure?")
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        finish();
                    }
                }).setNegativeButton("no", null).show();
    }
}
