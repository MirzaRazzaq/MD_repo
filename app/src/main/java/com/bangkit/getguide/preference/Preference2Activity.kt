package com.bangkit.getguide.preference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bangkit.getguide.R

class Preference2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preference2)

        supportActionBar?.hide()
    }
}