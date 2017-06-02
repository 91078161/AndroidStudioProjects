package org.palmdigital.madlibs03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void MakeStory(View view) {

        TextView End_Story = (TextView) findViewById(R.id.End_story) ;
        EditText adj01 = (EditText) findViewById(R.id.edit_text_adj01);
        EditText nationality01 = (EditText) findViewById(R.id.editText);
        EditText person01 = (EditText) findViewById(R.id.editText2);
        EditText noun01 = (EditText) findViewById(R.id.editText4);
        EditText adj02 = (EditText) findViewById(R.id.editText5);
        EditText noun02 = (EditText) findViewById(R.id.editText6);
        EditText adj03 = (EditText) findViewById(R.id.editText8);
        EditText adj04 = (EditText) findViewById(R.id.editText9);
        EditText noun03 = (EditText) findViewById(R.id.editText10);

        String Sadj01 = adj01.getText().toString();
        String Snationality01 = nationality01.getText().toString();
        String Sperson01 = person01.getText().toString();
        String Snoun01 = noun01.getText().toString();
        String Sadj02 = adj02.getText().toString();
        String Snoun02 = noun02.getText().toString();
        String Sadj03 = adj03.getText().toString();
        String Sadj04 = adj04.getText().toString();
        String Snoun03 = noun03.getText().toString();

        String Story = "Pizza was invented by a " + Sadj01 + Snationality01 + " chef named" + Sperson01
                + ". To make piiza, you need a lump of " + Snoun01 + ", and make a thin, round " + Sadj02
                + Snoun02 + ". Then you cover it with " + Sadj03 + " sauce, " + Sadj04 + " chesse, and fresh" +
                " chopped " + Snoun03;

        End_Story.setText(Story);
    }
}
