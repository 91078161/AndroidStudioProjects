package org.palmdigital.madlibs02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
/**
 * Created by palmdigital on 4/7/2017.
 */

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void MakeStory(View view) {

        TextView End_Story = (TextView) findViewById(R.id.End_story) ;
        EditText adj01 = (EditText) findViewById(R.id.edit_text_adj01);
        EditText place01 = (EditText) findViewById(R.id.editText);
        EditText adj02 = (EditText) findViewById(R.id.editText2);
        EditText noun01 = (EditText) findViewById(R.id.editText4);
        EditText adj03 = (EditText) findViewById(R.id.editText5);
        EditText noun02 = (EditText) findViewById(R.id.editText6);
        EditText place02 = (EditText) findViewById(R.id.editText8);
        EditText verb01 = (EditText) findViewById(R.id.editText9);
        EditText noun03 = (EditText) findViewById(R.id.editText10);

        String Sadj01 = adj01.getText().toString();
        String Splace01 = place01.getText().toString();
        String Sadj02 = adj02.getText().toString();
        String Snoun01 = noun01.getText().toString();
        String Sadj03 = adj03.getText().toString();
        String Snoun02 = noun02.getText().toString();
        String Splace02 = place02.getText().toString();
        String Sverb01 = verb01.getText().toString();
        String snoun03 = noun03.getText().toString();

        String Story = "Last Summer my Mom and my Dad took me and " + Sadj01 + " on a trip to "
                + Splace01 + ". The weather is very " + Sadj02 + "! Northern " + Splace01 + " has many "
                + Snoun01 + ", and" + " they make " + Sadj03 + " " + Snoun02 + " there. Many people also go to "
                + Splace02 + " " + Sverb01 + " or see the " + snoun03;

        End_Story.setText(Story);
    }

}
