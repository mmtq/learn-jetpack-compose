package com.example.firstandroidapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.firstandroidapplication.jetpackcompose.ButtonsScreenExample
import com.example.firstandroidapplication.jetpackcompose.OutlinedTextFieldExample
import com.example.firstandroidapplication.ui.theme.FirstAndroidApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstAndroidApplicationTheme {
                ButtonsScreenExample();
            }
        }
    }
}
