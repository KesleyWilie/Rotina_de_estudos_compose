package com.kw.rotinadeestudoscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kw.rotinadeestudoscompose.ui.theme.RotinaDeEstudosComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RotinaDeEstudosComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RotinaApp()
                }
            }
        }
    }
}

@Composable
fun RotinaApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "main") {
        composable("main") {
            MainScreen(onDiaClick = { dia ->
                navController.navigate("dia/$dia")
            })
        }
        composable("dia/{dia}") { backStackEntry ->
            val dia = backStackEntry.arguments?.getString("dia") ?: ""
            DiaScreen(
                dia = dia,
                onResumoClick = {
                    navController.navigate("resumo")
                },
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
        composable("resumo") {
            ResumoScreen(onBackClick = {
                navController.popBackStack()
            })
        }
    }
}
