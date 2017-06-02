package org.palmdigital.high_low01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void guess(View view) {
        EditText input = (EditText) findViewById(R.id.editText4);
        String str_input = input.getText().toString();
        TextView output = (TextView) findViewById(R.id.textView4);
        TextView test = (TextView) findViewById(R.id.textView3);

        Random rand = new Random();
        int  answer = rand.nextInt(100) + 1;

        for (int i = 0; i < 7; i++) {
          if (R.id.editText4 == answer) {
        output.setText("YOU WON THE GAME! YOU CAN NOW RESTART");
          }
        }
    }



      /*  int answer = NumberUtils.getRandomInt(1, 100);
        for (int i = 0; i < 7; i++)
        {
            int guess = MessageBox.askForNumericalInput("what is your guess in numbers");
            if (guess == answer)
            {
                Sound.playBeep();
                MessageBox.showMessage("You have won the game");
                System.exit(0);
            }
            if (answer - guess < 7 && answer - guess > -7)
            {
                if (guess > answer)
                {
                    MessageBox.showMessage("You're close and Too high");
                }
                if (guess < answer)
                {
                    MessageBox.showMessage("You're close and Too low");
                }
            }
            else if (guess > answer)
            {
                MessageBox.showMessage("Too high");
            }
            else
            {
                MessageBox.showMessage("Too low");
            }
        }
        MessageBox.showMessage("You Lost. The number was " + answer);
*/

}
