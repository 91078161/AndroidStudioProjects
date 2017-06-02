package org.palmdigital.encripted_v1;

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
        h
    }

    public void encrypt(View view) {
        EditText et_input = (EditText) findViewById(R.id.editText);
        EditText et_shift = (EditText) findViewById(R.id.editText2);
        String str_Input = et_input.getText().toString();
        String str_shift = et_shift.getText().toString();
        TextView output = (TextView) findViewById(R.id.textView);
        String str_output = output.getText().toString();
        int shift = Integer.parseInt(str_shift);
        int size = 26;
            char[] alphabet = new char[size];
            alphabet[0] = 'A';
            alphabet[1] = 'B';
            alphabet[2] = 'C';
            alphabet[3] = 'D';
            alphabet[4] = 'E';
            alphabet[5] = 'F';
            alphabet[6] = 'G';
            alphabet[7] = 'H';
            alphabet[8] = 'I';
            alphabet[9] = 'J';
            alphabet[10] = 'K';
            alphabet[11] = 'L';
            alphabet[12] = 'M';
            alphabet[13] = 'N';
            alphabet[14] = 'O';
            alphabet[15] = 'P';
            alphabet[16] = 'Q';
            alphabet[17] = 'R';
            alphabet[18] = 'S';
            alphabet[19] = 'T';
            alphabet[20] = 'U';
            alphabet[21] = 'V';
            alphabet[22] = 'W';
            alphabet[23] = 'X';
            alphabet[24] = 'Y';
            alphabet[25] = 'Z';

            int shiftCharIndex;
            int fixedCharIndex;
            String toUpperCase = str_Input.toUpperCase();
            for (int i = 0; i < str_Input.length(); i++) {
            }
            System.out.println();
            for (int i = 0; i < alphabet.length; i++) {
            }
            // A B C D E F G H I J K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z
            // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
            for (int i = 0; i < str_Input.length(); i++) {
                for (int j = 0; j < alphabet.length; j++) {
                    if (toUpperCase.charAt(i) == alphabet[j]) {
                        shiftCharIndex = j + shift;
                        fixedCharIndex = shiftCharIndex % 26;
                        str_output = str_output + alphabet[fixedCharIndex];
                    }
                }
                if (str_Input.charAt(i) == ' ') {
                    str_output += " ";
                }
            }
            output.setText(str_output);
            }
    }