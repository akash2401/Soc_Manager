package com.example.vaishnavisharma.soc_manager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Alpha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha);
        Button btn = (Button) findViewById(R.id.button7);
        final RadioGroup rg = (RadioGroup) findViewById(R.id.radiogroup1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectid = rg.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) findViewById(selectid);


                if (rb.getText().toString().equals("Complaints")) {
                    Intent x = new Intent(Alpha.this, Compl.class);

                    startActivity(x);
                } else {
                    Intent y = new Intent(Alpha.this, Sugg.class);

                    startActivity(y);
                }

            }
        });
    }
}