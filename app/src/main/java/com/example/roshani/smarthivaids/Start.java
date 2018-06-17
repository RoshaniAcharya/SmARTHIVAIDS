package com.example.roshani.smarthivaids;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Start extends AppCompatActivity{
    TextView textView;
    Button button1,button2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        textView=findViewById(R.id.tv1);
        button1=findViewById(R.id.btn_login);
        button2=findViewById(R.id.btn_get_started);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Start.this,SignupActivity.class);
                startActivity(i);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Start.this,LoginActivity.class);
                startActivity(i);
            }
        });
    }
}
