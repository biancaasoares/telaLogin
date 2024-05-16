package br.senai.sp.jandira.telalogin.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.telalogin.repository.UsuarioRepository


@Composable
fun UsuariosDbScreen() {
    val cr = UsuarioRepository(LocalContext.current)

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp)
    ){
        LazyColumn{
            items(cr.listarTodosOsUsuarios()){
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 4.dp)
                ) {
                    Text(text = it.usuario)
                    Text(text = it.email)
                }
            }
        }
    }
}