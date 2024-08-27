package com.example.travelapplication.routing

enum class Screen {
    HOME,
    LOGIN,
    EXPLORE,
}

sealed class NavigationItem(val route: String) {
    data object Home : NavigationItem(Screen.HOME.name)
    data object Login : NavigationItem(Screen.LOGIN.name)
    data object Explore : NavigationItem(Screen.EXPLORE.name)
}