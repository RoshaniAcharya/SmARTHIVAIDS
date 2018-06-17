package com.example.roshani.smarthivaids;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

class NewAdapter extends BaseAdapter {
    Context c ;
    String[] myname,myaddress;
    public NewAdapter(Information information, String[] name, String[] address) {
        c=information;
        myname = name;
        myaddress = address;

    }


    @Override
    public int getCount() {
        return myname.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(c).inflate(R.layout.newlayout,null);
        TextView nameTV=convertView.findViewById(R.id.text1);
        TextView addressTV=convertView.findViewById(R.id.text2);

        addressTV.setText(myaddress[position]);
        nameTV.setText(myname[position]);


        return convertView;
    }
}
