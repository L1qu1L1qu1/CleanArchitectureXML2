package com.example.cleanarchitecturexml2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

//        val myViewModel: MyViewModel by viewModels()


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}