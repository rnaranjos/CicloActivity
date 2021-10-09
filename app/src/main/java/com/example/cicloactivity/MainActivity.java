package com.example.cicloactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        guardoLog("onCreate");
    }
    @Override
    protected void onStart(){
        super.onStart();
        guardoLog("onStart");
    }

        @Override
        protected void onResume(){
            super.onResume();
            guardoLog("onResume");
        }

        @Override
        protected void onPause() {
            super.onPause();
            guardoLog("onPause");
        }

    @Override
    protected void onStop() {
        super.onStop();
        guardoLog("onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        guardoLog("onDestroy");
    }

        @Override
        protected void onRestart() {
            super.onRestart();
            guardoLog("onRestart");
        }


            private void guardoLog(String nombreFuncion){
            Log.d(TAG,"Estoy en la función " +nombreFuncion);
        };

    }