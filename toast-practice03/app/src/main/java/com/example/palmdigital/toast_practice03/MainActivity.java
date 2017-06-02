package com.example.palmdigital.toast_practice03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "Hi", Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this, "im ruben", Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this, "and I like soccer", Toast.LENGTH_LONG).show();
    }
}
