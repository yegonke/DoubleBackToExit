package com.example.doublebacktoexit;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //DoubleBackPressed
    boolean doubleback = false;

    @Override
    public void onBackPressed() {
        if (doubleback) {
            super.onBackPressed();
            return;
        }
        this.doubleback = true;
        Toast.makeText(getApplicationContext(), "Press again to exit", Toast.LENGTH_LONG).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                doubleback = false;
            }
        }, 2000);
    }
}
