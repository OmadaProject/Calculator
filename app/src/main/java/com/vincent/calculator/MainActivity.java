package com.vincent.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button butOne, butTwo, butThree, butFour, butFive, butSix, butSeven, butEight, butNine, butZero, butPlus, butMinus, butMultiply, butDivide, butEquals, butDecimal, butClear;
    TextView editText;

    double valueOne = 0, valueTwo = 0;

    boolean addNumbers, subNumbers, multNumbers, divNumbers, decNumbers;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butOne = findViewById(R.id.button1);
        butTwo = findViewById(R.id.button2);
        butThree = findViewById(R.id.button3);
        butFour = findViewById(R.id.button4);
        butFive = findViewById(R.id.button5);
        butSix = findViewById(R.id.button6);
        butSeven = findViewById(R.id.button7);
        butEight = findViewById(R.id.button8);
        butNine = findViewById(R.id.button9);
        butZero = findViewById(R.id.button0);
        butPlus = findViewById(R.id.buttonPlus);
        butMinus = findViewById(R.id.buttonMinus);
        butMultiply = findViewById(R.id.buttonMultiply);
        butDivide = findViewById(R.id.buttonDivide);
        butEquals = findViewById(R.id.buttonEquals);
        butDecimal = findViewById(R.id.buttonDot);
        butClear = findViewById(R.id.buttonClear);

        editText = findViewById(R.id.textViewDisplay);
    }
}
