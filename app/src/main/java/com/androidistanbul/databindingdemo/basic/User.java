package com.androidistanbul.databindingdemo.basic;

import android.databinding.ObservableField;

/**
 * Created by mertsimsek on 20/04/16.
 */

public class User {
    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableField<String> surname = new ObservableField<>();

    public User(String name, String surname) {
        this.name.set(name);
        this.surname.set(surname);
    }
}

