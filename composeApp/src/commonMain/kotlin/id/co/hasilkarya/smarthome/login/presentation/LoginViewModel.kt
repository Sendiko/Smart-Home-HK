package id.co.hasilkarya.smarthome.login.presentation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class LoginViewModel: ViewModel() {

    private val _state = MutableStateFlow(LoginState())
    val state = _state.asStateFlow()

    fun onEvent(event: LoginEvent) {
        when(event) {
            is LoginEvent.OnEmailChanged -> changeEmail(event.email)
            is LoginEvent.OnPasswordChanged -> changePassword(event.password)

            is LoginEvent.OnPasswordVisibilityChanged -> changePasswordVisibility(event.isVisible)

            LoginEvent.OnLoginClick -> login()
        }
    }

    private fun login() {
        // TODO: LOGIN to Remote Data Source
    }

    private fun changePasswordVisibility(isVisible: Boolean) {
        _state.value = _state.value.copy(
            isPasswordVisible = isVisible
        )
    }

    private fun changePassword(password: String) {
        _state.value = _state.value.copy(
            password = password
        )
    }

    fun changeEmail(email: String) {
        _state.value = _state.value.copy(
            email = email
        )
    }

}