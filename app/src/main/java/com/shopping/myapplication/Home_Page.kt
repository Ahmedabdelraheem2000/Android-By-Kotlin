package com.shopping.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shopping.myapplication.UI.ToDo
import com.shopping.myapplication.UI.Todo_Adapter
import com.shopping.myapplication.databinding.ActivityHomePageBinding

class Home_Page : AppCompatActivity() {
    private lateinit var binding : ActivityHomePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        Push_Data_To_Recycler()
    }
    fun Push_Data_To_Recycler(){
        var Note_List=ArrayList<ToDo>()
        Note_List.add(ToDo("I Go To Gym 10:30 Am",false))
        Note_List.add(ToDo("I Go To Gym 10:30 Am",false))
        Note_List.add(ToDo("I Go To Gym 10:30 Am",false))
        Note_List.add(ToDo("I Go To Gym 10:30 Am",false))
        var ToDo_Adapter=Todo_Adapter(Note_List)
        binding.recycler.layoutManager=LinearLayoutManager(this)
        binding.recycler.adapter=ToDo_Adapter

    }
}