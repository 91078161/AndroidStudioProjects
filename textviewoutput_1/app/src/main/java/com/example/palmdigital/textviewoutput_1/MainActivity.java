package com.example.palmdigital.textviewoutput_1;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //fields
    TextView textViewDisplayTop;
    TextView textViewDisplayBottom;
    TextView textViewDisplayBottom2;
    int num1 = R.id.textView;
    int num2 = R.id.textView2;
    int sum = R.id.textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewNum1 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageViewNum2 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageViewNum3 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageViewNum8 = (ImageView) findViewById(R.id.imageView8);
        ImageView imageViewNum9 = (ImageView) findViewById(R.id.imageView9);
        ImageView imageViewNum10 = (ImageView) findViewById(R.id.imageView10);
        ImageView imageViewNum6 = (ImageView) findViewById(R.id.imageView6);
         textViewDisplayTop = (TextView) findViewById(R.id.textView);
        textViewDisplayBottom = (TextView) findViewById(R.id.textView2);
        textViewDisplayBottom2 = (TextView) findViewById(R.id.textView3);

        imageViewNum1.setOnClickListener(this);
        imageViewNum2.setOnClickListener(this);
        imageViewNum3.setOnClickListener(this);
        imageViewNum8.setOnClickListener(this);
        imageViewNum9.setOnClickListener(this);
        imageViewNum10.setOnClickListener(this);
        imageViewNum6.setOnClickListener(this);





    }

    public void onClick(View view) {


        if (view.getId() == R.id.imageView2) {
        textViewDisplayTop.setText("1");
        num1 = 1;
        }
        if (view.getId() == R.id.imageView3) {
         textViewDisplayTop.setText("2");
             num1 = 2;
        }
        if (view.getId() == R.id.imageView4) {
            textViewDisplayTop.setText("3");
            num1 = 3;
        }
        if (view.getId() == R.id.imageView8) {
            textViewDisplayBottom.setText("4");
            num2 = 4;
        }
        if (view.getId() == R.id.imageView9) {
            textViewDisplayBottom.setText("5");
            num2 = 5;
        }
        if (view.getId() == R.id.imageView10) {
            textViewDisplayBottom.setText("6");
            num2 = 6;
        }
        if (view.getId() == R.id.imageView6) {
            int sum = num1 + num2;
            textViewDisplayBottom2.setText("" + sum);
        }
    }
}