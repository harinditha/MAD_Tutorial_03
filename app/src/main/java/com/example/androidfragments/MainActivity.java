package com.example.androidfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeFragment (View view) {
        Fragment fragment;

        if(view == findViewById(R.id.button)){
            fragment = new Fragment1();

            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fgmntDefault,fragment);
            ft.commit();
        }

        if(view == findViewById(R.id.button2)){
            fragment = new Fragment2();

            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fgmntDefault,fragment);
            ft.commit();
        }
    }
}
