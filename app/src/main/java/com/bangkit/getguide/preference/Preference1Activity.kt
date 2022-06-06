package com.bangkit.getguide.preference

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bangkit.getguide.databinding.ActivityPreference1Binding

class Preference1Activity : AppCompatActivity() {
    private lateinit var binding: ActivityPreference1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreference1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button1.setOnClickListener {
            toPref2()
        }
    }

    private fun toPref2(){
        val intent = Intent(this@Preference1Activity, Preference2Activity::class.java)
        startActivity(intent)
    }
}