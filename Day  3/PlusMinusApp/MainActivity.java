package com.example.add;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import static java.lang.Integer.valueOf;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private Button add;
    private Button sub;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText)findViewById(R.id.Num1);
        num2 = (EditText)findViewById(R.id.Num2);
        add= (Button)findViewById(R.id.button);
        sub = (Button)findViewById(R.id.button2);
        result=(TextView)findViewById(R.id.result);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1= Integer.parseInt(num1.getText().toString());
                int number2= Integer.parseInt(num2.getText().toString());
                int sum = number1+ number2;
                result.setText("Answer: " + valueOf(sum));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1= Integer.parseInt(num1.getText().toString());
                int number2= Integer.parseInt(num2.getText().toString());
                int subt = number1- number2;
                result.setText("Answer: " + String.valueOf(subt));
            }
        });
    }
}