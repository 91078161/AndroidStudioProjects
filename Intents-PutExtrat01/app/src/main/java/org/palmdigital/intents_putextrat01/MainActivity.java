package org.palmdigital.intents_putextrat01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next01(View view) {
        EditText et_adj01 = (EditText) findViewById(R.id.edit_text_adj01);
        EditText et_nat01 = (EditText) findViewById(R.id.editText);
        EditText et_per01 = (EditText) findViewById(R.id.editText2);
        EditText et_noun01 = (EditText) findViewById(R.id.editText3);
        EditText et_adj02 = (EditText) findViewById(R.id.editText4);

        String str_adj01 = et_adj01.getText().toString();
        String str_nat01 = et_nat01.getText().toString();
        String str_per01 = et_per01.getText().toString();
        String str_noun01 = et_noun01.getText().toString();
        String str_adj02 = et_adj02.getText().toString();

        String story = "Pizza was invented by a " + str_adj01 + " " + str_nat01 + " chef named "
                + str_per01 + ". To make pizza, you need to take a lump of " + str_noun01
                + ", and make a thin, round " + str_adj02;

        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("STORY_SO_FAR", story);

        startActivity(i);
    }
}