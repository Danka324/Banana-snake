package com.example.zmeika1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class levels : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_levels)


        val bt1: Button = findViewById(R.id.button8)
        val bt2: Button = findViewById(R.id.button10)
        val bt3: Button = findViewById(R.id.button11)
        val bt4: Button = findViewById(R.id.button13)



        bt1.setOnClickListener() {
            val intent: Intent = Intent(this, easy::class.java)
            startActivity(intent)
        }

        bt2.setOnClickListener() {
            val intent: Intent = Intent(this, normal::class.java)
            startActivity(intent)
        }

        bt3.setOnClickListener(){
            val intent : Intent = Intent(this, hard::class.java)
            startActivity(intent)
        }

        bt4.setOnClickListener() {
            val intent: Intent = Intent(this, menu::class.java)
            startActivity(intent)
        }


    }
}