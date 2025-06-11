package com.example.raiap2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalheImagemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_imagem)

        val imagem = findViewById<ImageView>(R.id.imagemGrande)
        val descricao = findViewById<TextView>(R.id.textoDescricao)
        val botaoVoltar = findViewById<Button>(R.id.botaoVoltar)

        // Recupera os dados da intent
        val imagemId = intent.getIntExtra("imagem_id", R.drawable.sonny)
        val texto = intent.getStringExtra("descricao") ?: ""

        imagem.setImageResource(imagemId)
        descricao.text = texto

        botaoVoltar.setOnClickListener {
            finish() // Volta para o fragment anterior
        }
    }
}
