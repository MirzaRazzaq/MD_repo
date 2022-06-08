package com.bangkit.getguide.authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bangkit.getguide.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

<<<<<<< Updated upstream
        supportActionBar?.hide()

        binding.btnRegister.setOnClickListener {
            SignUp()
=======
        auth = FirebaseAuth.getInstance()

        binding.btnRegister.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.btnRegister.setOnClickListener {
            val email = binding.edtEmail.text.toString()
            val password = binding.edtPassword.text.toString()

            //Validasi email
            if (email.isEmpty()) {
                binding.edtEmail.error = "Email Harus Diisi"
                binding.edtEmail.requestFocus()
                return@setOnClickListener
            }

            //Validasi email tidak sesuai
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                binding.edtEmail.error = "Email Tidak Valid"
                binding.edtEmail.requestFocus()
                return@setOnClickListener
            }

            //Validasi password
            if (password.isEmpty()) {
                binding.edtPassword.error = "Password Harus Diisi"
                binding.edtPassword.requestFocus()
                return@setOnClickListener
            }

            //Validasi panjang password
            if (password.length < 6) {
                binding.edtPassword.error = "Password Minimal 6 Karakter"
                binding.edtPassword.requestFocus()
                return@setOnClickListener
            }

            RegisterFirebase(email, password)
>>>>>>> Stashed changes
        }
    }

    private fun SignUp(){
        // do something

        val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
        startActivity(intent)
    }
}