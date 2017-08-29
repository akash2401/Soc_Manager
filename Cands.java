package com.example.vaishnavisharma.soc_manager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Cands extends AppCompatActivity {

    private static EditText edit1;
    private static Button btn;
    private static RadioGroup rg;
    private static RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cands);
        com_sug();
    }

    public void com_sug()
    {
        edit1 = (EditText)findViewById(R.id.editText);
        btn = (Button)findViewById(R.id.button5);
        rg = (RadioGroup)findViewById(R.id.radioGroup);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectid = rg.getCheckedRadioButtonId();
                rb = (RadioButton)findViewById(selectid);


                if(rb.getText().toString().equals("Complaint"))
                {
                    Intent x = new Intent(Cands.this,Compl.class);
                    x.putExtra( "TextBox", edit1.getText().toString() );
                    startActivity(x);
                }
                else
                {
                    Intent y = new Intent(Cands.this,Sugg.class);
                    y.putExtra("TextBox",edit1.getText().toString());
                    startActivity(y);
                }
            }
        });
    }
}
