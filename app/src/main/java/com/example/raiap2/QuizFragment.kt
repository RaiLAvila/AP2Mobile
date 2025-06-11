package com.example.raiap2

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.fragment.app.Fragment

class QuizFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_quiz, container, false)

        val editTextNome = view.findViewById<EditText>(R.id.editTextNome)
        val botao1 = view.findViewById<Button>(R.id.botao1)
        val botao2 = view.findViewById<Button>(R.id.botao2)
        val botao3 = view.findViewById<Button>(R.id.botao3)

        val listener = View.OnClickListener { button ->
            val nome = editTextNome.text.toString().trim()
            if (nome.isEmpty()) {
                Toast.makeText(requireContext(), "Por favor, digite seu nome", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }

            val mensagem = when (button.id) {
                R.id.botao1 -> "$nome, você conhece o Raí Lamper moderadamente! Esse foi um jogo muito marcante em sua vida que o tirou muitas gargalhadas."
                R.id.botao2 -> "$nome, você conhece o Raí Lamper muito bem. Esse é um dos jogos que ele mais ama e você saber disso mostra uma grande amizade."
                R.id.botao3 -> "$nome, bom jogo, porém longe de um dos favoritos do Lamper. Você deve ter conhecido ele há pouco tempo ou não conhece muito seu gosto em jogos!"
                else -> ""
            }

            val intent = Intent(requireContext(), ResultadoActivity::class.java)
            intent.putExtra("mensagem", mensagem)
            startActivity(intent)
        }

        botao1.setOnClickListener(listener)
        botao2.setOnClickListener(listener)
        botao3.setOnClickListener(listener)

        return view
    }
}
