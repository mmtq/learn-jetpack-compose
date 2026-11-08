package com.example.firstandroidapplication.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(name = "I. LazyColumn", showBackground = true)
@Composable
fun LazyVerticalListExample() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            Text(text = "I. LazyColumn Vertical List", fontSize = 20.sp, color = Color.Blue)
            HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
        }
        items(20) { index ->
            Text(text = "Item $index", fontSize = 18.sp)
        }
    }
}

@Preview(name = "II. LazyRow", showBackground = true)
@Composable
fun LazyHorizontalListExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(text = "II. LazyRow Horizontal List", fontSize = 20.sp, color = Color.Blue)
        HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(20) { index ->
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color.LightGray),
                    contentAlignment = Alignment.Center
                ) {
                    Text("Item $index")
                }
            }
        }
    }
}

@Preview(name = "III. Nested Lazy Lists", showBackground = true)
@Composable
fun NestedLazyListsExample() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            Text(text = "III. Nested Lazy Lists", fontSize = 20.sp, color = Color.Blue)
            HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
        }
        items(5) { row ->
            Text("Section $row", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.padding(vertical = 4.dp)
            ) {
                items(10) { index ->
                    Box(
                        modifier = Modifier
                            .size(80.dp)
                            .background(Color(0xFFE3F2FD))
                            .padding(4.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("Box $index")
                    }
                }
            }
        }
    }
}

@Preview(name = "IV. Different Item Types", showBackground = true)
@Composable
fun DifferentItemTypesExample() {
    val names = listOf("Alice", "Bob", "Charlie", "Diana")

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            Text(text = "IV. Different Item Types", fontSize = 20.sp, color = Color.Blue)
            HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
        }
        
        // 1. Simple Item
        item { Text("List Header: Users List", fontSize = 18.sp, color = Color.DarkGray, fontWeight = FontWeight.Bold) }

        // 2. Items (Count)
        item { Text("--- Count Items (3) ---", fontSize = 14.sp, color = Color.Gray) }
        items(3) { index ->
            Text(text = "Count Item $index")
        }

        // 3. Items (List)
        item { Text("--- List Items ---", fontSize = 14.sp, color = Color.Gray) }
        items(names) { name ->
            Text(text = "Name: $name")
        }

        // 4. ItemsIndexed
        item { Text("--- Items Indexed ---", fontSize = 14.sp, color = Color.Gray) }
        itemsIndexed(names) { index, name ->
            Text(text = "Index $index: $name")
        }
    }
}
