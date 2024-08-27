package com.example.travelapplication.ui.explore_screen

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelapplication.R
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardDoubleArrowRight
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController
import com.example.travelapplication.ui.components.SwipeToContinue


@Composable
fun ExploreScreen(navController: NavHostController,) {

    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = R.drawable.splash_bg),
                contentDescription = "bg image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(0.dp),
            )

        Column(
            modifier = Modifier.padding(10.dp)
        ) {
            Text(
                text = "Let\'s",
                color = Color.White,
                style = MaterialTheme.typography.bodyLarge.copy(fontSize = 70.sp)
            )
            Text(
                text = "enjoy the",
                color = Color.White,
                style = MaterialTheme.typography.bodyLarge.copy(fontSize = 70.sp)
            )
            Text(
                text = "beautiful",
                color = Color.White,
                style = MaterialTheme.typography.bodyLarge.copy(fontSize = 70.sp)
            )
            Text(
                text = "world.",
                color = Color.White,
                style = MaterialTheme.typography.bodyLarge.copy(fontSize = 70.sp)
            )
            Text(
                text = "Find a place for travel,campaign,hiking. Relax and cherish your dreams to the fullest.",
                color = Color.White,
                fontSize = 16.sp,
            )
            Spacer(Modifier.height(40.dp))
            SwipeToContinue() {
                Log.d("Swipe", "Click")
            }
            Spacer(Modifier.height(20.dp))
            Text(
                text = "Privacy",
                color = Color.White,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth(),
            )
        }
    }
}
