package com.example.vaishnavisharma.soc_manager;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        act1();
    }

    public void act1()
    {
        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        adb.setMessage("What would you like to do").setCancelable(false);
        adb.setPositiveButton("LOG IN", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent i = new Intent(MainActivity.this,LogIn.class);
                startActivity(i);
            }
        });
        adb.setNegativeButton("SIGN UP", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent a = new Intent(MainActivity.this,SignUp.class);
                startActivity(a);
            }
        });
        AlertDialog ad = adb.create();
        ad.setTitle("Welcome To Akash Society Manager");
        ad.show();


    }
}
