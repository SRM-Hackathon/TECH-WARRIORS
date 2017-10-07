package com.example.smile.profitable_farming;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Locale;

public class Getinfo extends AppCompatActivity {

    public Button btn;
    Button button;
    TextView textView;
    private static final int MY_PERMISSION_REQUEST_LOCATION =1;

    View lay = (View) findViewById(R.id.rLayout);
    int pic = R.drawable.two;
    lay.setBackgroundResource(pic);
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
        button= (Button) findViewById(R.id.button);
        textView= (TextView) findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener(){
                                      @Override
                                      public void onClick(View view) {
                                          if(ContextCompat.checkSelfPermission(Getinfo.this,
                                                  android.Manifest.permission.ACCESS_COARSE_LOCATION)!= PackageManager.PERMISSION_GRANTED){
                                              if(ActivityCompat.shouldShowRequestPermissionRationale(Getinfo.this,
                                                      android.Manifest.permission.ACCESS_COARSE_LOCATION)) {
                                                  ActivityCompat.requestPermissions(Getinfo.this,
                                                          new String[]{android.Manifest.permission.ACCESS_COARSE_LOCATION}, MY_PERMISSION_REQUEST_LOCATION);
                                              } else {
                                                  ActivityCompat.requestPermissions(Getinfo.this,
                                                          new String[]{android.Manifest.permission.ACCESS_COARSE_LOCATION}, MY_PERMISSION_REQUEST_LOCATION);
                                              }
                                          }else{
                                              LocationManager locationManager= (LocationManager) getSystemService(Context.LOCATION_SERVICE);
                                              Location location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                                              try{
                                                  textView.setText(hereLocation(location.getLatitude(), location.getLongitude()));
                                              }catch(Exception e){
                                                  e.printStackTrace();
                                                  Toast.makeText(Getinfo.this, "Not found!",Toast.LENGTH_SHORT).show();
                                              }
                                          }
                                      }
                                  }
        );
    }
    @Override
    public void onRequestPermissionsResult(int requestCode,  String[] permissions, int[] grantResults) {
        switch (requestCode){
            case MY_PERMISSION_REQUEST_LOCATION:{
                if(grantResults.length> 0 && grantResults[0]== PackageManager.PERMISSION_GRANTED){
                    if(ContextCompat.checkSelfPermission(Getinfo.this,
                            android.Manifest.permission.ACCESS_COARSE_LOCATION)== PackageManager.PERMISSION_GRANTED){
                        LocationManager locationManager= (LocationManager) getSystemService(Context.LOCATION_SERVICE);
                        Location location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                        try{
                            textView.setText(hereLocation(location.getLatitude(), location.getLongitude()));
                        }catch(Exception e){
                            e.printStackTrace();
                            Toast.makeText(Getinfo.this, "Not found!",Toast.LENGTH_SHORT).show();
                        }
                    }
                }else{
                    Toast.makeText(this,"No permission granted", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
    //get closet city name
    public String hereLocation(double lat, double lon){
        String curCity="";
        Geocoder geocoder=new Geocoder(Getinfo.this, Locale.getDefault());
        List<Address> addressList;
        try
        {
            addressList= geocoder.getFromLocation(lat,lon,1);
            if(addressList.size() > 0){
                curCity=addressList.get(0).getLocality();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return curCity;
    }
}

