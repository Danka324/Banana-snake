package com.example.zmeika1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class program : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_program)

     val tx:TextView = findViewById(R.id.textView)
        val bt : Button = findViewById(R.id.button4)
        tx.setText(R.string.program)

        bt.setOnClickListener(){
            val intent: Intent = Intent(this, menu::class.java)
            startActivity(intent)
        }
        }

    }
