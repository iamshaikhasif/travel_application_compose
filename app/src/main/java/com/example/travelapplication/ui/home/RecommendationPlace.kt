package com.example.travelapplication.ui.home

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.LocationOn
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
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelapplication.R
import com.example.travelapplication.ui.components.GapCompose
import com.example.travelapplication.ui.components.TitleWithSeeAll

@Composable
fun RecommendationPlace() {
    Column {
        TitleWithSeeAll(title = "Best Deals")
        GapCompose(isRow = false)
        LazyColumn() {
            items(count = 5) {
                RecommendationPlaceCardItem()
            }
        }
    }
}


@Composable
fun RecommendationPlaceCardItem(){
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(5.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.splash_bg),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .height(60.dp)
                .width(100.dp)
                .clip(shape = RoundedCornerShape(10.dp)),
        )
        GapCompose(isRow = true)
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .weight(weight = 1f)
                .height(60.dp)
        ) {
            Text(
                text = "Place Name",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Medium)
            )
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Filled.LocationOn,
                    contentDescription = "location",
                    tint = Color.Black,
                    modifier = Modifier.size(10.dp)
                )
                GapCompose(isRow = true, gap = 2.dp)
                Text(text = "Country Name", style = MaterialTheme.typography.labelSmall)
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    LazyRow {
                        items(5) {
                            Icon(
                                imageVector = Icons.Filled.Star,
                                contentDescription = "star",
                                tint = Color.Yellow,
                                modifier = Modifier.size(10.dp)
                            )
                        }
                    }
                    GapCompose(isRow = true, gap = 2.dp)
                    Text(text = "5.0", style = MaterialTheme.typography.labelMedium)
                }
                GapCompose(isRow = true, gap = 10.dp)
                Text(text = "500 Rs.", style = MaterialTheme.typography.labelSmall)
            }
        }
    }
}


@Preview
@Composable
fun RecommendationPlacePrev() {
    RecommendationPlace()
}