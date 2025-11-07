package id.co.hasilkarya.smarthome.core.navigation.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import id.co.hasilkarya.smarthome.core.navigation.data.NavigationItemData
import id.co.hasilkarya.smarthome.core.navigation.data.mainNavigations
import id.co.hasilkarya.smarthome.core.theme.BrokenWhite
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun NavbarItem(
    data: NavigationItemData,
    onNavigate: () -> Unit,
    isSelected: Boolean,
) {
    Surface(
        color = Color.Black.copy(0.5f),
        shape = CircleShape,
        onClick = onNavigate,
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Icon(
                imageVector = if (isSelected) data.activeIcon else data.inActiveIcon,
                contentDescription = data.title,
                tint = BrokenWhite,
            )
            AnimatedVisibility(
                visible = !isSelected,
                enter = fadeIn(),
                exit = fadeOut()
            ) {
                Text(
                    text = data.title,
                    color = BrokenWhite,
                    style = MaterialTheme.typography.labelSmall,
                )
            }
        }
    }
}

@Preview
@Composable
fun NavbarItemPreview() {
    NavbarItem(mainNavigations.first(), {}, true)
}