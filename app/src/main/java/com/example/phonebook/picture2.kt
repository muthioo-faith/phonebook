package com.example.phonebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class picture2 : AppCompatActivity() {
    lateinit var btnnextt: Button
    lateinit var btnprevios: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture2)
        btnnextt=findViewById(R.id.btnnextt)
        btnnextt.setOnClickListener {
            val intent= Intent(this,picture3::class.java)
            startActivity(intent)
        }
        btnprevios=findViewById(R.id.btnprevios)
        btnprevios.setOnClickListener {
            var intent= Intent(this,Firstpage::class.java)
            startActivity(intent)
        }
    }
}