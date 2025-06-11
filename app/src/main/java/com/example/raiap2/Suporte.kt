package com.example.raiap2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Suporte : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suporte)

        val botaoLigar = findViewById<Button>(R.id.botaoLigar)
        val botaoVoltar = findViewById<Button>(R.id.button3)

        botaoLigar.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:996572599")
            startActivity(intent)
        }

        botaoVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // opcional: encerra a tela atual para não empilhar
        }
    }
}
