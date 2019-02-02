package com.example.dojo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int num1,num2;
    int state;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        state = 0;

        t1 = findViewById(R.id.text);

        Button b1 = findViewById(R.id.button23);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v)  {
                String tmp = t1.getText().toString();
                tmp += "1";
                t1.setText(tmp);
            }
        });

        Button b2 = findViewById(R.id.button24);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v)  {
                num1 =
        }
    }
}
