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
import androidx.compose.foundation.layout.width
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
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            ProfileImageBio()
            FollowerDetails(
                modifier = Modifier
                    .weight(1f)
                    .height(60.dp)
            )
        }

        ButtonProfile()
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
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "130",
                style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Medium)
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
                style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Medium)
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
                style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Medium)
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

@Composable
fun ButtonProfile() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .height(35.dp)
                .weight(1f)
                .clip(shape = RoundedCornerShape(10.dp))
                .background(color = Color.Gray)

        ) {
            Text(
                text = "Edit profile",
                style = MaterialTheme.typography.labelLarge.copy(
                    fontWeight = FontWeight.Medium,
                    color = Color.White
                )
            )
        }

        Spacer(modifier = Modifier.width(10.dp))

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .height(35.dp)
                .weight(1f)
                .clip(shape = RoundedCornerShape(10.dp))
                .background(color = Color.Gray)

        ) {
            Text(
                text = "Follow",
                style = MaterialTheme.typography.labelLarge.copy(
                    fontWeight = FontWeight.Medium,
                    color = Color.White
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