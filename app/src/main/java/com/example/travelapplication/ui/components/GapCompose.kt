package com.example.travelapplication.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


@Composable
fun GapCompose(gap: Dp = 10.dp, isRow:Boolean = true) {
    if(isRow){
        Spacer(modifier = Modifier.width(gap))
    }else{
        Spacer(modifier = Modifier.height(gap))
    }
}