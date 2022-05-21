package com.example.phonebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnwelcome:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnwelcome=findViewById(R.id.btnwelcome)
        btnwelcome.setOnClickListener {
            val intent= Intent(this,Firstpage ::class.java)
            startActivity(intent)
        }
    }
}