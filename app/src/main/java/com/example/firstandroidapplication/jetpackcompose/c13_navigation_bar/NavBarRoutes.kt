package com.example.firstandroidapplication.jetpackcompose.c13_navigation_bar

import kotlinx.serialization.Serializable

@Serializable
sealed class NavBarRoutes {
    @Serializable object Home
    @Serializable object Search
    @Serializable object Notifications
    @Serializable object Profile
}
