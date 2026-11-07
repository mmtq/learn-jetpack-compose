package com.example.firstandroidapplication.jetpackcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DividersScreenExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Above Horizontal Divider")
        HorizontalDividerExample()
        Text("Below Horizontal Divider")
        
        Spacer(modifier = Modifier.height(24.dp))
        
        Row(
            modifier = Modifier.height(50.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Left Item")
            VerticalDividerExample()
            Text("Right Item")
        }
    }
}

@Composable
fun HorizontalDividerExample() {
    HorizontalDivider(
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
        thickness = 1.dp,
        color = Color.Red
    )
}

@Composable
fun VerticalDividerExample() {
    VerticalDivider(
        modifier = Modifier.padding(horizontal = 8.dp),
        thickness = 1.dp,
        color = Color.Blue
    )
}
