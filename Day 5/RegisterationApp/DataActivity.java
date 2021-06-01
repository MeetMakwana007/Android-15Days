package com.example.registeration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {
TextView name;
TextView email;
TextView num;
TextView password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datauser);

        name = (TextView)findViewById(R.id.name);
        email = (TextView) findViewById(R.id.email);
        num = (TextView) findViewById(R.id.num);
        password = (TextView) findViewById(R.id.password);
        Intent intent = getIntent();
        String fname = intent.getStringExtra("NAME");
        name.setText("Welcome " + fname);

        String em = intent.getStringExtra("EMAIL");
        email.setText("Email: " + em);

        String number = intent.getStringExtra("NUM");
        num.setText("Mobile No.: " + number);

        String pswd = intent.getStringExtra("PSWD");
        password.setText("Password: " + pswd);


    }
}