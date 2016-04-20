package com.androidistanbul.databindingdemo.basic;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.androidistanbul.databindingdemo.R;
import com.androidistanbul.databindingdemo.databinding.ActivityBasicBindingBinding;

/**
 * Created by mertsimsek on 20/04/16.
 */
public class BasicBindingActivity extends AppCompatActivity{

    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBasicBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_basic_binding);
        user = new User("Mert","SIMSEK");
        binding.setUser(user);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                user.setName("John");
                user.setSurname("Doe");
            }
        }, 2000);
    }
}
