package com.example.registeration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button button;
EditText Name;
EditText Email;
EditText Number;
EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        Name = (EditText) findViewById(R.id.Name);
        Email = (EditText) findViewById(R.id.Email);
        Number = (EditText) findViewById(R.id.phnNo);
        Password = (EditText) findViewById(R.id.Pswd);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = Name.getText().toString();
                String em = Email.getText().toString();
                String num = Number.getText().toString();
                String ps = Password.getText().toString();

                Intent intent = new Intent(MainActivity.this,DataActivity.class);
                intent.putExtra("NAME", name);
                intent.putExtra("EMAIL", em);
                intent.putExtra("NUM", num);
                intent.putExtra("PSWD", ps);
                startActivity(intent);
            }
        });
    }
}