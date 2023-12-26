package com.example.zmeika1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {

    private val Splash : Long = 4000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val myImage : ImageView = findViewById(R.id.imageView2)

        myImage.setAnimation(AnimationUtils.loadAnimation(this,R.anim.anim))

        Handler().postDelayed({
            startActivity(Intent(this,menu::class.java))
            finish()
        },Splash)
    }
}