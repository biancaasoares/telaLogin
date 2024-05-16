package br.senai.sp.jandira.telalogin.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.telalogin.R
import br.senai.sp.jandira.telalogin.model.Usuario
import br.senai.sp.jandira.telalogin.repository.UsuarioRepository
import br.senai.sp.jandira.telalogin.ui.theme.TelaLoginTheme

@Composable
fun SignIn(controleDeNavegacao: NavHostController) {

    val cr = UsuarioRepository(LocalContext.current)

    var nomeState = remember {
        mutableStateOf("")
    }
    var numeroState = remember {
        mutableStateOf("")
    }
    var emailState = remember {
        mutableStateOf("")
    }
    var senhaState = remember {
        mutableStateOf("")
    }


    Surface {
        Column(
            modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .width(165.dp)
                    .height(55.dp)
                    .background(
                        Color(0xffCf06f0), shape = RoundedCornerShape(bottomStart = 20.dp)
                    )
                    .align(Alignment.End)
            ) {}
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(id = R.string.signUp),
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xffCf06f0),
                    modifier = Modifier.padding(start = 2.dp),
                )
                Text(
                    text = stringResource(id = R.string.create_phrase),
                    modifier = Modifier.padding(start = 2.dp),
                    color = Color(0xffA09C9C),
                )
            }

            Card(
                shape = CircleShape,
                modifier = Modifier
                    .padding(top = 25.dp)
                    .width(100.dp)
                    .height(100.dp)
                    .border(
                        width = 1.dp, color = Color(0xFFCF06F0), shape = RoundedCornerShape(100.dp)
                    )
            ) {
                Image(
                    painterResource(
                        id = R.drawable.perfilcerto
                    ),
                    contentDescription = "icone de perfil",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .offset(y = 10.dp)
                        .fillMaxSize(),
                )
            }

            OutlinedTextField(
                value = nomeState.value,
                onValueChange = {
                    nomeState.value = it
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xffCf06f0), unfocusedBorderColor = Color(0xffCf06f0)
                ),
                modifier = Modifier
                    .padding(top = 10.dp)
                    .width(330.dp),
                label = {
                    Image(
                        painterResource(
                            id = R.drawable.perfil2
                        ), contentDescription = "icone de perfil", modifier = Modifier.width(25.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.username),
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(start = 30.dp)
                    )
                })
            OutlinedTextField(
                value = numeroState.value,
                onValueChange = {
                    numeroState.value = it
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xffCf06f0), unfocusedBorderColor = Color(0xffCf06f0)
                ),
                modifier = Modifier
                    .padding(top = 10.dp)
                    .width(330.dp),
                label = {
                    Image(
                        painterResource(
                            id = R.drawable.smartphone
                        ), contentDescription = "icone de celular", modifier = Modifier.width(25.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.phone),
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(start = 30.dp)
                    )
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number
                )
            )
            OutlinedTextField(
                value = emailState.value,
                onValueChange = {
                    emailState.value = it
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xffCf06f0), unfocusedBorderColor = Color(0xffCf06f0)
                ),
                modifier = Modifier
                    .padding(top = 10.dp)
                    .width(330.dp), label = {
                    Image(
                        painterResource(
                            id = R.drawable.email
                        ), contentDescription = "icone de email", modifier = Modifier.width(25.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.email_signUp),
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(start = 30.dp)

                    )
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email
                )
            )
            OutlinedTextField(
                value = senhaState.value,
                onValueChange = {
                    senhaState.value = it
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xffCf06f0), unfocusedBorderColor = Color(0xffCf06f0)
                ),
                modifier = Modifier
                    .padding(top = 10.dp)
                    .width(330.dp),
                label = {
                    Image(
                        painterResource(
                            id = R.drawable.trancar
                        ), contentDescription = "icone de senha", modifier = Modifier.width(25.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.password_signUp),
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(start = 30.dp)
                    )
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                ),
                visualTransformation = PasswordVisualTransformation()
            )
            Column(
                modifier = Modifier.width(320.dp)
            ) {
                Row(
                    modifier = Modifier
                        .width(317.dp)
                        .padding(top = 10.dp),

                    ) {
                    Button(
                        onClick = {
                            val usuario = Usuario(
                                usuario = nomeState.value,
                                telefone = numeroState.value,
                                email = emailState.value,
                                )
                            cr.salvar(usuario)
                            controleDeNavegacao.navigate("telaLogin")
                        },
                        colors = ButtonDefaults.buttonColors(Color(0xffCf06f0)),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = stringResource(id = R.string.create_account)
                        )
                    }

                }
                Row(
                    modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text = stringResource(id = R.string.signUp_phrase), color = Color.Gray
                    )
                    Text(
                        text = stringResource(id = R.string.signIn),
                        color = Color(0xffCf06f0),
                        modifier = Modifier
                            .clickable {
                                controleDeNavegacao.navigate("telaLogin")
                            },
                    )
                }
            }
        }
        Row(
            modifier = Modifier
                .offset(y = 725.dp)
                .width(17.dp)
                .height(55.dp)
                .background(
                    Color(0xffCf06f0), shape = RoundedCornerShape(topEnd = 20.dp)
                )

        ) {}
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignInPreview() {
    TelaLoginTheme {
        //   SignIn()
    }
}