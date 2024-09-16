package com.example.travelapplication.routing

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.travelapplication.ui.explore_screen.ExploreScreen
import com.example.travelapplication.ui.welcome_screen.WelcomeScreen
import com.example.travelapplication.ui.home.DashboardScreen
import com.example.travelapplication.ui.home.FavScreen
import com.example.travelapplication.ui.home.HomeScreen
import com.example.travelapplication.ui.profile.ProfileScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = NavigationItem.Dashboard.route,
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(NavigationItem.Welcome.route) {
            WelcomeScreen(navController)
        }
        composable(NavigationItem.Dashboard.route) {
            DashboardScreen(navController)
        }
    }
}

@Composable
fun BottomNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = NavigationItem.Home.route,
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(NavigationItem.Home.route) {
            HomeScreen()
        }
        composable(NavigationItem.Favorite.route) {
            FavScreen()
        }
        composable(NavigationItem.Profile.route) {
            ProfileScreen()
        }
        composable(NavigationItem.Explore.route) {
            ExploreScreen()
        }
    }
}