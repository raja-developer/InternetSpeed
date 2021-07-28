package com.raja.internetspeed;

import androidx.appcompat.app.AppCompatActivity;

import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.Log;

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

//        665
//                576,577

    }
}