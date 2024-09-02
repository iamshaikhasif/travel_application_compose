package com.example.travelapplication.ui.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
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
fun ProfileImageSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    ) {
        ProfileImageBio()
        FollowerDetails(modifier = Modifier.weight(1f))
    }
}


@Composable
fun ProfileImageBio() {
    Column(
        horizontalAlignment = Alignment.Start,
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .height(60.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.splash_bg),
                contentDescription = "avatar",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape)
            )
            /*Box(
                contentAlignment = Alignment.BottomEnd,
                modifier = Modifier
                    .size(60.dp)
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(15.dp)
                        .clip(shape = RoundedCornerShape(90.dp))
                        .background(Color.Black)
                ) {
                    Icon(
                        imageVector = Icons.Filled.Edit,
                        contentDescription = null,
                        tint = Color.White
                    )
                }
            }*/
        }

        Text(
            text = "User Name",
            style = MaterialTheme.typography.labelMedium
        )
        Text(
            text = "Description",
            style = MaterialTheme.typography.labelSmall.copy(
                fontWeight = FontWeight.Normal
            )
        )
    }
}

@Composable
fun FollowerDetails(modifier: Modifier) {
    Row(horizontalArrangement = Arrangement.Center, verticalAlignment =  Alignment.CenterVertically, modifier = modifier) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "130",
                style = MaterialTheme.typography.labelMedium
            )
            Text(
                text = "Post",
                style = MaterialTheme.typography.labelSmall.copy(
                    fontWeight = FontWeight.Normal
                )
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "130",
                style = MaterialTheme.typography.labelMedium
            )
            Text(
                text = "Post",
                style = MaterialTheme.typography.labelSmall.copy(
                    fontWeight = FontWeight.Normal
                )
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "130",
                style = MaterialTheme.typography.labelMedium
            )
            Text(
                text = "Post",
                style = MaterialTheme.typography.labelSmall.copy(
                    fontWeight = FontWeight.Normal
                )
            )
        }
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun Profile() {
    ProfileImageSection()
}