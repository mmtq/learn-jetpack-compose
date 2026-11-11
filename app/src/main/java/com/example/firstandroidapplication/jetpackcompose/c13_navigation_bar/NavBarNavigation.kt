package com.example.firstandroidapplication.jetpackcompose.c13_navigation_bar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavBarNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavBarRoutes.Home
    ) {
        composable<NavBarRoutes.Home> {
            NavBarHomeScreen()
        }
        composable<NavBarRoutes.Search> {
            NavBarSearchScreen()
        }
        composable<NavBarRoutes.Notifications> {
            NavBarNotificationScreen()
        }
        composable<NavBarRoutes.Profile> {
            NavBarProfileScreen()
        }
    }
}
