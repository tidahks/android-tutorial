package com.example.management;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class register_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
//레이아웃에있는것 가져오기
        EditText id_register_text=(EditText) findViewById(R.id.id__text);
        EditText id_register_password=(EditText) findViewById(R.id.password__text);
        EditText id_register_name=(EditText) findViewById(R.id.name__text);
        EditText id_register_age=(EditText) findViewById(R.id.age__text);

        Button register__button2=(Button) findViewById(R.id.register__button2);

    }
}