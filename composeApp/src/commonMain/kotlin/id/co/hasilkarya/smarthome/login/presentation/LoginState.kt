package id.co.hasilkarya.smarthome.login.presentation

data class LoginState(
    val isLoading: Boolean = false,
    val isSuccess: Boolean = false,
    val isError: Boolean = false,
    val message: String? = null,
    val email: String = "",
    val password: String = "",
    val isPasswordVisible: Boolean = false,
)
