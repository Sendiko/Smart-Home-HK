package id.co.hasilkarya.smarthome.login.presentation

sealed interface LoginEvent {
    data class OnEmailChanged(val email: String) : LoginEvent
    data class OnPasswordChanged(val password: String) : LoginEvent
    data class OnPasswordVisibilityChanged(val isVisible: Boolean) : LoginEvent
    data object OnLoginClick : LoginEvent
}