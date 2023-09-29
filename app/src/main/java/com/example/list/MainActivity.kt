package com.example.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.list.adapter.UserAdapter
import com.example.list.databinding.ActivityMainBinding
import com.example.list.model.UserModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapter: UserAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initial()
    }

    private fun initial() {
        recyclerView = binding.rvUser
        adapter = UserAdapter(this)
        recyclerView.adapter = adapter
        adapter.setList(myUser())
    }

    fun myUser(): ArrayList<UserModel> {
        val userList = ArrayList<UserModel>()

        val user = UserModel("Rybak","Sergey")
        userList.add(user)

        val user2 = UserModel("Rybak","Andrey")
        userList.add(user2)

        val user3 = UserModel("Rybak","Alexandr")
        userList.add(user3)

        val user4 = UserModel("Rybak","Tanja")
        userList.add(user4)

        return userList
    }
}