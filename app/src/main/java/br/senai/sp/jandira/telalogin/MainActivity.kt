package br.senai.sp.jandira.telalogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telalogin.ui.theme.TelaLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TelaLoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}


@Composable
fun Greeting() {
    Surface {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
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
                OutlinedTextField(value = "",
                    onValueChange = {},
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
                    })
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xffCf06f0),
                        unfocusedBorderColor = Color(0xffCf06f0)
                    ), modifier = Modifier
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
                    })
                Column(
                    modifier = Modifier
                        .width(320.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .width(320.dp)
                            .padding(top = 10.dp),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Button(
                            onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(Color(0xffCf06f0)),
                            modifier = Modifier
                        ) {
                            Text(
                                text = "Sign In ->"
                            )
                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Text(
                            text = "Dont't have an account?",
                            color = Color.Gray
                        )
                        Text(
                            text = "Sign In",
                            color = Color(0xffCf06f0)
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

@Composable
fun SignIn() {
    Surface {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
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
                    text = "Sign up",
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xffCf06f0),
                    modifier = Modifier.padding(start = 2.dp),
                )
                Text(
                    text = "Create a new account",
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
                        width = 1.dp,
                        color = Color(0xFFCF06F0),
                        shape = RoundedCornerShape(100.dp)
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

            OutlinedTextField(value = "",
                onValueChange = {},
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
                            id = R.drawable.perfil2
                        ),
                        contentDescription = "icone de perfil",
                        modifier = Modifier.width(25.dp)
                    )
                    Text(
                        text = "Username",
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(start = 30.dp)
                    )
                })
            OutlinedTextField(value = "",
                onValueChange = {},
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
                            id = R.drawable.smartphone
                        ),
                        contentDescription = "icone de celular",
                        modifier = Modifier.width(25.dp)
                    )
                    Text(
                        text = "Phone",
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(start = 30.dp)
                    )
                })
            OutlinedTextField(value = "",
                onValueChange = {},
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
                })
            OutlinedTextField(
                value = "",
                onValueChange = {},
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xffCf06f0),
                    unfocusedBorderColor = Color(0xffCf06f0)
                ), modifier = Modifier
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
                })
            Column(
                modifier = Modifier
                    .width(320.dp)
            ) {
                Row(
                    modifier = Modifier
                        .width(317.dp)
                        .padding(top = 10.dp),

                    ) {
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color(0xffCf06f0)),
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = "CREATE ACCOUNT"
                        )
                    }

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text = "Already have an account?",
                        color = Color.Gray
                    )
                    Text(
                        text = "Sign In",
                        color = Color(0xffCf06f0)
                    )
                }
            }
        }
        Row(
            modifier = Modifier
                .offset(y = 725.dp)
                .width(165.dp)
                .height(55.dp)
                .background(
                    Color(0xffCf06f0), shape = RoundedCornerShape(topEnd = 20.dp)
                )

        ) {}
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TelaLoginTheme {
        Greeting()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignInPreview() {
    TelaLoginTheme {
        SignIn()
    }
}