package com.example.travelapplication.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
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
        icon = Icons.Filled.Home
    )

    data object Explore : BottomItemModel(
        route = NavigationItem.Explore.route,
        title = "Explore",
        icon = Icons.Filled.Dashboard
    )

    data object Favourite : BottomItemModel(
        route = NavigationItem.Favorite.route,
        title = "Favorite",
        icon = Icons.Filled.BookmarkBorder
    )

    data object Notification : BottomItemModel(
        route = NavigationItem.Profile.route,
        title = "Profile",
        icon = Icons.Filled.Person2
    )

}