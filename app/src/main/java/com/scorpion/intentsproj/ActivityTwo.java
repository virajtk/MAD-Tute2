package com.scorpion.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    String takeExtra1;
    String takeExtra2;
    TextView txt1;
    TextView txt2;

    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;

    TextView ans;

    int num1, num2, answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        txt1=findViewById(R.id.txtNo1);
        txt2=findViewById(R.id.txtNo2);

        bt1 = findViewById(R.id.plus);
        bt2 = findViewById(R.id.minus);
        bt3 = findViewById(R.id.multi);
        bt4 = findViewById(R.id.divide);

        ans = findViewById(R.id.answer);

        takeExtra1 = getIntent().getExtras().getString("no1");
        takeExtra2 = getIntent().getExtras().getString("no2");

        txt1.setText(takeExtra1);
        txt2.setText(takeExtra2);

        num1 = Integer.parseInt(takeExtra1);
        num2 = Integer.parseInt(takeExtra2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                answer = num1 + num2;

                ans.setText(num1+"+"+num2+"="+answer);


            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                answer = num1 - num2;

                ans.setText(num1+"-"+num2+"="+answer);


            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                answer = num1 * num2;

                ans.setText(num1+"x"+num2+"="+answer);


            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                answer = num1 / num2;

                ans.setText(num1+"/"+num2+"="+answer);


            }
        });



    }
}
