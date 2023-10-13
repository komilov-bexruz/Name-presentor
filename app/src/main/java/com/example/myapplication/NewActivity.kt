package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.window.SplashScreen

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // handl splash screen translition, set this method just before calling setContentView()

        setContentView(R.layout.activity_new)
    }
}