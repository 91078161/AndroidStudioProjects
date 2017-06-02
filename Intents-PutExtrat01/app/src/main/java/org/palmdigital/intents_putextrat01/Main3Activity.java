package org.palmdigital.intents_putextrat01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main3Activity extends AppCompatActivity {
    String story;
    String story1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView tv_story02 = (TextView) findViewById(R.id.textView16);

        if(savedInstanceState == null){
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                story = null;
            }
            else {
                story = extras.getString("STORY_SO_FAR");
            }
        }
        else {
            story = (String) savedInstanceState.getSerializable("STORY_SO_FAR");
        }

    }
        public void Next03(View view) {
            EditText et_num01 = (EditText) findViewById(R.id.editText9);
            EditText et_shape01 = (EditText) findViewById(R.id.editText10);
            EditText et_food01 = (EditText) findViewById(R.id.editText11);
            EditText et_food02 = (EditText) findViewById(R.id.editText12);
            EditText et_num02 = (EditText) findViewById(R.id.editText13);

            String str_num01 = et_num01.getText().toString();
            String str_shape01 = et_shape01.getText().toString();
            String str_food01 = et_food01.getText().toString();
            String str_food02 = et_food02.getText().toString();
            String str_num02 = et_num02.getText().toString();

            String story03 = "When its done, cut it into " + str_num01 + " " + str_shape01
                    + ". Some kids like " + str_food01 + " pizza the best, but my favorite is the " +
                    str_food02 + " pizza. If I could, I would eat pizza " + str_num02 + " times a day.";


            Intent b = new Intent(this, Main4Activity.class);
            b.putExtra("STORY SO FAR", story + story1 + story03);
            startActivity(b);
        }



    }

