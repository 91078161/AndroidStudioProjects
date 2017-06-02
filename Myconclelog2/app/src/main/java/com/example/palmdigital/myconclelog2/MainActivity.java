package com.example.palmdigital.myconclelog2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{

    private int myInt;
    private int myDouble;
    private int myString;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myInt = setIntValue();
        Log.i("info", "myInt = " + myInt);
        double myDouble = setDoubleValue();
        Log.i("info", "myDouble = " + myDouble);
        Boolean myBoolean = setBooleanValue();
        Log.i("info", "myBoolean = " + myBoolean);
        float myFloat = setFloatValue();
        Log.i("info", "myFloat =" + myFloat);
        
    }

    public float setFloatValue() {
        return (4.5f + 2.3f);
    }

    public boolean setBooleanValue() {
        return false;
    }

    public double setDoubleValue() {
        return 10.987;
    }

    public int setIntValue()
    {
        return 10;
    }

}
