package com.example.management;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class register_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
//레이아웃에있는것 가져오기
        final EditText id__text=(EditText) findViewById(R.id.id__text);
        final EditText password__text=(EditText) findViewById(R.id.password__text);
        final EditText name__text=(EditText) findViewById(R.id.name__text);
        final EditText age__text=(EditText) findViewById(R.id.age__text);

        Button register__button=(Button) findViewById(R.id.register__button);

        register__button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String userid=id__text.getText().toString();
                String userpassword=password__text.getText().toString();
                String username=name__text.getText().toString();
                int userage=Integer.parseInt(age__text.getText().toString ());

                 //여기까지 사용될함수 registerRequest, onresponse
                Response.Listener<String> responselistener=new Response.Listener<String>(){
                    @Override
                    public void onResponse(String response){
                        try {

                            JSONObject jsonresponse = new JSONObject(response);
                            boolean success=jsonresponse.getBoolean("success");
                            if(success){
                                AlertDialog.Builder builder=new AlertDialog.Builder(register_activity.this);
                            builder.setMessage("회원등록성공")
                                    .setPositiveButton("확인",null)
                                    .create()
                                    .show();
                            Intent intent=new Intent(register_activity.this,login_activity.class);
                            register_activity.this.startActivity(intent);

                            }
                            else{
                                AlertDialog.Builder builder=new AlertDialog.Builder(register_activity.this);
                                builder.setMessage("회원등록실패")
                                        .setNegativeButton("다시시도",null)
                                        .create()
                                        .show();
                            }

                        }

                        catch (JSONException e){
                            e.printStackTrace();
                        }
                    }
                };
                registerRequest registerrequest=new registerRequest( userid,  userpassword,  username,  userage, responselistener );
                    RequestQueue queue = Volley.newRequestQueue(register_activity.this);
                    queue.add(registerrequest);
                }
        });
    }

}