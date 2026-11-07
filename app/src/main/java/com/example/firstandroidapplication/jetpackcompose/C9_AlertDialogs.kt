package com.example.firstandroidapplication.jetpackcompose

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AlertDialogsScreenExample() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        AlertDialogExample()
    }
}

@Composable
fun AlertDialogExample() {
    val openDialog = remember { mutableStateOf(false) }
    val context = LocalContext.current

    Button(onClick = { openDialog.value = true }) {
        Text("Show Dialog")
    }

    if (openDialog.value) {
        AlertDialog(
            onDismissRequest = { openDialog.value = false },
            title = { Text("Delete Item") },
            text = { Text("Are you sure you want to delete this item?") },
            containerColor = Color.White,
            titleContentColor = Color.Black,
            textContentColor = Color.DarkGray,
            confirmButton = {
                Button(onClick = {
                    Toast.makeText(context, "Item deleted", Toast.LENGTH_SHORT).show()
                    openDialog.value = false
                }) {
                    Text("Delete")
                }
            },
            dismissButton = {
                Button(onClick = { openDialog.value = false }) {
                    Text("Cancel")
                }
            }
        )
    }
}
