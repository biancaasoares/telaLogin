package br.senai.sp.jandira.telalogin.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.telalogin.R
import br.senai.sp.jandira.telalogin.repository.CategoriasRepository
import br.senai.sp.jandira.telalogin.repository.ViagemRepository
import br.senai.sp.jandira.telalogin.ui.theme.TelaLoginTheme
import br.senai.sp.jandira.telalogin.ultils.encurtarData

@Composable


fun TelaInicio(controleDeNavegacao: NavHostController) {

    val categorias = CategoriasRepository().listarTodasAsCategorias()
    val viagens = ViagemRepository().listarTodasAsViagens()

    var procuraState = remember {
      mutableStateOf("")
    }

    Surface (
        modifier = Modifier.fillMaxSize(),
        color = Color(0xffF6F6F6)
    ){
        Column(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            ) {
                Image(
                    painterResource(id = R.drawable.paris),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                )
                Column(
                    horizontalAlignment = Alignment.End
                ) {
                    Card(
                        modifier = Modifier
                            .padding(10.dp)
                            .size(60.dp),
                        shape = CircleShape,
                        border = BorderStroke(2.dp, Color.White)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.perfil),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                        )
                    }
                    Row (
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 10.dp),
                    ){
                        Text(
                            text = "Susanna Hoffs",
                            color = Color.White
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(start = 20.dp, bottom = 10.dp),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(
                            imageVector = Icons.Default.Place,
                            contentDescription = "",
                            tint = Color.White,
                            modifier = Modifier
                                .size(20.dp)
                        )
                        Text(
                            text = "You're in Paris",
                            color = Color.White
                        )
                    }
                    Row(
                        modifier = Modifier.padding(start = 6.dp)
                    ) {
                        Text(
                            text = "My Trips",
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 24.sp
                        )
                    }
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(top = 20.dp, start = 20.dp)
            ) {
                Row {
                    Text(text = "Categories")
                }
                Spacer(modifier = Modifier.height(10.dp))
                LazyRow(
                    modifier = Modifier.fillMaxSize()
                ) {
                    items(categorias){
                        Button(
                            onClick = {},
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults
                                .buttonColors(
                                    containerColor = Color(0xFF9C27B0)
                                ),
                            modifier = Modifier
                                .height(80.dp)
                                .width(120.dp),
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Row {
                                    Image(
                                        painter = if (it.imagem == null) painterResource(id = R.drawable.noimage) else it.imagem!!,
                                        contentDescription = "",
                                        modifier = Modifier
                                            .size(30.dp)
                                    )
                                }
                                Row {
                                    Text(text = it.nome)
                                }
                            }
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                    }
                }
            }
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ){
                OutlinedTextField(
                    value = procuraState.value,
                    onValueChange = {
                        procuraState.value = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(24.dp)
                        ),
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "",
                            tint = Color(0xffA09C9C)
                        )
                    },
                    label = {
                        Text(
                            text = "Search your destiny",
                            color = Color(0xffA09C9C)
                        )
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color.White,
                        focusedBorderColor = Color(0xF6DDD5D5)
                    ),
                    shape = RoundedCornerShape(24.dp)
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 20.dp, start = 20.dp, end = 20.dp)
            ) {
                Row {
                    Text(text = "Past Trips")
                }
                Spacer(modifier = Modifier.height(10.dp))
                
                LazyColumn{
                    items(viagens){
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp, vertical = 4.dp)
                        ) {
                            Column (
                                modifier = Modifier
                                    .fillMaxWidth()
                            ){
                                Surface (
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(180.dp)
                                ){
                                    Image(painter = if (it.imagem == null) painterResource(id = R.drawable.noimage) else it.imagem!!,
                                        contentDescription = "",
                                        contentScale = ContentScale.Crop
                                    )
                                }
                                Column(
                                    modifier = Modifier.padding(8.dp)
                                ) {
                                    Text(text = "${it.destino},${it.dataChegada.year}",
                                        fontSize = 20.sp,
                                        color = Color(0xFF9C27B0)
                                    )
                                    Text(text = it.descricao,
                                        fontSize = 17.sp
                                    )
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(top = 16.dp)
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically
                                        ) {
                                            Text(text = "${encurtarData(it.dataChegada)} - ${encurtarData(it.dataPartida)}",
                                                fontSize = 12.sp,
                                                color = Color(0xFF9C27B0)
                                            )
                                        }

                                    }
                                }

                            }
                        }
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaInicioPreview() {
    TelaLoginTheme {

    }
}