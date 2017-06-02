package org.palmdigital.fizzbuzz01;

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

    public void calculate(View v) {
        EditText eInput = (EditText) findViewById(R.id.input);
        TextView eOutput = (TextView) findViewById(R.id.output);

        String strInput = eInput.getText().toString();
        int input = Integer.parseInt(strInput);


        int input1 = Integer.parseInt(strInput);
        if (eInput == null) {
            eOutput.setText("Don't put zero");
        } else {
            if (input % 5 == 0) {
                if (input % 3 == 0) {
                    eOutput.setText("Fizz Buzz");
                } else {
                    eOutput.setText("Buzz");
                }
            } else if (input % 3 == 0) {
                eOutput.setText("Fizz");
            } else {
                eOutput.setText(strInput);
            }

        }
    }
}
