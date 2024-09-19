package com.example.travelapplication.ui.home

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FilterAlt
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelapplication.ui.components.GapCompose

@Composable
fun HomeSearchCompose() {
    Text(
        text = "Discover",
        style = MaterialTheme.typography.bodyLarge.copy(
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    )
    Text(
        text = "New Destination",
        style = MaterialTheme.typography.bodyLarge.copy(
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    )

    GapCompose(isRow = false)

    Row(
        modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .weight(weight = 1f)
                .height(50.dp)
                .background(Color.Transparent)
                .clip(shape = RoundedCornerShape(10.dp))
                .border(width = 1.dp, color = Color.Gray)
        ) {
            Row (verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                .height(50.dp).padding(horizontal = 10.dp)) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = null,
                    tint = Color.Gray
                )
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    text = "Discover a city..",
                    modifier = Modifier.padding(0.dp),
                    style = MaterialTheme.typography.labelSmall.copy(color = Color.Gray)
                )
            }

        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(5.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .background(color = Color.Black)
                .size(50.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.FilterAlt,
                contentDescription = null,
                tint = Color.White
            )
        }
    }
}