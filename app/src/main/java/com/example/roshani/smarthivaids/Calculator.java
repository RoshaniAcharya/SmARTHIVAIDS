package com.example.roshani.smarthivaids;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    EditText Weight;
    EditText Height;
    Button btn1;
    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        Weight=findViewById(R.id.weight);
        Height=findViewById(R.id.height);
        btn1=findViewById(R.id.calc);
        Result=findViewById(R.id.result);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String heightStr = Height.getText().toString();
                String weightStr = Weight.getText().toString();
                if(TextUtils.isEmpty(heightStr)){
                    Height.setError("Please enter your height");
                    Height.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(weightStr)){
                    Weight.setError("Please enter your weight");
                    Weight.requestFocus();
                    return;
                }
                float weight = Float.parseFloat(weightStr);
                float height = Float.parseFloat(heightStr)/100;
                //calculating bmivalue
                float bmiValue = calculateBMI(weight, height);


                //the meaning of the bmi value
                String bmiInterpretation = interpretBMI(bmiValue);

                Result.setText(String.valueOf(bmiValue + "-" + bmiInterpretation));

            }
        });
        Weight.setText(null);
        Height.setText(null);


    }
    private float calculateBMI (float weight, float height) {
        return (float) (weight / (height * height));
    }
    private String interpretBMI(float bmiValue) {

        if (bmiValue < 16) {
            return "Severely underweight";
        } else if (bmiValue < 18.5) {

            return "Underweight";
        } else if (bmiValue < 25) {

            return "Normal";
        } else if (bmiValue < 30) {

            return "Overweight";
        } else {
            return "Obese";
        }
    }
}




