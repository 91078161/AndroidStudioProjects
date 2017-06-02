package org.palmdigital.intents_putextrat01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
    String story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tv_story = (TextView) findViewById(R.id.text_view_story);

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
    public void Next02(View view) {
        EditText et_noun02 = (EditText) findViewById(R.id.edit_text_natinality_01);
        EditText et_adj03 = (EditText) findViewById(R.id.editText5);
        EditText et_adj04 = (EditText) findViewById(R.id.editText6);
        EditText et_per02 = (EditText) findViewById(R.id.editText7);
        EditText et_noun03 = (EditText) findViewById(R.id.editText8);

        String str_noun02 = et_noun02.getText().toString();
        String str_adj03 = et_adj03.getText().toString();
        String str_adj04 = et_adj04.getText().toString();
        String str_per02 = et_per02.getText().toString();
        String str_noun03 = et_noun03.getText().toString();

         String story1 =  " " + str_noun02 + ". Then you cover it with " + str_adj03 + " sauce, "
                 + str_adj04 + " cheese, and fresh chopped " + str_per02 + ". next you have to bake it" +
                 " in a very hot " + str_noun03 + ". ";

        Intent a = new Intent(this, Main3Activity.class);
        a.putExtra("STORY_SO_FAR", story + story1);

        startActivity(a);


    }
}
