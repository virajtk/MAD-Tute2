package com.scorpion.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText ed1;
    EditText ed2;
    String st1;
    String st2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.okButton);
        ed1 = findViewById(R.id.txtNo1);
        ed2 = findViewById(R.id.txtNo2);


        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActivityTwo.class);
                st1 = ed1.getText().toString();
                st2 = ed2.getText().toString();
                intent.putExtra("no1", st1 );
                intent.putExtra("no2", st2 );
                startActivity(intent);

                finish();
            }
        });

    }
}
