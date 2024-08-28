package com.example.travelapplication.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.travelapplication.routing.NavigationItem

sealed class BottomItemModel(
    val route: String,
    val title: String = "",
    val icon: ImageVector = Icons.Outlined.Home
) {
    data object HomeScreen : BottomItemModel(
        route = NavigationItem.Home.route,
        title = "Home",
        icon = Icons.Outlined.Home
    )

    data object Explore : BottomItemModel(
        route = NavigationItem.Explore.route,
        title = "Explore",
        icon = Icons.Outlined.Dashboard
    )

    data object Favourite : BottomItemModel(
        route = NavigationItem.Favorite.route,
        title = "Favorite",
        icon = Icons.Outlined.FavoriteBorder
    )

    data object Notification : BottomItemModel(
        route = NavigationItem.Profile.route,
        title = "Profile",
        icon = Icons.Outlined.Person2
    )

}