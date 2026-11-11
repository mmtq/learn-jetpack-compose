package com.example.firstandroidapplication.jetpackcompose.c14_toast_snackbar

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ToastExample() {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Toast Demo", fontSize = 22.sp, modifier = Modifier.padding(bottom = 16.dp))

        Button(onClick = {
            Toast.makeText(context, "This is a toast message", Toast.LENGTH_SHORT).show()
        }) {
            Text("Show Toast (Short)")
        }
    }
}
