package com.example.management;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;


public class registerRequest extends StringRequest {
    final static private String URL="http://127.0.0.1/db/register.php";
    private Map<String,String> mapval; //map자료형
    public  registerRequest(String userid, String userpassword, String username, int userage, Response.Listener<String> listner) {
        super(Method.POST, URL, listner, null);

        mapval = new HashMap<>(); //hashmap 클래스호출
        mapval.put("userid", userid);
        mapval.put("userpassword",userpassword);
        mapval.put("username",username);
        mapval.put("userage",userage + "");
    }
        @Override
        public Map<String, String> getParams() {
            return mapval;
        }

    }
