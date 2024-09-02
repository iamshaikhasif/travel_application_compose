package com.example.travelapplication.ui.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.travelapplication.R

@Composable
fun ProfilePost() {
    LazyVerticalGrid(columns = GridCells.Fixed(3), modifier = Modifier.padding(10.dp)) {
        items(count = 5) {
            Image(
                painter = painterResource(id = R.drawable.splash_bg),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(120.dp)
                    .padding(5.dp)
                    .clip(shape = RoundedCornerShape(10.dp)),
            )
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun gridView() {
    ProfilePost()
}