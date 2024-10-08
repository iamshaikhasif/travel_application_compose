package com.example.travelapplication.ui.home

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.travelapplication.data.BottomItemModel
import com.example.travelapplication.routing.AppNavHost
import com.example.travelapplication.routing.BottomNavHost
import com.example.travelapplication.routing.NavigationItem


@Composable
fun DashboardScreen(navController: NavHostController) {
    val bottomNav = rememberNavController()
    Scaffold(
        modifier = Modifier.background(Color.White),
        bottomBar = {
            BottomItem(navController = bottomNav, modifier = Modifier)
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier.padding(paddingValues)
        ) {
            BottomNavHost(navController = bottomNav)
        }
    }
}

@Composable
fun BottomItem(
    navController: NavHostController, modifier: Modifier = Modifier
) {
    val screens = listOf(
        BottomItemModel.HomeScreen,
        BottomItemModel.Explore,
        BottomItemModel.Favourite,
        BottomItemModel.Notification
    )

    NavigationBar(
        modifier = modifier
            .height(90.dp)
            .background(Color.White)
            .padding(10.dp)
            .clip(shape = RoundedCornerShape(20.dp)),
        containerColor = Color.Black
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        screens.forEach { screen ->
            NavigationBarItem(
                selected = false,
                onClick = {
                    try {
                        Log.d("route", screen.route)
                        navController.navigate(route = screen.route) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    } catch (e: Exception) {
                        Log.d("route", e.message ?: "no error")
                    }
                },
                icon = {
                    Icon(
                        modifier = Modifier.size(25.dp),
                        imageVector = screen.icon,
                        contentDescription = "",
                        tint = if (currentRoute == screen.route) Color.Red else Color.White
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    unselectedTextColor = Color.Transparent, selectedTextColor = Color.Transparent,
                )
            )
        }

    }
}