package id.co.hasilkarya.smarthome.core.navigation.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LockClock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Dashboard
import androidx.compose.material.icons.outlined.History
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.LockClock
import androidx.compose.material.icons.outlined.Person

val mainNavigations = listOf(
    NavigationItemData(
        title = "Home",
        activeIcon = Icons.Filled.Dashboard,
        inActiveIcon = Icons.Outlined.Dashboard,
        route = HomeDestination
    ),
    NavigationItemData(
        title = "History",
        activeIcon = Icons.Filled.History,
        inActiveIcon = Icons.Outlined.History,
        route = HistoryDestination
    ),
    NavigationItemData(
        title = "Automasi",
        activeIcon = Icons.Filled.LockClock,
        inActiveIcon = Icons.Outlined.LockClock,
        route = AutomationDestination
    ),
    NavigationItemData(
        title = "Profile",
        activeIcon = Icons.Filled.Person,
        inActiveIcon = Icons.Outlined.Person,
        route = ProfileDestination
    ),
)