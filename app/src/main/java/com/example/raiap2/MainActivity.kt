package com.example.raiap2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoSuporte = findViewById<Button>(R.id.button2)
        botaoSuporte.setOnClickListener {
            val intent = Intent(this, Suporte::class.java)
            startActivity(intent)
        }

        val botaoComecar = findViewById<Button>(R.id.button)
        botaoComecar.setOnClickListener {
            val intent = Intent(this, PagerActivity::class.java)
            startActivity(intent)
        }
    }

}

