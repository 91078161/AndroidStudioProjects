package com.example.palmdigital.chooseadventure_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ExploreActivity extends AppCompatActivity implements View.OnClickListener {
    Button leftButton;
    Button rightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        TextView textView_story  = (TextView) findViewById(R.id.textView_Story);
        TextView textView_question = (TextView) findViewById(R.id.textView_Question);

        textView_story.setText("You approach a glowing, green bucket of ooze. Worried that you " +
                "will get in trouble, you pick up the bucket.");
        textView_question.setText("Do you want to pour the ooze into the 'backyard' or 'toilet'?");

        leftButton = (Button) findViewById(R.id.button_Left);
        rightButton = (Button) findViewById(R.id.button_Right);

        leftButton.setText("Backyard");
        rightButton.setText("Toilet");

        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);

    }
    public void onClick(View view) {

        if (view.getId() == R.id.button_Left) {
            Intent i  = new Intent(this, Backyard_Activity.class);
            startActivity(i);


        }
        else if (view.getId() == R.id.button_Right) {
            Intent i = new Intent(this, ToiletActivity.class);
            startActivity(i);

        }
    }




}
