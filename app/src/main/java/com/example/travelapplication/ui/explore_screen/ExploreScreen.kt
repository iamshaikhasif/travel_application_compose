package com.example.travelapplication.ui.explore_screen

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircleOutline
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.travelapplication.R
import com.example.travelapplication.ui.components.GapCompose
import com.example.travelapplication.ui.home.BottomItem
import com.example.travelapplication.ui.home.RecommendationPlaceCardItem
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@Composable
fun ExploreScreen() {
    Column {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Color.Black
                )
                .padding(vertical = 10.dp, horizontal = 10.dp)
        ) {
            Text(text = "Posts", style = MaterialTheme.typography.titleLarge.copy(Color.White))
            GapCompose()
            Icon(
                imageVector = Icons.Filled.AddCircleOutline,
                contentDescription = "add",
                tint = Color.White,
                modifier = Modifier.size(25.dp)
            )
        }

        LazyColumn() {
            items(count = 5) {
                ExploreCardItem()
            }
        }
    }
}


@Composable
fun ExploreCardItem() {
    var showSheet = remember { mutableStateOf(false) }

    if (showSheet.value) {
        CommentsBottomSheet() {
            showSheet.value = false
        }
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Column {
            Row {
                Image(
                    painter = painterResource(R.drawable.splash_bg),
                    contentDescription = "avatar",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                )
                GapCompose()
                Column(
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.weight(1f)
                ) {
                    Text(text = "User Comments", style = MaterialTheme.typography.titleMedium)
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                    ) {
                        Icon(
                            imageVector = Icons.Filled.LocationOn,
                            contentDescription = "location",
                            tint = Color.Black,
                            modifier = Modifier.size(10.dp)
                        )
                        GapCompose()
                        Text(text = "Place Name", style = MaterialTheme.typography.labelSmall)
                    }
                }
            }
            GapCompose(isRow = false)
            Image(
                painter = painterResource(id = R.drawable.splash_bg),
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
            ) {
                Text(
                    text = "User Comments",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.weight(1f)
                )
                GapCompose()
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.chat),
                        contentDescription = "chat",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .size(30.dp)
                            .clickable {
                                showSheet.value = true
                            }
                    )
                    GapCompose()
                    Icon(
                        imageVector = Icons.Filled.FavoriteBorder,
                        contentDescription = "Fav",
                        tint = Color.Black,
                        modifier = Modifier.size(30.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun ExploreScreenPrev() {
    ExploreScreen()
}