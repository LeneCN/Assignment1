package com.assignment.lenececilienielsen.mapapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MapActivity2 extends Activity {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_map); //uses the layout from the xml code activty2
    }

}

//https://www.mkyong.com/android/android-activity-from-one-screen-to-another-screen/ I have used some code from this website on the code above
