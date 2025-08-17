package com.example.tasks

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.widget.*
import android.text.InputType
import android.view.MotionEvent
import android.widget.EditText



class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signupactivity) // اعمل layout جديد اسمه activity_sign_up.xml

        val signupButton = findViewById<Button>(R.id.signupBtn)
        val googleButton2 = findViewById<ImageButton>(R.id.googleBtn2)
        val facebookButton2 = findViewById<ImageButton>(R.id.facebookBtn2)
        val twitterButton2 = findViewById<ImageButton>(R.id.twitterBtn2)
        val createemail = findViewById<EditText>(R.id.editcreateemail)
        val password2 = findViewById<EditText>(R.id.editpassword)
        val confirmpassword2 = findViewById<EditText>(R.id.editconfirmpassword)

        signupButton.setOnClickListener{
            val email2 = createemail.text.toString()
            val password = password2.text.toString()
            val confirmpassword = confirmpassword2.text.toString()

            if (email2.isEmpty() || password.isEmpty() || confirmpassword.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            }
            else if (password != confirmpassword)
            {
                Toast.makeText(this, "check your password", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Sign Up Successful", Toast.LENGTH_SHORT).show()
            }
        }

        googleButton2.setOnClickListener {
            Toast.makeText(this, "Google clicked", Toast.LENGTH_SHORT).show()
        }
        facebookButton2.setOnClickListener {
            Toast.makeText(this, "Facebook clicked", Toast.LENGTH_SHORT).show()
        }
        twitterButton2.setOnClickListener {
            Toast.makeText(this, "Twitter clicked", Toast.LENGTH_SHORT).show()
        }
        }
}
