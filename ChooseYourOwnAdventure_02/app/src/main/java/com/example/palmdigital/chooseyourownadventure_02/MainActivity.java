package com.example.palmdigital.chooseyourownadventure_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.palmdigital.chooseyourownadventure_02.R.id.textView_Question;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button leftButton;
    Button rightButton;
    TextView textView_Story;
    TextView textView_Question;
    int left;
    int right;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         textView_Story = (TextView) findViewById(R.id.textView_Story);
        textView_Question = (TextView) findViewById (R.id.textView_Question);


        textView_Story.setText("One morning a Tortiose woke up from a dream");
        textView_Question.setText("Do you want to explore the dream or wake up");

        leftButton = (Button) findViewById(R.id.button_Left);
        rightButton = (Button) findViewById(R.id.button_Right);

        leftButton.setText("Wake Up");
        rightButton.setText("Explore");

        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);
    }


    public void Start() {
        textView_Story.setText("One morning a Tortiose woke up from a dream");
        textView_Question.setText("Do you want to explore the dream or wake up");
        leftButton.setText("Wake Up");
        left = 1;
        rightButton.setText("Explore");
        right = 1;
    }

    public void WakeUp() {
        textView_Story.setText("You wake up and have a boring day");
        textView_Question.setText("");
        leftButton.setText("Restart");
        left = 2;
        rightButton.setText("Restart");
        right = 2;
    }
    public void Explore() {
        textView_Story.setText("You approach a glowing, green bucket of ooze. Worried that " +
                "you will get in to trouble, you pick up the bucket");
        textView_Question.setText("Do you want to poor the ooze into the 'Backyard' or 'Toilet'");
        leftButton.setText("Backyard");
        left = 3;
        rightButton.setText("Toilet");
        right = 3;
    }




    public void onClick(View view) {

        if (view.getId() == R.id.button_Left) {

        }
        else if (view.getId() == R.id.button_Right) {

        }
    }

    }

