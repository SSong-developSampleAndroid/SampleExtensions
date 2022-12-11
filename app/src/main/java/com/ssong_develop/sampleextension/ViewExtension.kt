package com.ssong_develop.sampleextension

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethod
import android.view.inputmethod.InputMethodManager

fun View.showKeyboard(
    requestFocus: Boolean = false
) {
    val inputMethodManager =
        context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.showSoftInput(this, 0)
    if (requestFocus) {
        this.requestFocus()
    }
}

fun View.hideKeyboard() {
    val inputMethodManager = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(windowToken,0)
}
