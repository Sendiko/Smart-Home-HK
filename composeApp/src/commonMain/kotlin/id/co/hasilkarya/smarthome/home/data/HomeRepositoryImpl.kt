package id.co.hasilkarya.smarthome.home.data

import id.co.hasilkarya.smarthome.core.network.utils.DataError
import id.co.hasilkarya.smarthome.core.network.utils.Result
import id.co.hasilkarya.smarthome.home.data.datasource.HomeDataSource
import id.co.hasilkarya.smarthome.home.data.dto.toDomain
import id.co.hasilkarya.smarthome.home.domain.HomeRepository
import id.co.hasilkarya.smarthome.home.domain.models.Device
import id.co.hasilkarya.smarthome.home.domain.models.User
import kotlinx.coroutines.flow.Flow

class HomeRepositoryImpl(
    private val dataSource: HomeDataSource
): HomeRepository {
    override fun getToken(): Flow<String> {
        return dataSource.getToken()
    }

    override suspend fun getDevices(token: String): Result<List<Device>, DataError.Remote> {
        return when (val result = dataSource.getDevices(token)) {
            is Result.Success -> Result.Success(result.data.data.map { item -> item.toDomain() })
            is Result.Error -> Result.Error(result.error)
        }
    }

    override suspend fun getUser(token: String): Result<User, DataError.Remote> {
        return when(val result = dataSource.getUser(token)) {
            is Result.Success -> Result.Success(result.data.userDto.toDomain())
            is Result.Error -> Result.Error(result.error)
        }
    }
}