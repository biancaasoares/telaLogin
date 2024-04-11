package br.senai.sp.jandira.telalogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.telalogin.screens.SignIn
import br.senai.sp.jandira.telalogin.screens.TelaInicio
import br.senai.sp.jandira.telalogin.screens.TelaLogin
import br.senai.sp.jandira.telalogin.ui.theme.TelaLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TelaLoginTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val controleDeNavegacao = rememberNavController()
                    NavHost(
                        navController = controleDeNavegacao,
                        startDestination = "telaLogin"
                    ){
                        composable(route = "telaLogin"){ TelaLogin(controleDeNavegacao)}
                        composable(route = "TelaSignIn"){ SignIn(controleDeNavegacao) }
                        composable(route = "TelaInicio"){TelaInicio(controleDeNavegacao)}
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting() {

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TelaLoginTheme{
      // TelaLogin()
    }
    }



