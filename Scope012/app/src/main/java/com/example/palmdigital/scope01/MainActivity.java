package com.example.palmdigital.scope01;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

//we are out side the main actvity class
//we are outside any methods

//understanding how scope works is very important!!

public class MainActivity extends AppCompatActivity {
// in the MainActivity class, but I'm outside any mothods

    // fields - these Variables have classwide scope -- any code can see and use these varibles
    String myString;
    // declare a feild that is a double named enemyHealth
    Double enemyHealth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // here we are inside the onCreat() method which is inside the mainActivity class

        // when we 'declare' a varible we use the following format:\
        // dateType  varibleName; <=== this is a varible deacaration
        //some example
        int myInt; // <=== this is decarlaration a varible of datetype 'int' and named 'myInt'
        double myDouble; // <=== this is declaring a varile of dateType 'doubloe' named 'Mydouble'
        TextView textView_story; // <=== this is a varible of dateType 'TextView' named textView_story
        ImageView imageView_example; // <==== data type is ImageView, varibleName is imageView_ex

        // assigning a value to a declaring varible
        // after we declaring a varible; we can assign a value to it
        // varibleName = someValueOfTheSameDataTypeAsThe;
        // some examples;
        myInt = 10; // <=== setting the value of myInt to 10, myInt has dataType 'int' and 10 in an int
        myDouble = 20.12; // myDouble gets the value 20.12
        textView_story = (TextView) findViewById(R.id.textView_st); // set the value of
        //textView story to the UI element
        //R.id.textView_st

        imageView_example = (ImageView) findViewById(R.id.imageView);

        // you can declare and assign in the same time
        // dataType Variablename = some someValueOfTheSameDataTypeAsThe;
        //Some examples
        int myInt2 = 25; //  <== this is a declaration and assigment
        myInt2 = 50; // <==== this is only assigment
        // The DIFFRENCEW is the dataType!!!!!!!!'int'
         myString = "this is a string"; // <==  this is a declaration and an assigment
        myString = "This is another String"; // <=== this is just assigment
        enemyHealth = 2.01;

        //!!!!!!!!!!!!!!!!!!!!!!! Where ever you declalre a varible determainds that varible scope!!!
        //in other words, if I declare a varible here in the onCreate() method, only
        //code in the Oncreat() can see it .... lets prove it




    } // end of onCreate method


    public void myAwesomeMethod01() {
         myString = "whats going on here...";
        enemyHealth = 2.03;
    }// end of myAwesomeMethod01

    public void myAwesomeMethod02() {
        enemyHealth = 2.04;
    }



}// end of class


// do not do stuff out here!!!