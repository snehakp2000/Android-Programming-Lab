package com.example.cev.exp6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int countnum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnplus=(Button)findViewById(R.id.btn1);
        Button btnminus=(Button)findViewById(R.id.btn2);
        final TextView count=(TextView)findViewById(R.id.txtvalue);
        Button reset=(Button)findViewById(R.id.btn3);
        //btn plus
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countnum++;
                count.setText(countnum+"");
            }
        });
        //btn minus
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countnum--;
                count.setText(countnum+"");
            }
        });
        //reset
        reset.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countnum=0;
                count.setText(countnum+"");
            }
        }));
    }

}
