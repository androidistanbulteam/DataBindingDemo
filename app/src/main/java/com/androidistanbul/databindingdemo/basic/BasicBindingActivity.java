package com.androidistanbul.databindingdemo.basic;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.androidistanbul.databindingdemo.R;
import com.androidistanbul.databindingdemo.databinding.ActivityBasicBindingBinding;

import java.util.Map;

/**
 * Created by mertsimsek on 20/04/16.
 */
public class BasicBindingActivity extends AppCompatActivity{

    User user;
    ObservableArrayMap<String, Object> userMap = new ObservableArrayMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBasicBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_basic_binding);
        user = new User("Mert","SIMSEK");
        binding.setUser(user);

        userMap.put("firstname", "Mert");
        userMap.put("age", 18);

        binding.setUserMap(userMap);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                user.name.set("John");
                user.surname.set("Doe");

                userMap.put("firstname", "John");
                userMap.put("age", 23);
            }
        }, 2000);

    }
}
