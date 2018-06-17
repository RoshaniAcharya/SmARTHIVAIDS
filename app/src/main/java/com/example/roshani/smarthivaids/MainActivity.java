package com.example.roshani.smarthivaids;

import android.content.Intent;
import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    ImageButton ibtn;
    TextView tv1,tv2,tv3,tv4;
    FrameLayout fl1,fl2,fl3;
    ImageView i1,i2,i3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ibtn=findViewById(R.id.image);
        tv1=findViewById(R.id.text1);
        tv2=findViewById(R.id.text2);
        tv3=findViewById(R.id.text3);
        tv4=findViewById(R.id.text4);
        fl1=findViewById(R.id.f1);
        fl2=findViewById(R.id.f2);
        fl3=findViewById(R.id.f3);
        i1=findViewById(R.id.img1);
        i2=findViewById(R.id.img2);
        i2=findViewById(R.id.img3);
        ibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Start.class);
                startActivity(i);
            }
        });
        fl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Calculator.class);
                startActivity(i);
            }
        });
        fl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Information.class);
                startActivity(i);
            }
        });
        fl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Performance.class);
                startActivity(i);
            }
        });
    }
}
