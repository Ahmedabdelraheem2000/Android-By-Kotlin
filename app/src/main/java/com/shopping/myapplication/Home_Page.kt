package com.shopping.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.shopping.myapplication.databinding.ActivityHomePageBinding

class Home_Page : AppCompatActivity() {
    private lateinit var binding : ActivityHomePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.logout.setOnClickListener(View.OnClickListener {
            var intent= Intent(this,Login::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(this,"Log Out",Toast.LENGTH_SHORT).show()
        })
    }
}