package com.example.baibhav.activitystatedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static String tag="mymessage";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(tag,"onCreate");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(tag,"onResume");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(tag,"onStart");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(tag,"onPause");


    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(tag,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(tag,"onDestroy");

    }
}
