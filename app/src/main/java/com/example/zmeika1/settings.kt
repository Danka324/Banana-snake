package com.example.zmeika1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class settings : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val bt5 : Button = findViewById(R.id.button12)

        bt5.setOnClickListener() {
            val intent: Intent = Intent(this, menu::class.java)
            startActivity(intent)
        }
    }
    fun OnClickListener (view : View){

        val intent : Intent = Intent (this@settings, MainActivity::class.java)
        intent.putExtra("background",R.drawable.frame)
        startActivity(intent)

    }


    fun OnClickListener2 (view : View){

        val intent : Intent = Intent (this@settings, MainActivity::class.java)
        intent.putExtra("background",R.drawable.frame2)
        startActivity(intent)

    }


    fun OnClickListener3 (view : View){

        val intent : Intent = Intent (this@settings, MainActivity::class.java)
        intent.putExtra("background",R.drawable.group187)
        startActivity(intent)

    }


}

