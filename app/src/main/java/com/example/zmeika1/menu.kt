package com.example.zmeika1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        val bt1: Button = findViewById(R.id.button)
        val bt2: Button = findViewById(R.id.button2)
        val bt3: Button = findViewById(R.id.button3)
        val bt4: Button = findViewById(R.id.button9)

        bt1.setOnClickListener() {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        bt3.setOnClickListener() {
            val intent: Intent = Intent(this, program::class.java)
            startActivity(intent)
        }

        bt2.setOnClickListener(){
            val intent : Intent = Intent(this,settings::class.java)
            startActivity(intent)
        }

        bt4.setOnClickListener(){
            val intent : Intent = Intent(this,levels::class.java)
            startActivity(intent)
        }

    }



}
