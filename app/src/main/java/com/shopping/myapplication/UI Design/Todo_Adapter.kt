package com.shopping.myapplication.UI

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shopping.myapplication.databinding.TodoBinding


class Todo_Adapter(var TodoList:List<ToDo>): RecyclerView.Adapter<Todo_Adapter.Todo_View_Holder>() {

    inner class Todo_View_Holder (var binding: TodoBinding):RecyclerView.ViewHolder(binding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Todo_View_Holder {
        var layoutInflater=LayoutInflater.from(parent.context)
        var view=TodoBinding.inflate(layoutInflater,parent,false)
        return Todo_View_Holder(view)
    }

    override fun onBindViewHolder(holder: Todo_View_Holder, position: Int) {
        holder.binding.apply {
            notes.text=TodoList[position].note
            checkTodo.isChecked=TodoList[position].isCheck
        }
    }

    override fun getItemCount(): Int {
        return TodoList.size
    }


}