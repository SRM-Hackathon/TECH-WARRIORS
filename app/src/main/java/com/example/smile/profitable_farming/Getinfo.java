package com.example.smile.profitable_farming;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Getinfo extends AppCompatActivity {

    public Button but1;

    public void init(int i){
        but1= (Button)findViewById(R.id.button5);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Getinfo.this,second.class);
                i.putExtra("crop",2);
                startActivity(i);
            }
        });
    }

    RadioGroup rg;
    RadioGroup rg1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getinfo);


        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radio01:

                        break;
                    case R.id.radio02:

                        break;
                    case R.id.radio03:

                        break;
                    case R.id.radio04:

                        break;
                }
            }
        });

        RadioGroup rg1 = (RadioGroup) findViewById(R.id.radioGroup2);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radio11:

                        break;
                    case R.id.radio22:

                        break;
                    case R.id.radio33:

                        break;
                    case R.id.radio44:

                        break;
                }
            }
        });
    }

}
