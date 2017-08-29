package com.example.vaishnavisharma.soc_manager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Resident_hp extends AppCompatActivity {

    private static Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resident_hp);
        resident();
    }

    public void resident()
    {
        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        btn4 = (Button)findViewById(R.id.button4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Resident_hp.this,Misc_Contacts.class);
                startActivity(a);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Resident_hp.this,Cal_main.class);
                startActivity(b);
            }
        });



        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(Resident_hp.this,Cands.class);
                startActivity(d);
            }
        });
    }

}
