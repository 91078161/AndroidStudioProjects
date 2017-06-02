package com.example.palmdigital.buttonproject01;

import android.graphics.Color;
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


        Button buttonObject01 = (Button) findViewById(R.id.button1);
        buttonObject01.setOnClickListener(this);
        buttonObject01.setText("Contacts");
        buttonObject01.setBackgroundColor(0xffff0000);

        Button buttonObject02 = (Button) findViewById(R.id.button2);
        buttonObject02.setOnClickListener(this);
        buttonObject02.setText("Email");
        buttonObject02.setBackgroundColor(0xff00ff00);

        Button buttonObject03 = (Button) findViewById(R.id.button3);
        buttonObject03.setOnClickListener(this);
        buttonObject03.setText("Messages");
        buttonObject03.setBackgroundColor(0xff0000ff);
    }

    public void onClick (View view) {

    if(view.getId() == R.id.button1) {
        Log.i("Info", "You selected 'Contacts'");
        Toast.makeText(this, "You selected 'Contacts'", Toast.LENGTH_SHORT).show();
    }
    else if (view.getId()== R.id.button2){
            Log.i("Info", "You selected 'Email'");
            Toast.makeText(this, "You selected 'Email'", Toast.LENGTH_SHORT).show();
        }
        else if (view.getId() == R.id.button3) {
        Log.i("Info", "You selected 'Messages'");
        Toast.makeText(this, "You selected 'Messages'", Toast.LENGTH_SHORT).show();
    }



    }

}
