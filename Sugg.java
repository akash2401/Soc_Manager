package com.example.vaishnavisharma.soc_manager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Sugg extends AppCompatActivity {

    private static EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugg);

        EditText edit1 = (EditText)findViewById(R.id.editText7);
        edit1.setEnabled(false);
        edit = (EditText)findViewById(R.id.Edittext1);

        Intent i = getIntent();
        String text = i.getStringExtra( "TextBox");
// Now set this value to EditText
        edit.setText ( text );
        edit.setEnabled(false);
    }
}
