package com.bisonswap.painting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ComponentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component);
        setTitle("Manage Components");
    }
}
