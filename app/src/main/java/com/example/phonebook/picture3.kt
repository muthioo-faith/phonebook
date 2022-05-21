package com.example.phonebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class picture3 : AppCompatActivity() {
    lateinit var btnnex: Button
    lateinit var btnpre: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture3)
        btnnex=findViewById(R.id.btnnex)
        btnnex.setOnClickListener {
            val intent= Intent(this,picture4::class.java)
            startActivity(intent)
        }
        btnpre=findViewById(R.id.btnpre)
        btnpre.setOnClickListener {
            var intent= Intent(this,picture2::class.java)
            startActivity(intent)
        }
    }
}