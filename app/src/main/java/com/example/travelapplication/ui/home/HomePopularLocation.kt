package com.example.travelapplication.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
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
import com.example.travelapplication.ui.components.GapCompose

@Composable
fun HomePopularLocation() {
    lateinit var courseList: List<String>
    courseList = ArrayList<String>()

    Column {
        Text(
            text = "Popular Location",
            style = MaterialTheme.typography.bodyLarge.copy(
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        )
        GapCompose(isRow = false)
        LazyRow {
            itemsIndexed(courseList) { index, item ->
                CardItem()
            }
        }
    }
}

@Composable
fun CardItem() {
    Box(
        modifier = Modifier
            .height(200.dp)
            .width(150.dp)
            .background(Color.White)
    ) {
        Column {
            Box(
                modifier = Modifier
                    .height(200.dp)
                    .width(150.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.splash_bg),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(150.dp)
                        .clip(shape = RoundedCornerShape(10.dp)),
                )
                Box(
                    contentAlignment = Alignment.CenterEnd,
                    modifier = Modifier
                        .width(150.dp)
                        .padding(5.dp)

                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(20.dp)
                            .clip(shape = RoundedCornerShape(5.dp))
                            .background(color = Color.White)

                    ) {
                        Icon(
                            imageVector = Icons.Filled.BookmarkBorder,
                            contentDescription = "bookmark",
                            modifier = Modifier.size(15.dp)
                        )
                    }
                }

                Box(
                    contentAlignment = Alignment.BottomCenter,
                    modifier = Modifier
                        .width(150.dp)
                        .padding(5.dp)

                ) {
                    Row(horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(
                            text = "Place Name",
                            style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold)
                        )
                        Row {
                            Icon(
                                imageVector = Icons.Filled.Star,
                                contentDescription = "bookmark",
                                modifier = Modifier.size(10.dp)
                            )
                            Text(
                                text = "5.0",
                                style = MaterialTheme.typography.labelSmall.copy(
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Normal
                                )
                            )

                        }
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun HomePrev() {
    HomeScreen()
}
