package com.example.palmdigital.textviewoutput2;

import android.media.Image;
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
    int total;
    int op;

    double Div;
    ImageView imageView21Plus;
    ImageView imageView22Minus;
    ImageView imageView23Times;
    ImageView imageView24Divide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageViewZero1 = (ImageView) findViewById(R.id.imageView);
        ImageView imageViewZero2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageViewNum1 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageViewNum2 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageViewNum3 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageViewNum4 = (ImageView) findViewById(R.id.imageView19);
        ImageView imageViewNum5 = (ImageView) findViewById(R.id.imageView20);
        ImageView imageViewNum6 = (ImageView) findViewById(R.id.imageView6);
        ImageView imageViewNum7 = (ImageView) findViewById(R.id.imageView7);
        ImageView imageViewNum8 = (ImageView) findViewById(R.id.imageView8);
        ImageView imageViewNum9 = (ImageView) findViewById(R.id.imageView9);
        ImageView imageViewNum11 = (ImageView) findViewById(R.id.imageView10);
        ImageView imageViewNum12 = (ImageView) findViewById(R.id.imageView11);
        ImageView imageViewNum13 = (ImageView) findViewById(R.id.imageView12);
        ImageView imageViewNum14 = (ImageView) findViewById(R.id.imageView13);
        ImageView imageViewNum15 = (ImageView) findViewById(R.id.imageView14);
        ImageView imageViewNum16 = (ImageView) findViewById(R.id.imageView15);
        ImageView imageViewNum17 = (ImageView) findViewById(R.id.imageView16);
        ImageView imageViewNum18 = (ImageView) findViewById(R.id.imageView17);
        ImageView imageViewNum19 = (ImageView) findViewById(R.id.imageView18);
        ImageView imageViewNum25 = (ImageView) findViewById(R.id.imageView25);
         imageView21Plus = (ImageView) findViewById(R.id.imageView21);
         imageView22Minus = (ImageView) findViewById(R.id.imageView22);
        imageView23Times = (ImageView) findViewById(R.id.imageView23);
         imageView24Divide = (ImageView) findViewById(R.id.imageView24);
        textViewDisplayTop = (TextView) findViewById(R.id.textView1);
        textViewDisplayMiddle = (TextView) findViewById(R.id.textView2);
        textViewDisplayBottom = (TextView) findViewById(R.id.textView3);

        imageViewZero1.setOnClickListener(this);
        imageViewZero2.setOnClickListener(this);
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
        imageViewNum25.setOnClickListener(this);
        imageView21Plus.setOnClickListener(this);
        imageView22Minus.setOnClickListener(this);
        imageView23Times.setOnClickListener(this);
        imageView24Divide.setOnClickListener(this);



    }

    public void onClick (View view) {

        if (view.getId() == R.id.imageView) {
            textViewDisplayTop.setText("0");
            num1 = 0;
        }

        if (view.getId() == R.id.imageView3) {
            textViewDisplayTop.setText("1");
            num1 = 1;
        }
        if (view.getId() == R.id.imageView4) {
            textViewDisplayTop.setText("2");
            num1 = 2;
        }
        if (view.getId() == R.id.imageView5) {
            textViewDisplayTop.setText("3");
            num1 = 3;
        }
        if (view.getId() == R.id.imageView19) {
            textViewDisplayTop.setText("4");
            num1 = 4;
        }
        if (view.getId() == R.id.imageView20) {
            textViewDisplayTop.setText("5");
            num1 = 5;
        }
        if (view.getId() == R.id.imageView6) {
            textViewDisplayTop.setText("6");
            num1 = 6;
        }
        if (view.getId() == R.id.imageView7) {
            textViewDisplayTop.setText("7");
            num1 = 7;
        }
        if (view.getId() == R.id.imageView8) {
            textViewDisplayTop.setText("8");
            num1 = 8;
        }
        if (view.getId() == R.id.imageView9) {
            textViewDisplayTop.setText("9");
            num1 = 9;
        }



        if (view.getId() == R.id.imageView21) {
            total = 1;color(1);
        }
        if (view.getId() == R.id.imageView22) {
            total = 2;
            color(2);

        }
        if (view.getId() == R.id.imageView24) {
            total = 3;
            op = 3;
            color(3);

        }
        if (view.getId() == R.id.imageView23) {
            total = 4;
            color(4);

        }


        if (view.getId() == R.id.imageView2) {
            textViewDisplayMiddle.setText("0");
            num2 = 0;
        }

        if (view.getId() == R.id.imageView10){
            textViewDisplayMiddle.setText("1");
            num2 = 1;
        }
        if (view.getId() == R.id.imageView11) {
            textViewDisplayMiddle.setText("2");
            num2 = 2;
        }
        if (view.getId() == R.id.imageView12) {
            textViewDisplayMiddle.setText("3");
            num2 = 3;
        }
        if (view.getId() == R.id.imageView13) {
            textViewDisplayMiddle.setText("4");
            num2 = 4;
        }
        if (view.getId() == R.id.imageView14) {
            textViewDisplayMiddle.setText("5");
            num2 = 5;
        }
        if (view.getId() == R.id.imageView15) {
            textViewDisplayMiddle.setText("6");
            num2 = 6;
        }
        if (view.getId() == R.id.imageView16) {
            textViewDisplayMiddle.setText("7");
            num2 = 7;
        }
        if (view.getId() == R.id.imageView17) {
            textViewDisplayMiddle.setText("8");
            num2 = 8;
        }
        if (view.getId() == R.id.imageView18) {
            textViewDisplayMiddle.setText("9");
            num2 = 9;
        }

        if (total == 1) {
            sum = num1 + num2;
        }
        if (total == 2) {
            sum = num1 - num2;
        }
        if (total == 3) {
            sum = num1 * num2;
        }
        if (total == 4) {
            if (num1 == 0 || num2 == 0) {

            } else {
                Div = num1 / num2;
            }
        }
            if (view.getId() == R.id.imageView25) {

                if (num1 == 0 || num2 == 0 && total == 4) {
                    textViewDisplayBottom.setText("Error. Cant divide by zero");
                } else if (total == 4) {
                    textViewDisplayBottom.setText("" + Div);
                } else {
                    textViewDisplayBottom.setText("" + sum);
                }
            }


        }
    public void color(int op) {
        if (op == 1) {
            imageView21Plus.setBackgroundColor(0xff0000ff);
            imageView22Minus.setBackgroundColor(0xffffffff);
            imageView24Divide.setBackgroundColor(0xfffffff);
            imageView23Times.setBackgroundColor(0xfffffff);
        }
        if (op == 2) {
            imageView21Plus.setBackgroundColor(0xffffffff);
            imageView22Minus.setBackgroundColor(0xff0000ff);
            imageView24Divide.setBackgroundColor(0xfffffff);
            imageView23Times.setBackgroundColor(0xfffffff);
        }
        if (op == 3) {
            imageView21Plus.setBackgroundColor(0xffffffff);
            imageView22Minus.setBackgroundColor(0xffffffff);
            imageView24Divide.setBackgroundColor(0xff0000ff);
            imageView23Times.setBackgroundColor(0xfffffff);
        }
        if (op == 4) {
            imageView21Plus.setBackgroundColor(0xffffffff);
            imageView22Minus.setBackgroundColor(0xffffffff);
            imageView24Divide.setBackgroundColor(0xfffffff);
            imageView23Times.setBackgroundColor(0xff0000ff);
        }
    }

}
