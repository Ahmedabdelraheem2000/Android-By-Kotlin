package com.shopping.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.viewbinding.ViewBinding
import com.shopping.myapplication.databinding.LoginBinding
import java.util.regex.Pattern

class Login : AppCompatActivity(),View.OnClickListener {
    private lateinit var binding: LoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding= LoginBinding.inflate(layoutInflater)
        var view=binding.root
        setContentView(view)
        binding.btnLogin.setOnClickListener(this)
        binding.btnRegister.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {

        when (p0){
            binding.btnLogin ->{
                Check_Email_and_Paswword()
            }
            binding.btnRegister->{
                var intent=Intent(this,register::class.java)
                startActivity(intent)
            }
        }
    }

    fun Check_Email_and_Paswword(){//Function Check Email and Password { email=amhed@gmail.com |   password=ahmed123 }
        var email=binding.email.text.toString()
        var password=binding.password.text.toString()
        if(email.isEmpty()){
            binding.email.setError("Email is Empty")
            binding.email.requestFocus()
            return
        }
        if(password.isEmpty()){
            binding.password.setError("Email is Password")
            binding.password.requestFocus()
            return
        }
        if(email.length<10){
            binding.email.setError("Email is incomplete")
            binding.email.requestFocus()
            return
        }
        if(password.length<6){
            binding.password.setError("Wrong in password")
            binding.password.requestFocus()
            return
        }
        if(email!="ahmed@gmail.com"
            ||password!="ahmed123"){
            val toast = Toast.makeText(this, "Invalid",
                Toast.LENGTH_LONG)
            toast.show()
            return
        }
        Toast.makeText(this,"Welcome Back",Toast.LENGTH_SHORT).show()
        var intent=Intent(this,Home_Page::class.java)
        startActivity(intent)
        finish()
    }//end Check_Email_and_Paswword()
}