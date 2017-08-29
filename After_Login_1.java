package com.example.vaishnavisharma.soc_manager;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class After_Login_1 extends AppCompatActivity {

    Button btnSignIn;
    LogInDataBaseAdapter loginDataBaseAdapter;
    int attempts = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after__login_1);

        loginDataBaseAdapter = new LogInDataBaseAdapter(this);
        loginDataBaseAdapter = loginDataBaseAdapter.open();



// get the Refferences of views
        final EditText editTextUserName=(EditText)findViewById(R.id.edittext1);
        final EditText editTextPassword=(EditText)findViewById(R.id.edittext2);
        final EditText edit3 = (EditText)findViewById(R.id.edittext3);
        btnSignIn = (Button)findViewById(R.id.button);

        edit3.setText(Integer.toString(attempts));

// Set On ClickListener
        btnSignIn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
// get The User name and Password
                String userName=editTextUserName.getText().toString();
                String password=editTextPassword.getText().toString();

// fetch the Password form database for respective user name
                String storedPassword=loginDataBaseAdapter.getSinlgeEntry(userName);

// check if the Stored password matches with Password entered by user
                if(password.equals(storedPassword))
                {
                    Intent i = new Intent(After_Login_1.this,Resident_hp.class);
                    startActivity(i);

                }
                else
                {
                    Toast.makeText(After_Login_1.this, "User Name or Password does not match", Toast.LENGTH_LONG).show();
                    attempts--;
                    edit3.setText(Integer.toString(attempts));
                }
                if (attempts==0)
                {
                    btnSignIn.setEnabled(false);
                }
            }
        });


    }


    protected void onDestroy() {
        super.onDestroy();
// Close The Database
        loginDataBaseAdapter.close();
    }

}
