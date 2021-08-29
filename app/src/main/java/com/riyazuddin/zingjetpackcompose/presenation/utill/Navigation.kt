package com.riyazuddin.zingjetpackcompose.presenation.utill

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.riyazuddin.zingjetpackcompose.presenation.login.LoginScreen
import com.riyazuddin.zingjetpackcompose.presenation.register.RegisterScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.LoginScreen.route
    ) {
        composable(route = Screen.LoginScreen.route){
            LoginScreen(navController = navController)
        }
        composable(route = Screen.RegisterScreen.route){
            RegisterScreen(navController = navController)
        }
    }
}