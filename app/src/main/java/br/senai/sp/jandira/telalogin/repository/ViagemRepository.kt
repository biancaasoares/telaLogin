package br.senai.sp.jandira.telalogin.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.telalogin.R
import br.senai.sp.jandira.telalogin.model.Viagem
import java.time.LocalDate

class ViagemRepository {
    @Composable
    fun listarTodasAsViagens(): List<Viagem>{

        val londres = Viagem(
            id = 1,
            destino = "Londres",
            descricao = "London is the capital and largest city of  the United Kingdom, with a population of just under 9 million.",
            dataChegada = LocalDate.of(2019,2,18),
            dataPartida = LocalDate.of(2019,2,21),
            imagem = painterResource(id = R.drawable.londres)
        )
        val porto = Viagem(
            id = 2,
            destino = "Porto",
            descricao = "Porto is one of the most famous and beautiful cities in Portugal. Known for its fantastic afternoons by the river (Douro), or foggy mornings, Porto is a charming and vibrant city.",
            dataChegada = LocalDate.of(2020,7,10),
            dataPartida = LocalDate.of(2020,7,17),
            imagem = painterResource(id = R.drawable.porto)
        )
        val madrid = Viagem(
            id = 3,
            destino = "Madrid",
            descricao = "Madrid, the capital of Spain, located in the center of the country, is a city of elegant avenues and large, well-kept parks, such as Buen Retiro.",
            dataChegada = LocalDate.of(2024,12,27),
            dataPartida = LocalDate.of(2025,1,10),
            imagem = painterResource(id = R.drawable.madrid_)

        )
        val toquio= Viagem(
            id = 4,
            destino = "Tóquio",
            descricao = "Tokyo, Japan's bustling capital, combines ultramodern and traditional style, from neon-lit skyscrapers to historic temples.",
            dataChegada = LocalDate.of(2023,5,13),
            dataPartida = LocalDate.of(2023,5,10),
            imagem = painterResource(id = R.drawable.tokio)

        )
        val bahamas= Viagem(
            id = 5,
            destino = "Bahamas",
            descricao = "The Bahamas are an archipelago in the Atlantic Ocean whose land originates from corals.",
            dataChegada = LocalDate.of(2026,2,10),
            dataPartida = LocalDate.of(2026,2,15),
            imagem = painterResource(id = R.drawable.bahamas)

        )

        return listOf(londres,porto,madrid,toquio,bahamas)

    }
}