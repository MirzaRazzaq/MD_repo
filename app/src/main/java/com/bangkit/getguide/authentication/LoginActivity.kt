package com.bangkit.getguide.authentication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import com.bangkit.getguide.HomeActivity
import com.bangkit.getguide.R
import com.bangkit.getguide.databinding.ActivityLoginBinding
import com.bangkit.getguide.preference.Preference1Activity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportActionBar?.hide()

        binding.btnLogin.setOnClickListener {
            Login()
        }

        binding.btnRegister.setOnClickListener {
            Register()
        }
    }

    private fun Login(){
        // do something

//        val intent = Intent(this@LoginActivity, HomeActivity::class.java)
        val intent = Intent(this@LoginActivity, Preference1Activity::class.java)
        startActivity(intent)
        finish()
    }

    private fun Register(){
        // do something

        val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
        startActivity(intent)
    }
}