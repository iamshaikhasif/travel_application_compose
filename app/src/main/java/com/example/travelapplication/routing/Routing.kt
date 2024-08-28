package com.example.travelapplication.routing

enum class Screen {
    HOME,
    DASHBOARD,
    LOGIN,
    EXPLORE,
    FAVORITE,
    PROFILE,
    WELCOME,
}

sealed class NavigationItem(val route: String) {
    data object Home : NavigationItem(Screen.HOME.name)
    data object Dashboard : NavigationItem(Screen.DASHBOARD.name)
    data object Login : NavigationItem(Screen.LOGIN.name)
    data object Explore : NavigationItem(Screen.EXPLORE.name)
    data object Favorite : NavigationItem(Screen.FAVORITE.name)
    data object Welcome : NavigationItem(Screen.WELCOME.name)
    data object Profile : NavigationItem(Screen.PROFILE.name)
}