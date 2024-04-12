package com.example.travel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CreateCount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_count)
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