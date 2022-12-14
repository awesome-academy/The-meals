package com.example.themeal.util

import android.content.Context
import android.widget.ImageView
import androidx.annotation.DrawableRes
import com.bumptech.glide.Glide
import com.example.themeal.R

fun ImageView.loadImage(context: Context, url: String) {
    Glide.with(context)
        .load(url)
        .placeholder(R.mipmap.ic_launcher_foreground)
        .error(R.mipmap.ic_launcher_foreground)
        .fitCenter()
        .into(this)
}

fun ImageView.loadImage(context: Context, @DrawableRes url: Int) {
    Glide.with(context)
        .load(url)
        .placeholder(R.mipmap.ic_launcher_foreground)
        .error(R.mipmap.ic_launcher_foreground)
        .fitCenter()
        .into(this)
}
