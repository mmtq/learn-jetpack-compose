package com.example.firstandroidapplication.jetpackcompose.C10_Navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class NavRoutes {

    @Serializable
    object LoginScreen : NavRoutes()

    @Serializable
    data class HomeScreen(val username: String) : NavRoutes()
}
