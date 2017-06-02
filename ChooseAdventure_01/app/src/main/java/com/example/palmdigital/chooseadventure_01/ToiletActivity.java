package com.example.palmdigital.chooseadventure_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ToiletActivity extends AppCompatActivity implements View.OnClickListener{

    Button leftButton;
    Button rightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toilet);


        TextView textView_story  = (TextView) findViewById(R.id.textView_Story);
        TextView textView_question = (TextView) findViewById(R.id.textView_Question);

        textView_story.setText("As you pour the ooze into the toilet it backs up, gurgles, and explodes, covering you in radioactive waste.");
        textView_question.setText("Do you want to train to be a NINJA? 'Yes' or 'HECK YES'");

        leftButton = (Button) findViewById(R.id.button_Left);
        rightButton = (Button) findViewById(R.id.button_Right);

        leftButton.setText("Yes");
        rightButton.setText("Heck Yes");

        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);

    }
    public void onClick(View view) {

        if (view.getId() == R.id.button_Left) {
            Intent i  = new Intent(this, PizzaActivity.class);
            startActivity(i);


        }
        else if (view.getId() == R.id.button_Right) {
            Intent i = new Intent(this, PizzaActivity.class);
            startActivity(i);

        }
    }
}
