package com.example.smile.profitable_farming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String selectedRadioValue1 = intent.getStringExtra("selectedRadioValue");
        String selectedRadioValue2 = intent.getStringExtra("selectedRadioValue2");

        TextView  textView1= (TextView) findViewById(R.id.textView8);
        textView1.setText(selectedRadioValue1);

        TextView  textView2= (TextView) findViewById(R.id.textView9);
        textView2.setText(selectedRadioValue2);





    }
}
