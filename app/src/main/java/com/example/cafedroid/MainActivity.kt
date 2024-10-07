package com.example.cafedroid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // FloatingActionButton setup
        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener {
            // Navigasi ke OrderActivity saat FAB di klik
            val intent = Intent(this, OrderActivity::class.java)
            startActivity(intent)
        }
    }
}
