package com.shopping.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.shopping.myapplication.databinding.ActivityRegisterBinding

class register : AppCompatActivity(),View.OnClickListener {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding= ActivityRegisterBinding.inflate(layoutInflater)
        var view =binding.root
        setContentView(view)
        binding.btnLogin.setOnClickListener(this)
        binding.btnRegister.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0){
            binding.btnRegister->onBackPressed()
            binding.btnLogin->onBackPressed()
        }
    }
}