package com.example.firstandroidapplication.jetpackcompose.C12_Scaffold

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyScreen() {
    Scaffold(
        topBar = { AppTopBar() },
        bottomBar = { AppBottomBar() },
        floatingActionButton = { Fab() }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            MyScreenContent()
        }
    }
}
