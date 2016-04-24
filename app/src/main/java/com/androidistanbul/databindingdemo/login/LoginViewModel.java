package com.androidistanbul.databindingdemo.login;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;

/**
 * Created by mertsimsek on 24/04/16.
 */
public class LoginViewModel {

    interface LoginListener{
        void onLoggedIn();
    }

    private LoginListener loginListener;
    public LoginRequest loginRequest;

    public LoginViewModel(LoginListener loginListener) {
        this.loginListener = loginListener;
        loginRequest = new LoginRequest();
    }

    public TextWatcher getEmailTextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                loginRequest.setEmail(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };
    }

    public TextWatcher getPasswordTextWatcher(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                loginRequest.setPassword(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };
    }

    public void onLoginClicked(View view){
        if(loginListener != null)
            loginListener.onLoggedIn();
    }

    public class LoginRequest extends BaseObservable{
        String email;
        String password;

        public LoginRequest() {
            email = "";
            password = "";
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
            notifyChange();
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
            notifyChange();
        }

        public boolean isValid(){
            return TextUtils.isValidEmail(email) && password.length() > 5;
        }
    }
}
