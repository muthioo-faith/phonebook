package com.example.phonebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class picture4 : AppCompatActivity() {
    lateinit var btnpree:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture4)
        btnpree=findViewById(R.id.btnpree)
        btnpree.setOnClickListener {
            val intent= Intent(this,picture3::class.java)
            startActivity(intent)
        }
    }

}