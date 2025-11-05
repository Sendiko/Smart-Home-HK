package id.co.hasilkarya.smarthome.login.data

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
data class LoginResponse(

	@SerialName("data")
	val data: Data,

	@SerialName("success")
	val success: Boolean,

	@SerialName("message")
	val message: String
)