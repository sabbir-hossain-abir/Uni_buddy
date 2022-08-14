package com.example.homepage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnBoarding2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding2)


        val nextButton = findViewById<Button>(R.id.onboarding_2_button)
        nextButton.setOnClickListener{
            val intent = Intent(this,OnBoarding3::class.java)
            startActivity(intent)
        }
    }
}