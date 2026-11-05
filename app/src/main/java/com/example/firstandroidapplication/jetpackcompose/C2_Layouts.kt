package com.example.firstandroidapplication.jetpackcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun RowExample() {

    Row (
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Apple", fontSize = 30.sp)
        Text(text = "Orange", fontSize = 30.sp)
        Text(text = "Banana", fontSize = 30.sp)
    }
}

@Composable
fun ColumnExample() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Apple", fontSize = 30.sp)
        Text(text = "Orange", fontSize = 30.sp)
        Text(text = "Banana", fontSize = 30.sp)
    }
}

@Composable
fun ColumnExample2() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Login here", fontSize = 30.sp)
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Username") },
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Password") },
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun BoxExample() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Apple", fontSize = 30.sp,
            modifier = Modifier.align(Alignment.BottomEnd)
        )
        Text(
            text = "Orange", fontSize = 30.sp,
            modifier = Modifier.align(Alignment.TopEnd)
        )
        Text(
            text = "Banana", fontSize = 30.sp,
            modifier = Modifier.align(Alignment.CenterStart)
        )
    }
}