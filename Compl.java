package com.example.vaishnavisharma.soc_manager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Compl extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compl);
        EditText edit1 = (EditText)findViewById(R.id.editText5);
        EditText edit2 = (EditText)findViewById(R.id.editText6);
        edit1.setEnabled(false);
        edit2.setEnabled(false);
        EditText edit = (EditText)findViewById(R.id.edittext);

        Intent i = getIntent();
        String text = i.getStringExtra( "TextBox");
// Now set this value to EditText
        edit.setText ( text );
        edit.setEnabled(false);
        }


    }



