package com.example.firstandroidapplication.jetpackcompose.c13_navigation_bar

import androidx.compose.ui.graphics.vector.ImageVector

data class NavItem(
    val title: String,
    val icon: ImageVector,
    val route: Any
)
