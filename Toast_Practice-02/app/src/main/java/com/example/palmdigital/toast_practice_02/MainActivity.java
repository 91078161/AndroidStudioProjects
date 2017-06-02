package com.example.palmdigital.toast_practice_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "My name is Ruben", Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this, "& I like to eat seafood", Toast.LENGTH_LONG).show();
    }
}
