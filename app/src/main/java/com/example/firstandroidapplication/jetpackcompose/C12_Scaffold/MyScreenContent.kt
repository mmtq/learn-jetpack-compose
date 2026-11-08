package com.example.firstandroidapplication.jetpackcompose.C12_Scaffold

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyScreenContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("Welcome to Scaffold Main Content!", fontSize = 20.sp)
        Text("Notice how `innerPadding` prevents content from hiding behind the top and bottom bars.", fontSize = 14.sp)
    }
}
