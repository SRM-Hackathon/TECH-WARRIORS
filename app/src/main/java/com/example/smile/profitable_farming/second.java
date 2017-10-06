package com.example.smile.profitable_farming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String selectedRadioValue = intent.getStringExtra("selectedRadioValue");
        String selectedRadioValue2 = intent.getStringExtra("selectedRadioValue2");



    }
}
