package com.ssong_develop.sampleextension

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat

/** dp size to pixel size **/
fun Context.dpToPx(dp: Int): Int {
    val scale = resources.displayMetrics.density
    return (dp * scale).toInt()
}

fun Context.dpToPx(dp: Float): Int {
    val scale = resources.displayMetrics.density
    return (dp * scale).toInt()
}

fun Context.getDrawableOrThrow(@DrawableRes resourceId: Int): Drawable {
    return ContextCompat.getDrawable(this,resourceId)
        ?: throw IllegalArgumentException("Not exist resource id")
}