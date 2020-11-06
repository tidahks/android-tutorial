package com.example.management;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//레이아웃에있는것 가져오기
        EditText id_register_text=(EditText) findViewById(R.id.id__text);
        EditText id_register_password=(EditText) findViewById(R.id.password__text);
        Button login__button=(Button) findViewById(R.id.login__button);
        TextView register__button=(TextView)findViewById(R.id.register__button);
                                                //매개변수 공부
        register__button.setOnClickListener(new View.OnClickListener(){
            @Override
            //회원가입버튼클릭시 register_activity 실행
            public void  onClick(View view){
                Intent register__intent=new Intent(login_activity.this,register_activity.class);
                login_activity.this.startActivity(register__intent);
            }
        });
    }
}