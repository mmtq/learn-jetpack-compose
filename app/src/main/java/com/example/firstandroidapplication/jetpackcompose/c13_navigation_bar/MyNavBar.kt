package com.example.firstandroidapplication.jetpackcompose.c13_navigation_bar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun MyNavBar(navController: NavHostController) {
    val navItems = listOf(
        NavItem("Home", Icons.Default.Home, NavBarRoutes.Home),
        NavItem("Search", Icons.Default.Search, NavBarRoutes.Search),
        NavItem("Notifications", Icons.Default.Notifications, NavBarRoutes.Notifications),
        NavItem("Profile", Icons.Default.Person, NavBarRoutes.Profile)
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()

    NavigationBar {
        navItems.forEach { item ->
            val isSelected = navBackStackEntry?.destination?.hierarchy?.any {
                it.route == item.route::class.qualifiedName
            } == true

            NavigationBarItem(
                selected = isSelected,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = { Icon(item.icon, contentDescription = item.title) },
                label = { Text(item.title) },
                alwaysShowLabel = false
            )
        }
    }
}
