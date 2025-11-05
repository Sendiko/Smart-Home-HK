package id.co.hasilkarya.smarthome.core

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.lifecycle.viewmodel.compose.viewModel
import id.co.hasilkarya.smarthome.core.theme.BrokenWhite
import id.co.hasilkarya.smarthome.core.theme.SmartHomeTheme
import id.co.hasilkarya.smarthome.login.presentation.LoginScreen
import id.co.hasilkarya.smarthome.login.presentation.LoginViewModel
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import smarthomehasilkarya.composeapp.generated.resources.Res
import smarthomehasilkarya.composeapp.generated.resources.app_name

@Composable
@Preview
fun App() {
    SmartHomeTheme {
        val viewModel = viewModel<LoginViewModel>()
        val state by viewModel.state.collectAsState()
        LoginScreen(
            state = state,
            onEvent = viewModel::onEvent
        )
    }
}