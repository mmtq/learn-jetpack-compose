package com.example.firstandroidapplication.jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstandroidapplication.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun ImageExample() {

    Image(
        painter = painterResource(id = R.drawable.vision_on_flame),
        contentDescription = "Vision on Flame",
        modifier = Modifier.padding(16.dp)
            .size(300.dp)
            .clip(shape = RoundedCornerShape(size = 16.dp)),
        contentScale = ContentScale.FillBounds
    )
}