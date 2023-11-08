package com.example.assignment1_adeline;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity  {
    boolean validated = false;
    public  boolean isValidInput(String input) {
        Log.d("testing","sting ip in validate "+input);
        Log.d("testing","in validate");
        // Define a regular expression pattern to match one-digit numbers and valid operators
       // String pattern = "^[0-9]([+\\-*/=][0-9])*[0-9]$"; // Matches one digit (0-9) followed by one of the operators +, -, *, /, =
        String pattern = "^[0-9]([+\\-*/=][0-9])*$";
        // Check if the input matches the pattern
        return input.matches(pattern);
    }
    public int performCal(String input)
    {
        Log.d("testing","sting ip in perform cal "+input);
        int result =0;
        char[] charArray = input.toCharArray();
        int firstOperand , secondOperand;
        char operator;
        firstOperand =Integer.parseInt(String.valueOf(charArray[0]));
        Log.d("testing","first op"+firstOperand);
        Log.d("testing","charArray.length "+charArray.length);


        for(int i=0; i<charArray.length-1;i+=2)
        {
            secondOperand =Integer.parseInt(String.valueOf(charArray[i+2]));
            operator = charArray[i+1];
            Log.d("testing","i in loop "+i);
            Log.d("testing","first op"+firstOperand);
            Log.d("testing","2nd op"+secondOperand);
            Log.d("testing","op"+operator);


            switch (operator){
                case '+': result= firstOperand+secondOperand; break;
                case '-': result= firstOperand-secondOperand; break;
                case '*': result= firstOperand*secondOperand; break;
                case '/':
                    if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                }
                    break;
            }
            Log.d("testing","result after switch "+result);
            firstOperand=result;
            Log.d("testing","first op after switch"+firstOperand);
            Log.d("testing","i after switch "+i);
        }
        Log.d("testing","result returned "+result);
        return result;
    }
}
