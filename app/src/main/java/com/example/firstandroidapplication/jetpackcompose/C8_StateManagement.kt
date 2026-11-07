package com.example.firstandroidapplication.jetpackcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun StateManagementScreenExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("1. Basic State Management", fontSize = 18.sp)
        CounterExample()
        
        HorizontalDivider(modifier = Modifier.padding(vertical = 16.dp))
        
        Text("2. RememberSaveable Counter", fontSize = 18.sp)
        SaveableCounter()
        
        HorizontalDivider(modifier = Modifier.padding(vertical = 16.dp))
        
        Text("3. State Hoisting", fontSize = 18.sp)
        StateHostingParent()
    }
}

@Composable
fun CounterExample() {
    // remember keeps the value during recomposition
    // mutableStateOf triggers UI updates when the value changes
    var score by remember { mutableStateOf(0) }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Score: $score", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Row {
            Button(onClick = { score++ }) { Text("Increase") }
            Spacer(modifier = Modifier.width(8.dp))
            Button(
                onClick = { score-- },
                enabled = score > 0 // Logic to disable button
            ) { Text("Decrease") }
        }
    }
}

@Composable
fun SaveableCounter() {
    // Use rememberSaveable to keep state across configuration changes
    var score by rememberSaveable { mutableStateOf(0) }

    Button(onClick = { score++ }) {
        Text("Score: $score")
    }
}

@Composable
fun StateHostingParent() {
    var score by remember { mutableStateOf(0) }

    // Passing state and event callbacks to the child
    CounterChild(
        score = score,
        onIncrement = { score++ },
        onDecrement = { score-- }
    )
}

@Composable
fun CounterChild(
    score: Int,
    onIncrement: () -> Unit,
    onDecrement: () -> Unit
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Score: $score", fontSize = 20.sp)
        Spacer(modifier = Modifier.height(4.dp))
        Row {
            Button(onClick = onIncrement) { Text("Increase") }
            Spacer(modifier = Modifier.width(8.dp))
            Button(
                onClick = onDecrement,
                enabled = score > 0
            ) { Text("Decrease") }
        }
    }
}
