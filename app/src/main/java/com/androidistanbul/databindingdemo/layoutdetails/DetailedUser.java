package com.androidistanbul.databindingdemo.layoutdetails;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.androidistanbul.databindingdemo.BR;

/**
 * Created by mertsimsek on 20/04/16.
 */
public class DetailedUser extends BaseObservable{
    String name;
    String surname;
    int age;
    boolean isAdult;
    String address;
    boolean isOnline;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
    @Bindable
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
        notifyPropertyChanged(BR.surname);
    }
    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    @Bindable
    public boolean isAdult() {
        return isAdult;
    }

    public void setIsAdult(boolean isAdult) {
        this.isAdult = isAdult;
        notifyPropertyChanged(BR.adult);
    }

    @Bindable
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        notifyPropertyChanged(BR.address);
    }

    @Bindable
    public boolean isOnline() {
        return isOnline;
    }

    public void setIsOnline(boolean isOnline) {
        this.isOnline = isOnline;
        notifyPropertyChanged(BR.online);
    }
}
