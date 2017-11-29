package com.example.com.shesit;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dagger.android.AndroidInjection;

public class Spalsh_Screen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh__screen);

        new Handler().postDelayed(new Runnable() {
            Fragment fragment;

            @Override
            public void run() {
              //  Intent i = new Intent(Spalsh_Screen.this, MainActivity.class);
                //startActivity(i);
               // finish();


                fragment=new Second_SplashFragment();
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.fragment_place,fragment);
                ft.commit();

            }
        }, SPLASH_TIME_OUT);

        new Handler().postDelayed(new Runnable() {
            Fragment fragment;

            @Override
            public void run() {
                //  Intent i = new Intent(Spalsh_Screen.this, MainActivity.class);
                //startActivity(i);
                // finish();


                fragment=new Third_SplashFragment();
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.fragment_place,fragment);
                ft.commit();

            }
        }, SPLASH_TIME_OUT);


        new Handler().postDelayed(new Runnable() {
            Fragment fragment;

            @Override
            public void run() {
                  Intent i = new Intent(Spalsh_Screen.this, MainActivity.class);
                startActivity(i);
                //finish();

            }
        }, SPLASH_TIME_OUT);

    }
}
