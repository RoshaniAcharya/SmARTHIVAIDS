package com.example.roshani.smarthivaids;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Performance extends AppCompatActivity{
    TextView textView;
    EditText editText1,editText2,editText3,editText4,editText5,editText6,editText7;
    Button btn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.performance);
        textView=findViewById(R.id.login_title);
        editText1=findViewById(R.id.et1);
        editText2=findViewById(R.id.et2);
        editText3=findViewById(R.id.et3);
        editText4=findViewById(R.id.et4);
        editText5=findViewById(R.id.et5);
        editText6=findViewById(R.id.et6);
        editText7=findViewById(R.id.et7);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Performance.this, "Meter under construction!!!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
