package com.example.palmdigital.textviewoutput2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textViewDisplayTop;
    TextView textViewDisplayMiddle;
    TextView textViewDisplayBottom;
    int num1;
    int num2;
    int sum;
    int diffrence;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageViewNum1 = (ImageView) findViewById(R.id.imageView14);
        ImageView imageViewNum2 = (ImageView) findViewById(R.id.imageView13);
        ImageView imageViewNum3 = (ImageView) findViewById(R.id.imageView12);
        ImageView imageViewNum4 = (ImageView) findViewById(R.id.imageView11);
        ImageView imageViewNum5 = (ImageView) findViewById(R.id.imageView10);
        ImageView imageViewNum6 = (ImageView) findViewById(R.id.imageView7);
        ImageView imageViewNum7 = (ImageView) findViewById(R.id.imageView6);
        ImageView imageViewNum8 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageViewNum9 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageViewNum11 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageViewNum12 = (ImageView) findViewById(R.id.imageView15);
        ImageView imageViewNum13 = (ImageView) findViewById(R.id.imageView16);
        ImageView imageViewNum14 = (ImageView) findViewById(R.id.imageView17);
        ImageView imageViewNum15 = (ImageView) findViewById(R.id.imageView18);
        ImageView imageViewNum16 = (ImageView) findViewById(R.id.imageView19);
        ImageView imageViewNum17 = (ImageView) findViewById(R.id.imageView20);
        ImageView imageViewNum18 = (ImageView) findViewById(R.id.imageView21);
        ImageView imageViewNum19 = (ImageView) findViewById(R.id.imageView22);
        ImageView imageViewNum20 = (ImageView) findViewById(R.id.imageView23);
        ImageView imageViewPlus = (ImageView) findViewById(R.id.imageView);
        ImageView imageViewMinus = (ImageView) findViewById(R.id.imageView2);
        textViewDisplayTop = (TextView) findViewById(R.id.textView);
        textViewDisplayMiddle = (TextView) findViewById(R.id.textView3);
        textViewDisplayBottom = (TextView) findViewById(R.id.textView4);

        imageViewNum1.setOnClickListener(this);
        imageViewNum2.setOnClickListener(this);
        imageViewNum3.setOnClickListener(this);
        imageViewNum4.setOnClickListener(this);
        imageViewNum5.setOnClickListener(this);
        imageViewNum6.setOnClickListener(this);
        imageViewNum7.setOnClickListener(this);
        imageViewNum8.setOnClickListener(this);
        imageViewNum9.setOnClickListener(this);
        imageViewNum11.setOnClickListener(this);
        imageViewNum12.setOnClickListener(this);
        imageViewNum13.setOnClickListener(this);
        imageViewNum14.setOnClickListener(this);
        imageViewNum15.setOnClickListener(this);
        imageViewNum16.setOnClickListener(this);
        imageViewNum17.setOnClickListener(this);
        imageViewNum18.setOnClickListener(this);
        imageViewNum19.setOnClickListener(this);
        imageViewNum20.setOnClickListener(this);
        imageViewPlus.setOnClickListener(this);
        imageViewMinus.setOnClickListener(this);
    }

        public void onClick (View view) {

            if (view.getId() == R.id.imageView14) {
                textViewDisplayTop.setText("1");
                num1 = 1;
            }
            if (view.getId() == R.id.imageView13) {
                textViewDisplayTop.setText("2");
                num1 = 2;
            }
            if (view.getId() == R.id.imageView12) {
                textViewDisplayTop.setText("3");
                num1 = 3;
            }
            if (view.getId() == R.id.imageView11) {
                textViewDisplayTop.setText("4");
                num1 = 4;
            }
            if (view.getId() == R.id.imageView10) {
                textViewDisplayTop.setText("5");
                num1 = 5;
            }
            if (view.getId() == R.id.imageView7) {
                textViewDisplayTop.setText("6");
                num1 = 6;

            }
            if (view.getId() == R.id.imageView6) {
            textViewDisplayTop.setText("7");
            num1 = 7;
        }
            if (view.getId() == R.id.imageView5) {
            textViewDisplayTop.setText("8");
            num1 = 8;
        }
            if (view.getId() == R.id.imageView4) {
            textViewDisplayTop.setText("9");
            num1 = 9;
        }

            if (view.getId() == R.id.imageView3) {
                textViewDisplayMiddle.setText("1");
                num2 = 1;
            }
            if (view.getId() == R.id.imageView15) {
                textViewDisplayMiddle.setText("2");
                num2 = 2;
            }
            if (view.getId() == R.id.imageView16) {
                textViewDisplayMiddle.setText("3");
                num2 = 3;
            }
            if (view.getId() == R.id.imageView17) {
                textViewDisplayMiddle.setText("4");
                num2 = 4;
            }
            if (view.getId() == R.id.imageView18) {
                textViewDisplayMiddle.setText("5");
                num2 = 5;
            }
            if (view.getId() == R.id.imageView19) {
                textViewDisplayMiddle.setText("6");
                num2 = 6;
            }
            if (view.getId() == R.id.imageView20) {
                textViewDisplayMiddle.setText("7");
                num2 = 7;
            }
            if (view.getId() == R.id.imageView21) {
                textViewDisplayMiddle.setText("8");
                num2 = 8;
            }
            if (view.getId() == R.id.imageView22) {
                textViewDisplayMiddle.setText("9");
                num2 = 9;
            }

            if (view.getId() == R.id.imageView2) {
                 diffrence = 2;
            }
            if (view.getId() == R.id.imageView) {
                diffrence = 1;
            }


            if (view.getId() == R.id.imageView23) {
            }                if (diffrence == 1) {
                sum = num1 + num2;
            }
            if (diffrence == 2) {
                sum = num1 - num2;
            }



            textViewDisplayBottom.setText("" + sum);







        }
}



