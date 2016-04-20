package com.androidistanbul.databindingdemo.layoutdetails;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.androidistanbul.databindingdemo.R;
import com.androidistanbul.databindingdemo.databinding.ActivityLayoutDetailsBinding;

/**
 * Created by mertsimsek on 20/04/16.
 */
public class LayoutDetailsActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLayoutDetailsBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_layout_details);

        DetailedUser detailedUser = new DetailedUser();
        detailedUser.setName("Mert");
        detailedUser.setSurname("Simsek");
        detailedUser.setIsAdult(false);
        detailedUser.setAge(20);
        binding.setUser(detailedUser);

    }
}
