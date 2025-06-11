package com.example.raiap2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val textoResultado = findViewById<TextView>(R.id.textoResultado)
        val botaoVoltar = findViewById<Button>(R.id.botaoVoltar)

        val mensagem = intent.getStringExtra("mensagem") ?: "Resultado desconhecido"
        textoResultado.text = mensagem

        botaoVoltar.setOnClickListener {
            finish()
        }
    }
}
