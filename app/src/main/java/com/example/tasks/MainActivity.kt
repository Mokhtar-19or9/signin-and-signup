package com.example.tasks

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailInput = findViewById<EditText>(R.id.emailEditText)
        val passwordInput = findViewById<EditText>(R.id.inputpassword)
        val signInBtn = findViewById<Button>(R.id.signInButton)
        val googleBtn = findViewById<ImageButton>(R.id.googleBtn)
        val facebookBtn = findViewById<ImageButton>(R.id.facebookBtn)
        val twitterBtn = findViewById<ImageButton>(R.id.twitterBtn)
        val signupText = findViewById<TextView>(R.id.signupText)

        signInBtn.setOnClickListener {
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            }
        }

        googleBtn.setOnClickListener {
            Toast.makeText(this, "Google clicked", Toast.LENGTH_SHORT).show()
        }
        facebookBtn.setOnClickListener {
            Toast.makeText(this, "Facebook clicked", Toast.LENGTH_SHORT).show()
        }
        twitterBtn.setOnClickListener {
            Toast.makeText(this, "Twitter clicked", Toast.LENGTH_SHORT).show()
        }
        signupText.setOnClickListener{
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }
    }

}
