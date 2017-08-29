package com.example.vaishnavisharma.soc_manager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Members_hp extends AppCompatActivity {

    private static Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_members_hp);
        member();
    }

    public void member()
    {
        btn1 = (Button)findViewById(R.id.Button1);
        btn2 = (Button)findViewById(R.id.Button2);
        btn3 = (Button)findViewById(R.id.Button3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Members_hp.this,Financial.class);
                startActivity(j);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Members_hp.this,Calen.class);
                startActivity(k);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(Members_hp.this,Alpha.class);
                startActivity(l);
            }
        });
    }


}
