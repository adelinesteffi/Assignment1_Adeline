package com.example.assignment1_adeline;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity implements View.OnClickListener {

    EditText CalculateString;
    Button One;
    Button two;
    Button Three;
    Button Four;
    Button Five;
    Button Six;
    Button Seven;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    public void onClick(View view) {

    }
}
