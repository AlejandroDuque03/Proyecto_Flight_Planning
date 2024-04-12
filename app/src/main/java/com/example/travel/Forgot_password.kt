package com.example.travel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Forgot_password : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        val tvGoLogin = findViewById<TextView>(R.id.tv_go_to_Login)
        tvGoLogin.setOnClickListener{
            goTologin()

        }
    }
    private fun goTologin(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}