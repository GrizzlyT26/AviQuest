package com.example.aviquest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val textViewClickMe = findViewById<TextView>(R.id.signRedirect)

        textViewClickMe.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@Login, Register::class.java)
            startActivity(intent)
        })


    }
}