package com.example.raiap2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class FotoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_foto, container, false)

        val img1 = view.findViewById<ImageView>(R.id.image1)
        val img2 = view.findViewById<ImageView>(R.id.image2)
        val img3 = view.findViewById<ImageView>(R.id.image3)

        img1.setOnClickListener {
            abrirImagemDetalhe(R.drawable.fotorai6, "Rai está imerso em seu mundo, programando um aplicativo. Ele usa um boné, que complementa seu estilo único e bem-humorado. Seus dedos ágeis percorrem o teclado, enquanto ele foca na tela à sua frente. A concentração é evidente, mas há um toque de leveza em sua postura, mostrando que ele se diverte enquanto trabalha.")
        }

        img2.setOnClickListener {
            abrirImagemDetalhe(R.drawable.fotorai7, "Rai está pronto para a trilha com seus amigos. Ele usa um gorro, que complementa seu estilo descontraído. Rai e seu grupo parecem animados, com a energia de quem está prestes a desfrutar da natureza e da companhia uns dos outros.")
        }

        img3.setOnClickListener {
            abrirImagemDetalhe(R.drawable.fotorai8, "Rai e seu fiel escudeiro Fellipe estão prontos para uma reunião. Rai, com seu cabelo bagunçado, mostra seu estilo único mesmo para um compromisso formal. Ao seu lado, Fellipe, seu parceiro, está igualmente preparado. Ambos transmitem a postura de quem está prestes a embarcar em um encontro importante, com a seriedade necessária, mas sem perder a essência descontraída que os caracteriza.")
        }

        return view
    }

    private fun abrirImagemDetalhe(imagemId: Int, descricao: String) {
        val intent = Intent(requireContext(), DetalheImagemActivity::class.java)
        intent.putExtra("imagem_id", imagemId)
        intent.putExtra("descricao", descricao)
        startActivity(intent)
    }
}
