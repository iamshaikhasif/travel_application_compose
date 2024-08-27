package com.example.travelapplication.routing

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.travelapplication.ui.explore_screen.ExploreScreen
import com.example.travelapplication.ui.home.BottomNav


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = NavigationItem.Explore.route,
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(NavigationItem.Explore.route) {
            ExploreScreen(navController)
        }
        composable(NavigationItem.Home.route) {
            BottomNav(navController)
        }
    }
}