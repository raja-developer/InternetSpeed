package com.raja.internetspeed;

import androidx.appcompat.app.AppCompatActivity;

import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.raja.internetspeed.Support.Connectivity;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "SpeedDetails";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "getNetworkInfo_" + Connectivity.getNetworkInfo(getApplicationContext()));
        Log.d(TAG, "isConnected_" + Connectivity.isConnected(getApplicationContext()));
        Log.d(TAG, "isConnectedWifi_" + Connectivity.isConnectedWifi(getApplicationContext()));
        Log.d(TAG, "isConnectedMobile_" + Connectivity.isConnectedMobile(getApplicationContext()));
//        Log.d(TAG, "" + Connectivity.isConnectionFast(getApplicationContext(), ConnectivityManager.TYPE_MOBILE));


        FirebaseDatabase database = FirebaseDatabase.getInstance();


        DatabaseReference ref =database.getReference().push();
        String Key =ref.getKey();

        ref.child(Key).child("details").child("Connected").setValue(Connectivity.isConnected(getApplicationContext()));

    }
}