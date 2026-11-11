package com.example.firstandroidapplication.jetpackcompose.c13_navigation_bar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun NavBarMainScreen() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { MyNavBar(navController = navController) }
    ) { innerPadding ->
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)) {
            NavBarNavigation(navController = navController)
        }
    }
}
