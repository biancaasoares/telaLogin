package br.senai.sp.jandira.telalogin.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.telalogin.R
import br.senai.sp.jandira.telalogin.model.Categorias



class CategoriasRepository {
    @Composable
    fun listarTodasAsCategorias(): List<Categorias> {

        val montain = Categorias(
            id = 1,
            nome = "Montain",
            imagem = painterResource(id = R.drawable.montanha)
        )
        val  snow = Categorias(
            id = 2,
            nome = "Snow",
            imagem = painterResource(id = R.drawable.snowboarder)
        )
        val beach = Categorias(
            id = 3,
            nome = "Beach",
            imagem = painterResource(id = R.drawable.praia)
        )
        val city = Categorias(
            id = 4,
            nome = "City",
            imagem = painterResource(id = R.drawable.cidade)
        )
        val touristics = Categorias(
            id = 5,
            nome = "Touristics",
            imagem = painterResource(id = R.drawable.localizacao)
        )
        val hotel = Categorias(
            id = 6,
            nome = "Hotel",
            imagem = painterResource(id = R.drawable.hotel)
        )
        return listOf(montain,snow,beach,city,touristics,hotel)
    }
}