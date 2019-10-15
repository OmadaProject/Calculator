package com.vincent.calculator;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



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


        butOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText.setText(editText.getText() +"1");
            }
        });

        butTwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText.setText(editText.getText() +"2");
            }
        });

        butThree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText.setText(editText.getText() +"3");
            }
        });

        butFour.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText.setText(editText.getText() +"4");
            }
        });

        butFive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText.setText(editText.getText() +"5");
            }
        });

        butSix.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText.setText(editText.getText() +"6");
            }
        });

        butSeven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText.setText(editText.getText() +"7");
            }
        });

        butEight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText.setText(editText.getText() +"8");
            }
        });

        butNine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText.setText(editText.getText() +"9");
            }
        });

        butZero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editText.setText(editText.getText() +"0");
            }
        });

        butPlus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (editText.getText().length() !=0) {
                    valueOne = Float.parseFloat(editText.getText() + "");
                    addNumbers = true;
                    decNumbers = false;
                    editText.setText(null);
                }
            }
        });
    }

}


