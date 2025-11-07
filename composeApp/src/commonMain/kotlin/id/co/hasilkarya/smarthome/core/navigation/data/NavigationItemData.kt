package id.co.hasilkarya.smarthome.core.navigation.data

import androidx.compose.ui.graphics.vector.ImageVector

data class NavigationItemData(
    val title: String,
    val activeIcon: ImageVector,
    val inActiveIcon: ImageVector,
    val route: Any
)
