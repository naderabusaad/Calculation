package com.example.calculation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView tv1,tv2;
    String str1,str2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv1 = findViewById(R.id.textview1);
        tv2 = findViewById(R.id.textview2);
        Intent intent = getIntent();
        str1 = intent.getStringExtra("num1");
        str2 = intent.getStringExtra("num2");
        tv1.setText(str1);
        tv2.setText(str2);
    }
}
