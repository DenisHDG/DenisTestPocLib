package com.example.denistestpoclib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.ToastPocLib

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toastPocLib = ToastPocLib()
        toastPocLib.ExibirToast(this)
    }
}