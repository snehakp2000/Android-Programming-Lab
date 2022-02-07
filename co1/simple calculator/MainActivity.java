package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1;
    EditText n2;
    TextView tv;
    Button ad,mul,sub,div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=(EditText)findViewById(R.id.et1);
        n2=(EditText)findViewById((R.id.et2));
        tv=(TextView)findViewById(R.id.tv1);
        ad=(Button)findViewById(R.id.bt1);
        mul=(Button)findViewById((R.id.bt2));
        div=(Button)findViewById(R.id.bt3);
        sub=(Button)findViewById(R.id.bt4);

        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer no1=Integer.parseInt(n1.getText().toString());
                Integer no2=Integer.parseInt(n2.getText().toString());
                Integer add=no1+no2;
                tv.setText(add.toString());
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer no1=Integer.parseInt(n1.getText().toString());
                Integer no2=Integer.parseInt(n2.getText().toString());
                Integer add=no1*no2;
                tv.setText(add.toString());
            }
        });
       div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer no1=Integer.parseInt(n1.getText().toString());
                Integer no2=Integer.parseInt(n2.getText().toString());
                Integer add=no1/no2;
                tv.setText(add.toString());
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer no1=Integer.parseInt(n1.getText().toString());
                Integer no2=Integer.parseInt(n2.getText().toString());
                Integer add=no1-no2;
                tv.setText(add.toString());
            }
        });
    }
}
