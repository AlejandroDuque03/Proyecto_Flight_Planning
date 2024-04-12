package com.example.travel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sing_in)

        //En el momento de dar click en crear cuenta esta varible lo lleva a la pagina Create Count
        val tvGoRegister = findViewById<TextView>(R.id.tv_go_to_register)
        tvGoRegister.setOnClickListener{
            goToResgister()
        }
        val tvGoForgotPassword = findViewById<TextView>(R.id.tv_go_to_forgot_password)
        tvGoForgotPassword.setOnClickListener {
            goToForgotPassword()
        }
        val tvGohome = findViewById<TextView>(R.id.Sing_in)
        tvGohome.setOnClickListener {
            goTohome()
        }
    }
    private fun goToResgister(){
        val i = Intent(this, CreateCount::class.java)
        startActivity(i)
    }
    private fun goToForgotPassword(){
        val i = Intent (this, Forgot_password::class.java)
        startActivity(i)
    }
    private fun goTohome(){
        val i = Intent (this, Home::class.java)
        startActivity(i)
    }
}