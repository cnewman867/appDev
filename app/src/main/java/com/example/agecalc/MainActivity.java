package com.example.agecalc;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.btn1);
        b.setOnClickListener(this);
    }

    public void onClick(View view) {
        TextView tv = (TextView) findViewById(R.id.tv1);
        EditText et = (EditText) findViewById(R.id.et1);
        int yearOfBirth = 0;
        try {
            yearOfBirth = Integer.parseInt(et.getText().toString());
        } catch(NumberFormatException ex) {
            tv.setText("Please enter a year of birth");
        }


        int age = 2017 - yearOfBirth;

        if (yearOfBirth > 2017) {
            tv.setText("Year of birth cannot be in the future");

        } else if (yearOfBirth > 0){
        tv.setText("Your age is: " + String.valueOf(age));}
    }
}


