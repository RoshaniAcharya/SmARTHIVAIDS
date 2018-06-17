package com.example.roshani.smarthivaids;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import static android.app.PendingIntent.getActivity;

public class Information extends AppCompatActivity {
    ListView lv;
    String[] name={"Stage 1","Stage 2","Stage 3","Stage 4"};
    String[] address={"Around one to four weeks after becoming infected with HIV, some people will experience symptoms that can feel a lot like flu." +
            " This may not last long (a week or two) and you may only get some of the flu symptoms – or none at all. Experiencing these symptoms alone is not a reliable way of diagnosing HIV.\n" +
            "\n" +
            "You should always visit your doctor if you are worried you have" +
            " been at risk of HIV infection, even if you don’t feel unwell or have any of the followi" +
            "ng symptoms. They can then arrange for you to have an HIV test.","Once the seroconversion " +
            "stage is over, many people start to feel better. In fact, the HIV virus may not reveal any other " +
            "symptoms for up to 10 or even 15 years (depending on age, background and overall health). However," +
            " the virus will still be active, infecting new cells and making copies of itself. " +
            "Over time this will cause a lot of damage to your immune system.","By the third stage of HIV infection" +
            " there has been a lot of damage to your immune system. At this point, you are more likely to get serious " +
            "infections or bacterial and fungal diseases that you would otherwise " +
            "be able to fight off. These infections are referred to as ‘opportunistic infections’.","If you have advanced HIV (with AIDS-defining symptoms)," +
            " it is really important to get the right treatment as soon as possible. With treatment it is still possible to recover from AIDS-related " +
            "infections and diseases and bring HIV under control."};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);
        lv = findViewById(R.id.list);
        lv.setAdapter(new NewAdapter(Information.this,name,address) );
    }


}

