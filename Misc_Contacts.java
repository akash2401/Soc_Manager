package com.example.vaishnavisharma.soc_manager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Misc_Contacts extends AppCompatActivity {

    private static Button btn1,btn2,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_misc__contacts);
        button_Click();
    }

    public void button_Click()
    {
        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        btn4 = (Button)findViewById(R.id.button4);
        btn5 = (Button)findViewById(R.id.button6);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Misc_Contacts.this,Security.class);
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Misc_Contacts.this,Water.class);
                startActivity(j);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Misc_Contacts.this,Electricity.class);
                startActivity(k);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(Misc_Contacts.this,Other.class);
                startActivity(l);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(Misc_Contacts.this,ICOE.class);
                startActivity(m);
            }
        });
    }
}
