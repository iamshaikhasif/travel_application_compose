package com.example.travelapplication.ui.explore_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.travelapplication.R
import com.example.travelapplication.ui.components.CustomOutlinedTextField
import com.example.travelapplication.ui.components.GapCompose


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CommentsBottomSheet(onDismiss: () -> Unit) {
    val modalBottomSheetState = rememberModalBottomSheetState()

    ModalBottomSheet(
        onDismissRequest = { onDismiss() },
        sheetState = modalBottomSheetState,
        dragHandle = { BottomSheetDefaults.DragHandle() },
    ) {
        BottomSheetCard()
    }
}


@Composable
fun BottomSheetCard() {
    var text by remember { mutableStateOf("") }
    var error by remember { mutableStateOf("") }
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
    ) {
        LazyColumn(modifier = Modifier.padding(10.dp)) {
            items(count = 5) {
                Row {
                    Image(
                        painter = painterResource(R.drawable.splash_bg),
                        contentDescription = "avatar",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(20.dp)
                            .clip(CircleShape)
                    )
                    GapCompose()
                    Column(
                        horizontalAlignment = Alignment.Start,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(
                            text = "_exampleUserName_",
                            style = MaterialTheme.typography.labelSmall
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(text = "Comments", style = MaterialTheme.typography.labelSmall)
                            GapCompose()
                            Icon(
                                imageVector = Icons.Filled.FavoriteBorder,
                                contentDescription = "fav",
                                tint = Color.Black,
                                modifier = Modifier.size(10.dp)
                            )
                        }
                    }
                }
            }
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            Box(
                modifier = Modifier
                    .weight(1f),
            ) {
                CustomOutlinedTextField(
                    value = text,
                    onValueChange = {
                        text = it
                    },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(40.dp),
                    errorMessage = error
                )
            }
            GapCompose()
            Icon(
                imageVector = Icons.Filled.Send,
                contentDescription = "send",
                tint = Color.Black,
                modifier = Modifier.size(25.dp).clickable {
                    if(text.length == 0){
                        error = "Please enter the comments"
                    }
                }
            )

        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun CommentsBottomSheetPrev() {
    BottomSheetCard()
}