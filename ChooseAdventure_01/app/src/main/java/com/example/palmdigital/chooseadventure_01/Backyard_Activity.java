package com.example.palmdigital.chooseadventure_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Backyard_Activity extends AppCompatActivity implements View.OnClickListener{

    Button leftButton;
    Button rightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backyard_);

        TextView textView_story  = (TextView) findViewById(R.id.textView_Story);
        TextView textView_question = (TextView) findViewById(R.id.textView_Question);

        textView_story.setText("As you walk into the backyard a");
        textView_question.setText("Man prepares you as soup, do you... 'Scream' or 'Faint'");

        leftButton = (Button) findViewById(R.id.button_Left);
        rightButton = (Button) findViewById(R.id.button_Right);

        leftButton.setText("Scream");
        rightButton.setText("Faint");

        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);

    }
    public void onClick(View view) {

        if (view.getId() == R.id.button_Left) {
            Intent i  = new Intent(this, MainActivity.class);
            startActivity(i);


        }
        else if (view.getId() == R.id.button_Right) {
            Intent i = new Intent(this, FaintActivity.class);
            startActivity(i);

        }
    }




}

