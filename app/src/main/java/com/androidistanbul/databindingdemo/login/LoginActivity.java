package com.androidistanbul.databindingdemo.login;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.androidistanbul.databindingdemo.R;
import com.androidistanbul.databindingdemo.databinding.ActivityLoginBinding;

/**
 * Created by mertsimsek on 24/04/16.
 */
public class LoginActivity extends AppCompatActivity implements LoginViewModel.LoginListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        binding.setViewModel(new LoginViewModel(this));
    }

    @Override
    public void onLoggedIn() {
        Log.v("TEST", "Logged In.");
    }
}
