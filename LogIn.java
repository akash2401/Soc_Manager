package com.example.vaishnavisharma.soc_manager;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        login_act();
    }

    public void login_act()
    {
        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        adb.setMessage("As a").setCancelable(false);
        adb.setPositiveButton("Committe Member", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               Intent a = new Intent(LogIn.this,After_Login_2.class);
                startActivity(a);
            }
        });
        adb.setNegativeButton("Resident", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent i = new Intent(LogIn.this,After_Login_1.class);
                startActivity(i);
            }
        });
        AlertDialog ad = adb.create();
        ad.setTitle("LOG IN");
        ad.show();
    }
}
