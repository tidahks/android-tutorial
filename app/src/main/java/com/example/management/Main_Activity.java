package com.example.management;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText id__text=(EditText) findViewById(R.id.id__text);
        EditText password__text=(EditText) findViewById(R.id.password__text);
        TextView _textview2=(TextView) findViewById(R.id._textview2);
    }
}