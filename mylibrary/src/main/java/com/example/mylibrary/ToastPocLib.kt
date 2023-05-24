package com.example.mylibrary

import android.content.Context
import android.widget.Toast

class ToastPocLib {
    fun ExibirToast(context: Context) {
        Toast.makeText(context, "Funfou!!!", Toast.LENGTH_LONG).show()
    }
}