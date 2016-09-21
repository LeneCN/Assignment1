package com.assignment.lenececilienielsen.mapapp;

import android.support.v4.app.FragmentActivity;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


   public class MapActivity extends FragmentActivity implements OnMapReadyCallback {
       private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager() // Obtain the SupportMapFragment and get notified when the map is ready to be used.
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng gjovik = new LatLng(60.7954302, 10.6916303);// Add a marker in Gjøvik and moves the camera
        mMap.addMarker(new MarkerOptions().position(gjovik).title("Marker in Gjøvik"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gjovik));
        mMap.setMapType(googleMap.MAP_TYPE_HYBRID);   // Shows the map in hybrid

    }

   }

//https://www.youtube.com/watch?v=NHXa96-r8TY I have used som of the code from the video in the code above
//https://www.mkyong.com/android/android-activity-from-one-screen-to-another-screen/ I have used some code from this website on the 

public class MapActivity extends Activity {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map); //uses the layout from the xml file called activity_map
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, MapActivity2.class); //when the button gets clicked the second activity starts
                startActivity(intent);

            }

        });

    }

}
