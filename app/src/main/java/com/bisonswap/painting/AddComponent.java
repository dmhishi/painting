package com.bisonswap.painting;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class AddComponent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_component);

        setTitle("Add new component");

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

//        int width = displayMetrics.widthPixels;
//        int height = displayMetrics.heightPixels;
//        getWindow().setLayout((int) (width*0.8), (int) (height*0.6));
    }
}
