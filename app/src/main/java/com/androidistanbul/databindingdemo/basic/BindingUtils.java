package com.androidistanbul.databindingdemo.basic;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by mertsimsek on 23/04/16.
 */
public class BindingUtils {

    @BindingAdapter({"android:src", "app:error"})
    public static void loadImage(ImageView view, String url, Drawable error){
        Picasso.with(view.getContext())
                .load(url)
                .error(error)
                .into(view);
    }

}
