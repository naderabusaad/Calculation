package com.example.calculation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    TextView tv;
    Integer num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addNums(View view) {
        tv = (TextView)findViewById(R.id.idtextView);
        et1 = (EditText)findViewById(R.id.editText1);
        et2 = (EditText)findViewById(R.id.editText2);

        num1 = Integer.parseInt(et1.getText().toString());
        num2 = Integer.parseInt(et2.getText().toString());

        tv.setText(String.valueOf(num1+num2));

        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("num1",et1.getText().toString());
        intent.putExtra("num2",et2.getText().toString());

        startActivity(intent);

    }
}
