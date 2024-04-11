package br.senai.sp.jandira.telalogin.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.telalogin.R
import br.senai.sp.jandira.telalogin.ui.theme.TelaLoginTheme

@Composable
fun TelaLogin(controleDeNavegacao: NavHostController) {

    var emailState= remember {
        mutableStateOf("")
    }

    var senhaState = remember {
        mutableStateOf("")
    }

    var mensagemErroState = remember {
        mutableStateOf("")
    }

    Surface(
        modifier = Modifier.fillMaxSize().background(Color.Magenta)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween
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
                    .padding(start = 24.dp)
            ) {
                Text(
                    text = "Login",
                    fontSize = 62.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xffCf06f0),
                    modifier = Modifier.padding(start = 2.dp),
                )
                Text(
                    text = "Please sign in to continue",
                    modifier = Modifier.padding(start = 2.dp),
                    color = Color(0xffA09C9C),
                )
                OutlinedTextField(
                    value = emailState.value,
                    onValueChange = {
                        emailState.value = it
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xffCf06f0),
                        unfocusedBorderColor = Color(0xffCf06f0)
                    ),
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .width(330.dp),
                    label = {
                        Image(
                            painterResource(
                                id = R.drawable.email
                            ),
                            contentDescription = "icone de email",
                            modifier = Modifier.width(25.dp)
                        )
                        Text(
                            text = "E-mail",
                            fontFamily = FontFamily.Default,
                            modifier = Modifier.padding(start = 30.dp)

                        )
                    },
                    keyboardOptions =  KeyboardOptions(
                        keyboardType = KeyboardType.Email
                    )
                )
                OutlinedTextField(
                    value = senhaState.value,
                    onValueChange = {
                        senhaState.value = it
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xffCf06f0),
                        unfocusedBorderColor = Color(0xffCf06f0)
                    ),
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .width(330.dp),
                    label = {
                        Image(
                            painterResource(
                                id = R.drawable.trancar
                            ),
                            contentDescription = "icone de senha",
                            modifier = Modifier.width(25.dp)
                        )
                        Text(
                            text = "Password",
                            fontFamily = FontFamily.Default,
                            modifier = Modifier.padding(start = 30.dp)
                        )
                    },
                    keyboardOptions =  KeyboardOptions(
                        keyboardType = KeyboardType.Password
                    ),
                    visualTransformation = PasswordVisualTransformation()
                )
                Column(
                    modifier = Modifier.width(320.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .width(320.dp)
                            .padding(top = 10.dp),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Button(
                            onClick = { if (emailState.value == "bianca" && senhaState.value == "1234"){
                                mensagemErroState.value = ""

                                controleDeNavegacao.navigate("home")
                            } else {
                                mensagemErroState.value = "Email ou senha incorretos"
                            } },
                            colors = ButtonDefaults.buttonColors(Color(0xffCf06f0))
                        ) {
                            Text(
                                text = "Sign In ->"
                            )
                        }
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End
                    ) {
                        Text(
                            text = "Dont't have an account?", color = Color.Gray
                        )
                        Text(
                            text = "Sign Up", color = Color(0xffCf06f0),
                            modifier = Modifier
                                .clickable{
                                controleDeNavegacao.navigate("TelaSignIn")
                            },

                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .width(165.dp)
                    .height(55.dp)
                    .background(
                        Color(0xffCf06f0), shape = RoundedCornerShape(topEnd = 20.dp)
                    )
                    .align(Alignment.Start)
            ) {}
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TelaLoginTheme {
      //TelaLogin(controleDeNavegacao)
    }
}