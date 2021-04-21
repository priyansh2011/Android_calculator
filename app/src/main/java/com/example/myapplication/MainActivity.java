package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {
    EditText firstVal,secondVal;
    TextView tvAns;
    Button add,subtract,multiply,divide,log,sin,cos,tan,xy,clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstVal=findViewById(R.id.edNumber1);
        secondVal=findViewById(R.id.edNumber2);
        tvAns=findViewById(R.id.tvanswer);
        add=findViewById(R.id.add);
        subtract=findViewById(R.id.subtract);
        multiply=findViewById(R.id.multiply);
        divide=findViewById(R.id.divide);
        log=findViewById(R.id.log);
        sin=findViewById(R.id.sin);
        cos=findViewById(R.id.cos);
        tan=findViewById(R.id.tan);
        xy=findViewById(R.id.exponent);
        clear=findViewById(R.id.Clear);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,ans;
                firstValue=Integer.parseInt(firstVal.getText().toString());
                secondValue=Integer.parseInt(secondVal.getText().toString());
                ans=firstValue + secondValue;
                tvAns.setText("Ans is = "+ans);
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,ans;
                firstValue=Integer.parseInt(firstVal.getText().toString());
                secondValue=Integer.parseInt(secondVal.getText().toString());
                ans=firstValue - secondValue;
                tvAns.setText("Ans is = "+ans);


            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,ans;
                firstValue=Integer.parseInt(firstVal.getText().toString());
                secondValue=Integer.parseInt(secondVal.getText().toString());
                ans=firstValue * secondValue;
                tvAns.setText("Ans is = "+ans);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,ans;
                firstValue=Integer.parseInt(firstVal.getText().toString());
                secondValue=Integer.parseInt(secondVal.getText().toString());
                ans=firstValue / secondValue;
                tvAns.setText("Ans is = "+ans);
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue;
                double ans;
                firstValue=Integer.parseInt(firstVal.getText().toString());
                ans=Math.log(firstValue);
                tvAns.setText("Ans is = "+ans);
            }
        });
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue;
                double ans;
                firstValue=Integer.parseInt(firstVal.getText().toString());
                ans=Math.sin(firstValue);
                tvAns.setText("Ans is = "+ans);
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue;
                double ans;
                firstValue=Integer.parseInt(firstVal.getText().toString());
                ans=Math.cos(firstValue);
                tvAns.setText("Ans is = "+ans);
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue;
                double ans;
                firstValue=Integer.parseInt(firstVal.getText().toString());
                ans=Math.tan(firstValue);
                tvAns.setText("Ans is = "+ans);
            }
        });
        xy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue;
                int secondValue;
                double ans;
                firstValue=Integer.parseInt(firstVal.getText().toString());
                secondValue=Integer.parseInt(secondVal.getText().toString());
                ans=Math.pow(firstValue,secondValue);
                tvAns.setText("Ans is = "+ans);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                firstVal.setText("");
                secondVal.setText("");
            }
        });

    }
    }
