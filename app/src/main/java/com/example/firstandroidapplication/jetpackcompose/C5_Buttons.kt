package com.example.firstandroidapplication.jetpackcompose

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ButtonsScreenExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        DefaultButtonExample()
        Spacer(modifier = Modifier.height(16.dp))
        LoginButtonExample()
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedButtonExample()
        Spacer(modifier = Modifier.height(16.dp))
        TextAndIconButtonExample()
    }
}

@Composable
fun DefaultButtonExample() {
    val context = LocalContext.current
    Button(
        onClick = {
            Toast.makeText(context, "Clicked Default Button", Toast.LENGTH_SHORT).show()
        },
        colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 10.dp,
            pressedElevation = 20.dp
        )
    ) {
        Text("Click Me")
    }
}

@Composable
fun LoginButtonExample() {
    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    val context = LocalContext.current

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("Username") },
            singleLine = true
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = {
                Toast.makeText(context, "Logged in as $username", Toast.LENGTH_SHORT).show()
            },
            enabled = username.isNotEmpty() && email.isNotEmpty()
        ) {
            Text("Login")
        }
    }
}

@Composable
fun OutlinedButtonExample() {
    val context = LocalContext.current
    OutlinedButton(
        onClick = {
            Toast.makeText(context, "Clicked Outlined Button", Toast.LENGTH_SHORT).show()
        }
    ) {
        Text("Outlined Button")
    }
}

@Composable
fun TextAndIconButtonExample() {
    val context = LocalContext.current

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        TextButton(
            onClick = {
                Toast.makeText(context, "Forgot Password Clicked", Toast.LENGTH_SHORT).show()
            }
        ) {
            Text("Forgot Password?")
        }
        Spacer(modifier = Modifier.height(8.dp))
        IconButton(
            onClick = {
                Toast.makeText(context, "Icon Button Clicked", Toast.LENGTH_SHORT).show()
            }
        ) {
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "Favorite Icon",
                tint = Color.Red
            )
        }
    }
}
