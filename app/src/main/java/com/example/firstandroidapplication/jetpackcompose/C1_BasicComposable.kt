package com.example.firstandroidapplication.jetpackcompose

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun TextExample(){
    Text(
        text = "Mission Android",
        color = Color.Blue,
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Monospace,
        letterSpacing = 2.sp,
        textAlign = TextAlign.Center
    )
}

//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun TextFieldExample() {
//    var name by remember { mutableStateOf("") }
//
//    TextField(
//        value = name,
//        onValueChange = { name = it },
//        label = { Text(text = "Enter Name:") },
//        placeholder = { Text(text = "e.g. John Doe") },
//        prefix = { Text(text = "Name: ") },
//        singleLine = true,
//        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
//        supportingText = { Text(text = "Character count: ${name.length}") }
//    )
//}

@Preview(showBackground = true)
@Composable
fun OutlinedTextFieldExample() {
    var email by remember { mutableStateOf("") }

    OutlinedTextField(
        value = email,
        onValueChange = { email = it },
        label = { Text(text = "Enter Email:") },
        placeholder = { Text(text = "user@example.com") },
        suffix = { Text(text = "@domain") },
        singleLine = true,
        isError = email.isNotEmpty() && !email.contains("@"),
        supportingText = {
            if (email.isNotEmpty() && !email.contains("@")) {
                Text(text = "Invalid email format", color = Color.Red)
            } else {
                Text(text = "We'll never share your email.")
            }
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
    )
}
