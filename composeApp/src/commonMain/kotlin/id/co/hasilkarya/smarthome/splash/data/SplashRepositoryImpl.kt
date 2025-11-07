package id.co.hasilkarya.smarthome.splash.data

import id.co.hasilkarya.smarthome.core.preferences.AppPreferences
import id.co.hasilkarya.smarthome.splash.domain.SplashRepository
import kotlinx.coroutines.flow.Flow

class SplashRepositoryImpl(
    private val preferences: AppPreferences
): SplashRepository {
    override fun getToken(): Flow<String> {
        return preferences.getToken()
    }
}