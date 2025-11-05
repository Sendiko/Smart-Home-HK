package id.co.hasilkarya.smarthome.smarthomehasilkarya

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform