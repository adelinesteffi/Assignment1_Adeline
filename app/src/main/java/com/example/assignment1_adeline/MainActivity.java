package com.example.assignment1_adeline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Calculator calObj= new Calculator();

    EditText CalculateString;
    Button One;
    Button Two;
    Button Three;
    Button Four;
    Button Five;
    Button Six;
    Button Seven;

    Button Eight, Nine,Zero, Multiply, Divide, Add, Subtract, EqualTo, Reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalculateString = findViewById(R.id.display);
        One = findViewById(R.id.OneButton);
        Two = findViewById(R.id.TwoButton);
        Three = findViewById(R.id.ThreeButton);
        Four = findViewById(R.id.FourButton);
        Five = findViewById(R.id.FiveButton);
        Six = findViewById(R.id.SixButton);
        Seven = findViewById(R.id.SevenButton);
        Eight = findViewById(R.id.EightButton);
        Nine = findViewById(R.id.NineButton);
        Zero = findViewById(R.id.ZeroButton);
        Add = findViewById(R.id.PlusButton);
        Subtract = findViewById(R.id.MinusButton);
        Divide = findViewById(R.id.DivisionButton);
        Multiply = findViewById(R.id.MultiplicationButton);
        EqualTo = findViewById(R.id.EqualToButton);
        Reset = findViewById(R.id.ResetButton);
        One.setOnClickListener(this);
        Two.setOnClickListener(this);
        Three.setOnClickListener(this);
        Four.setOnClickListener(this);
        Five.setOnClickListener(this);
        Six.setOnClickListener(this);
        Seven.setOnClickListener(this);
        Eight.setOnClickListener(this);
        Nine.setOnClickListener(this);
        Zero.setOnClickListener(this);
        Subtract.setOnClickListener(this);
        Multiply.setOnClickListener(this);
        Add.setOnClickListener(this);
        Divide.setOnClickListener(this);
        EqualTo.setOnClickListener(this);
        Reset.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        // Get the text of the button that was clicked
        Button clickedButton = (Button) view;
        String buttonText = clickedButton.getText().toString();

        // Get the current text in the EditText
        String currentText = CalculateString.getText().toString();
if(clickedButton != EqualTo && clickedButton != Reset) {
    // Append the button's text to the current text
    String updatedText = currentText + buttonText;
    Log.d("testing", "in onclick");
    // Set the updated text in the EditText
    CalculateString.setText(updatedText);
}
        if(clickedButton == EqualTo)
        {
            Log.d("testing","equal to pressed");
           if( calObj.isValidInput(currentText))
            {
                Log.d("testing","in if");
                Log.d("testing","sting ip in if currentText  "+currentText);
              int result=  calObj.performCal(currentText);
                Log.d("testing","result in main "+result);
                String resultString = String.valueOf(result);
                Log.d("testing","resultString in main "+resultString);
                CalculateString.setText(currentText+"="+resultString);
            }
           else {
               // Show a toast message for invalid input
               Log.d("testing","in else");
               Toast.makeText(this, "Enter one-digit number or valid operator", Toast.LENGTH_SHORT).show();
           }

            }
        if (clickedButton == Reset) {
            Log.d("testing", "in reset btn clear");
            CalculateString.setText("");
        }

    }
}