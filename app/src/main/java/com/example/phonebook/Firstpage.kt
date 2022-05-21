package com.example.phonebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Firstpage : AppCompatActivity() {
    lateinit var btnnext:Button
    lateinit var btnprevious:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstpage)
        btnnext=findViewById(R.id.btnnext)
        btnnext.setOnClickListener {
            val intent= Intent(this,picture2::class.java)
            startActivity(intent)
        }
        btnprevious=findViewById(R.id.btnprevious)
        btnprevious.setOnClickListener {
            var intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}