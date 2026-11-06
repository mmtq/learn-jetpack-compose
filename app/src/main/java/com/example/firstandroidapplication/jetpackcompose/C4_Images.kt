package com.example.firstandroidapplication.jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstandroidapplication.R

@Composable
fun ImageExample() {

    Image(
        painter = painterResource(id = R.drawable.vision_on_flame),
        contentDescription = "Vision on Flame",
        modifier = Modifier
            .padding(16.dp)
            .size(300.dp)
            .clip(shape = RoundedCornerShape(size = 16.dp)),
        contentScale = ContentScale.FillBounds
    )
}

@Preview(showBackground = true)
@Composable
fun IconExample() {

    Icon(
        imageVector = Icons.Default.Star,
        contentDescription = "Star Icon",
        tint = Color.Blue
    )
}
