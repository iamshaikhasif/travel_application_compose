package com.example.travelapplication.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelapplication.R

@Composable
fun PlaceCard() {
    LazyRow {
        items(count = 5) { item ->
            PlaceCardItem()
        }
    }
}

@Composable
fun PlaceCardItem() {
    Box(
        modifier = Modifier
            .height(50.dp)
            .width(150.dp)
            .background(Color.White)
            .padding(5.dp)
    ) {
        Column {
            Box(
                modifier = Modifier
                    .height(50.dp)
                    .width(150.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.splash_bg),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .width(150.dp)
                        .clip(shape = RoundedCornerShape(10.dp)),
                )

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .width(150.dp)
                        .height(50.dp)
                        .clip(
                            shape = RoundedCornerShape(
                                10.dp
                            )
                        )
                        .background(Color.Black.copy(alpha = 0.3f))

                ) {
                    Text(
                        text = "Place Name",
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun PlaceCardPrev() {
    PlaceCard()
}