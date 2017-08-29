package com.example.vaishnavisharma.soc_manager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Financial extends AppCompatActivity {

    private static EditText edit;
    private static TextView text;
    private static Button btn1,btn2,btn3;
    float initial=25000;
    float a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financial);
        Finance();
    }

    public void Finance() {
        edit = (EditText) findViewById(R.id.edittext1);
        text = (TextView) findViewById(R.id.text1);
        btn1 = (Button) findViewById(R.id.BUTTON1);
        btn2 = (Button) findViewById(R.id.BUTTON2);
        btn3 = (Button) findViewById(R.id.BUTTON3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(edit.getText().toString());
                b = initial+a;

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(edit.getText().toString());
                b = initial-a;

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("Total Amount ="+Float.toString(b));

            }
        });

    }
}
