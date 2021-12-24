package com.example.dbincludesexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dbincludesexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myUser = User("Sadaqat", true)
        binding.user = myUser

    }
}