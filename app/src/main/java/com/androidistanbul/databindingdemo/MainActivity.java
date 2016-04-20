package com.androidistanbul.databindingdemo;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.androidistanbul.databindingdemo.basic.BasicBindingActivity;
import com.androidistanbul.databindingdemo.databinding.ActivityMainBinding;
import com.androidistanbul.databindingdemo.layoutdetails.LayoutDetailsActivity;

/**
 * Created by mertsimsek on 20/04/16.
 */
public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setActivity(this);
    }

    public void onButtonClicked(View view){
        Intent intent = null;
        switch (view.getId()){
            case R.id.buttonBasicBinding:
                intent = new Intent(MainActivity.this, BasicBindingActivity.class);
                break;
            case R.id.buttonLayoutDetails:
                intent = new Intent(MainActivity.this, LayoutDetailsActivity.class);
                break;
        }
        startActivity(intent);
    }
}
