package com.androidistanbul.databindingdemo.basic;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.androidistanbul.databindingdemo.BR;

/**
 * Created by mertsimsek on 20/04/16.
 */
public class User extends BaseObservable {
    String name;
    String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Bindable
    public String getName() {
        return name;
    }

    @Bindable
    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public void setSurname(String surname) {
        this.surname = surname;
        notifyPropertyChanged(BR.surname);
    }
}
