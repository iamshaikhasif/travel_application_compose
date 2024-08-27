package com.example.travelapplication.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.travelapplication.routing.AppNavHost

@Composable
fun MainScreen() {
    val navController = rememberNavController()

   Scaffold {
       AppNavHost(navController = navController, modifier = Modifier.padding(it))
   }
}