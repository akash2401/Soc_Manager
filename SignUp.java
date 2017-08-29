package com.example.vaishnavisharma.soc_manager;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity
{
    EditText editTextUserName,editTextPassword,editTextConfirmPassword;
    Button btnCreateAccount;

    LogInDataBaseAdapter loginDataBaseAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

// get Instance of Database Adapter
        loginDataBaseAdapter=new LogInDataBaseAdapter(this);
        loginDataBaseAdapter=loginDataBaseAdapter.open();

// Get Refferences of Views
        editTextUserName=(EditText)findViewById(R.id.edittext4);
        editTextPassword=(EditText)findViewById(R.id.editText3);
        editTextConfirmPassword=(EditText)findViewById(R.id.editText4);

        btnCreateAccount=(Button)findViewById(R.id.button1);
        btnCreateAccount.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
// TODO Auto-generated method stub

                String userName=editTextUserName.getText().toString();
                String password=editTextPassword.getText().toString();
                String confirmPassword=editTextConfirmPassword.getText().toString();

// check if any of the fields are vaccant
                if(userName.equals("")||password.equals("")||confirmPassword.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Field Vaccant", Toast.LENGTH_LONG).show();
                    return;
                }
// check if both password matches
                if(!password.equals(confirmPassword))
                {
                    Toast.makeText(getApplicationContext(), "Password does not match", Toast.LENGTH_LONG).show();
                    return;
                }
                else
                {
// Save the Data in Database
                    loginDataBaseAdapter.insertEntry(userName, password);
                    Toast.makeText(getApplicationContext(), "Account Successfully Created ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    @Override
    protected void onDestroy() {
// TODO Auto-generated method stub
        super.onDestroy();

        loginDataBaseAdapter.close();
    }
}

