package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Button btnANS,btnAg;
    TextView showAns;
    EditText getVal;
    Button btnc2f;
    Button btnf2c;
    Double x;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnANS=findViewById(R.id.btnANS);
        getVal=findViewById(R.id.getVal);
        showAns=findViewById(R.id.showAns);
        btnc2f=findViewById(R.id.btnc2f);
        btnf2c=findViewById(R.id.btnf2c);
        btnAg=findViewById(R.id.btnAg);
        btnANS.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(getVal.getText().toString().isEmpty()){
                    showAns.setText("Please give Temperature");
                }
                else{
                    x = Double.parseDouble(String.valueOf(getVal.getText()));
                    if(btnc2f.isShown()){
                        x =(x*9)/5+32;
                        showAns.setText(String.valueOf(x) +"Degree f");
                    }
                    else if(btnf2c.isShown()){
                        x = (x-32)*5/9;
                        showAns.setText( String.valueOf(x) + "Degree c");
                    }
                    else {
                        showAns.setText("Please select an option");
                    }
                }
            }
        });

    }
}