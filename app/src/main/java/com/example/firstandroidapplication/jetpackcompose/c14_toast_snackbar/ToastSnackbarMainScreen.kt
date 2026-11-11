package com.example.firstandroidapplication.jetpackcompose.c14_toast_snackbar

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ToastSnackbarMainScreen() {
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    val context = LocalContext.current

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Jetpack Compose Feedback Demos", fontSize = 20.sp)
            Spacer(modifier = Modifier.height(32.dp))

            // Toast Button
            Button(onClick = {
                Toast.makeText(context, "This is a toast message", Toast.LENGTH_SHORT).show()
            }) {
                Text("Show Toast")
            }

            HorizontalDivider(modifier = Modifier.padding(vertical = 32.dp))

            // Snackbar Button
            Button(onClick = {
                scope.launch {
                    snackbarHostState.showSnackbar(
                        message = "This is a snackbar",
                        actionLabel = "Undo"
                    )
                }
            }) {
                Text("Show Snackbar")
            }
        }
    }
}
