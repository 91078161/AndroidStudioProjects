package com.example.palmdigital.chooseadventure_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PizzaActivity extends AppCompatActivity implements View.OnClickListener {

    Button leftButton;
    Button rightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);



        TextView textView_story  = (TextView) findViewById(R.id.textView_Story);

        textView_story.setText("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");


        leftButton = (Button) findViewById(R.id.button_Left);

        leftButton.setText("Restart");


        leftButton.setOnClickListener(this);

    }
    public void onClick(View view) {

        if (view.getId() == R.id.button_Left) {
            Intent i  = new Intent(this, MainActivity.class);
            startActivity(i);




        }
    }
    }

