package com.example.hotelpage

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val reserveButton = findViewById<Button>(R.id.reserveButton)
        reserveButton.setOnClickListener {
            Toast.makeText(this, "Rezervasyon talebiniz alındı!", Toast.LENGTH_SHORT).show()
        }
    }
}