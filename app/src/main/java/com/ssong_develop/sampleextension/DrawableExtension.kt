package com.ssong_develop.sampleextension

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import androidx.annotation.Px

fun Drawable.resize(context: Context, @Px widthSize: Int, @Px heightSize: Int): Drawable {
    val bitmap = Bitmap.createBitmap(widthSize,heightSize,Bitmap.Config.ARGB_8888)
    val canvas = Canvas(bitmap)
    setBounds(0,0,widthSize,heightSize)
    draw(canvas)
    return BitmapDrawable(context.resources,bitmap)
}