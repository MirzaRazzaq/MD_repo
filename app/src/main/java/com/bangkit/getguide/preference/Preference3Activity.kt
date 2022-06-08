package com.bangkit.getguide.preference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bangkit.getguide.databinding.ActivityPreference3Binding

class Preference3Activity : AppCompatActivity() {
    private lateinit var binding: ActivityPreference3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPreference3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
    }
}