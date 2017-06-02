package com.example.palmdigital.button02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonObject = (Button) findViewById(R.id.buttonMyButton1);
        buttonObject1.setOnClickListener(this);

    }

    public void setOnClick(View view) {
        Log.i("info", "hellow");
        Toast.makeText(MainActivity.this, "You pressed my button1", Toast.LENGTH_SHORT).show();
    }

}

