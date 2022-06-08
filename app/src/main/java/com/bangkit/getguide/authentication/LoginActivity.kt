package com.bangkit.getguide.authentication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
<<<<<<< Updated upstream
import android.view.View
import com.bangkit.getguide.HomeActivity
import com.bangkit.getguide.R
import com.bangkit.getguide.databinding.ActivityLoginBinding
=======
import android.util.Patterns
import android.view.View
import android.widget.Toast
import com.bangkit.getguide.HomeActivity
import com.bangkit.getguide.R
import com.bangkit.getguide.databinding.ActivityLoginBinding
import com.bangkit.getguide.preference.Preference1Activity
import com.google.firebase.auth.FirebaseAuth
>>>>>>> Stashed changes

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

<<<<<<< Updated upstream
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
=======
        binding.btnRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        binding.btnLogin.setOnClickListener {
            val email = binding.edtEmail.text.toString()
            val password = binding.edtPassword.text.toString()

            //Validasi email
            if (email.isEmpty()){
                binding.edtEmail.error = "Email Harus Diisi"
                binding.edtEmail.requestFocus()
                return@setOnClickListener
            }

            //Validasi email tidak sesuai
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                binding.edtEmail.error = "Email Tidak Valid"
                binding.edtEmail.requestFocus()
                return@setOnClickListener
            }

            //Validasi password
            if (password.isEmpty()){
                binding.edtPassword.error = "Password Harus Diisi"
                binding.edtPassword.requestFocus()
                return@setOnClickListener
            }
>>>>>>> Stashed changes

        val intent = Intent(this@LoginActivity, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun Register(){
        // do something

        val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
        startActivity(intent)
    }
}