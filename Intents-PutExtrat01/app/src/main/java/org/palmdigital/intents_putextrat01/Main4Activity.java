package org.palmdigital.intents_putextrat01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main4Activity extends AppCompatActivity {
    String story = "1";
    String story1;
    String story03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TextView tv_story03 = (TextView) findViewById(R.id.textView17);

        if(savedInstanceState == null){
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                story = null;
            }
            else {
                story = extras.getString("STORY SO FAR");
            }
        }
        else {
            story = (String) savedInstanceState.getSerializable("STORY SO FAR");
        }

        tv_story03.setText(story);
    }
    }

