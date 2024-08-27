package com.example.travelapplication.ui.home

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomNav(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = "Home") },
        )
    }) { itPadding ->
        body(modifier = Modifier.padding(itPadding))
    }
}


@Composable
fun body(modifier: Modifier) {

}