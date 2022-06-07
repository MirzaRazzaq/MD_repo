package com.bangkit.getguide.preference

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bangkit.getguide.HomeActivity
import com.bangkit.getguide.R
import com.bangkit.getguide.databinding.ActivityPreference2Binding

class Preference2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityPreference2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreference2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button1.setOnClickListener {
            // do something

            toHome()
        }

        binding.button2.setOnClickListener {
            // do something

            toHome()
        }

        binding.button3.setOnClickListener {
            // do something

            toHome()
        }

        binding.button4.setOnClickListener {
            // do something

            toHome()
        }

        binding.button5.setOnClickListener {
            // do something

            toHome()
        }
    }

    private fun toHome(){
        val intent = Intent(this@Preference2Activity, HomeActivity::class.java)
        startActivity(intent)
    }
}