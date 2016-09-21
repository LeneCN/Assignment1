package com.assignment.lenececilienielsen.mapapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;



public class MapActivity2 extends Activity {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_map);  //uses the layout from the xml code activty2
                                                 //https://www.mkyong.com/android/android-activity-from-one-screen-to-another-screen/
                                                // I have used som code from this website on code above
    }
                @Override
                  public void onCreate(Bundle savedInstanceState) {
                  super.onCreate(savedInstanceState);
                  setContentView(R.layout.activity2_map);

                  Button SignInButton = (Button) findViewById(R.id.SignInbutton); //Reference to the button Sign in, on the phone it says Log in

                  SignInButton.setOnClickListener( //eventlistener or click listener, waiting for someone to click the button
                   new Button.OnClickListener() {
                   public void onClick(View v) { //callback method
                               TextView textView = (TextView) findViewById(R.id.textView); //this is what happens when you click the button
                               textView.setText("You have now logged in!"); //widgets text
                   }
                                                });
                }

}
