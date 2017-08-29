package com.example.vaishnavisharma.soc_manager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Cal_main extends AppCompatActivity {

    private static Button btn;
    private static RadioGroup rg;
    private static RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_main);
        calmain();
    }

    public void calmain()
    {
        rg = (RadioGroup)findViewById(R.id.radioGroup);
        btn = (Button)findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectid = rg.getCheckedRadioButtonId();
                rb = (RadioButton)findViewById(selectid);

                if(rb.getText().toString().equals("1BHK"))
                {
                    Toast.makeText(Cal_main.this, "Your Maintenance is Rs. 700", Toast.LENGTH_SHORT).show();
                }
                else if (rb.getText().toString().equals("2BHK"))
                {
                    Toast.makeText(Cal_main.this, "Your Maintenance is Rs. 800",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(Cal_main.this,"Your Maintenance is Rs. 900",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
