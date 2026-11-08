package com.example.firstandroidapplication.jetpackcompose.C10_Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute

@Composable
fun AppNavGraph() {
    // navController -> Handle Navigation
    // rememberNavController -> Create and Remember the navController
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavRoutes.LoginScreen
    ) {
        composable<NavRoutes.LoginScreen> {
            LoginScreenUI(navController)
        }
        composable<NavRoutes.HomeScreen> { backStackEntry ->
            val homeScreen = backStackEntry.toRoute<NavRoutes.HomeScreen>()
            HomeScreenUI(
                navController = navController,
                username = homeScreen.username
            )
        }
    }
}
