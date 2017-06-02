package com.example.palmdigital.button03;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject01 = (Button) findViewById(R.id.buttonMyButton01);
        buttonObject01.setText ("This Blue Pill");
        buttonObject01.setBackground(new Color(1 Red, 2 Green, 3 Blue));
        //getContentPane().setBackground(new Color(107, 106, 104));

        buttonObject01.setBottom(30);


        Button buttonObject02 = (Button) findViewById(R.id.buttonMyButton02);
        buttonObject02.setText ("This Red Pill");
        buttonObject02.setBackgroundColor(Color.RED);

        buttonObject01.setOnClickListener(this);
        buttonObject02.setOnClickListener(this);
    }
    public void onClick(View view) {
        if(view.getId() == R.id.buttonMyButton01) {
            Log.i("Info", "You took the Blue pill");
            Toast.makeText(this, "You took the Blue Pill", Toast.LENGTH_SHORT).show();
        }

        else if(view.getId() == R.id.buttonMyButton02){
            Log.i("Info", "You took the Red Pill");
            Toast.makeText(this, "You took the Red Pill", Toast.LENGTH_SHORT).show();
        }
    }
}
