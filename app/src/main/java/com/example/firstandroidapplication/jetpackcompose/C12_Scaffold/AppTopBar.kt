package com.example.firstandroidapplication.jetpackcompose.C12_Scaffold

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar() {
    TopAppBar(
        title = { Text("Mission Android 2026") },
        navigationIcon = { IconButton(onClick = {}) { Icon(Icons.Default.Menu, "Menu") } },
        actions = { IconButton(onClick = {}) { Icon(Icons.Default.Search, "Search") } }
    )
}
