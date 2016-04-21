package com.androidistanbul.databindingdemo.layoutdetails;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.androidistanbul.databindingdemo.R;
import com.androidistanbul.databindingdemo.databinding.DetailBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mertsimsek on 20/04/16.
 */
public class LayoutDetailsActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DetailBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_layout_details);

        List<DetailedUser> detailedUserList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            DetailedUser detailedUser = new DetailedUser();
            detailedUser.setName("mert");
            detailedUser.setSurname("simsek");
            detailedUser.setIsAdult(false);
            detailedUserList.add(detailedUser);
        }

        binding.setUser(detailedUserList.get(0));

        binding.setIndex(0);
        binding.setUserList(detailedUserList);

    }
}
