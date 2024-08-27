package com.example.travelapplication.routing

enum class Screen {
    HOME,
    DASHBOARD,
    LOGIN,
    EXPLORE,
    FAVORITE,
    NOTIFICATION,
}

sealed class NavigationItem(val route: String) {
    data object Home : NavigationItem(Screen.HOME.name)
    data object Dashboard : NavigationItem(Screen.DASHBOARD.name)
    data object Login : NavigationItem(Screen.LOGIN.name)
    data object Explore : NavigationItem(Screen.EXPLORE.name)
    data object Favorite : NavigationItem(Screen.FAVORITE.name)
    data object Notification : NavigationItem(Screen.NOTIFICATION.name)
}