package com.androidistanbul.databindingdemo.login;

/**
 * Created by mertsimsek on 24/04/16.
 */
public class TextUtils {
    public final static boolean isValidEmail(CharSequence target) {
        return !android.text.TextUtils.isEmpty(target) && android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }
}
