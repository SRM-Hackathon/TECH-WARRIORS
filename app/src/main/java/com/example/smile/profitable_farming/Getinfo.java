package com.example.smile.profitable_farming;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Getinfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getinfo);
        TextView t=(TextView)findViewById(R.id.textView2);
        Typeface tf = Typeface.createFromAsset(this.getAssets(),"tamil/Bamini.ttf");
        t.setTypeface(tf);
        t.setText("இடம்:");

        TextView t2=(TextView)findViewById(R.id.textView3);
        Typeface tf1 = Typeface.createFromAsset(this.getAssets(),"tamil/Bamini.ttf");
        t2.setTypeface(tf1);
        t2.setText("ஈரப்பதம்:");

        TextView t3=(TextView)findViewById(R.id.textView3);
        Typeface tf2 = Typeface.createFromAsset(this.getAssets(),"tamil/Bamini.ttf");
        t3.setTypeface(tf2);
        t3.setText("மண்:");

        

    }
}
