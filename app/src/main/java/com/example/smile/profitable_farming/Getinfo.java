package com.example.smile.profitable_farming;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Getinfo extends AppCompatActivity {

    public Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getinfo);

        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);
        final String selectedRadioValue = ((RadioButton)findViewById(rg.getCheckedRadioButtonId() )).getText().toString();
        RadioGroup rg1 = (RadioGroup) findViewById(R.id.radioGroup2);
        final String selectedRadioValue2 =((RadioButton)findViewById(rg.getCheckedRadioButtonId() )).getText().toString();






        Button btn = (Button) findViewById(R.id.button5);
        btn.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent i= new Intent(Getinfo.this, second.class);
            i.putExtra("radioGroup1Selected", selectedRadioValue);
            i.putExtra("radioGroup2Selected", selectedRadioValue2);

            startActivity(i);
        }

        });
    }

}