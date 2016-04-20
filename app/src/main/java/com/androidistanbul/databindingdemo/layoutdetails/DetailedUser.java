package com.androidistanbul.databindingdemo.layoutdetails;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by mertsimsek on 20/04/16.
 */
public class DetailedUser extends BaseObservable{
    String name;
    String surname;
    int age;
    boolean isAdult;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Bindable
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Bindable
    public boolean isAdult() {
        return isAdult;
    }

    public void setIsAdult(boolean isAdult) {
        this.isAdult = isAdult;
    }
}
