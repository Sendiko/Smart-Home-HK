package id.co.hasilkarya.smarthome.smarthomehasilkarya

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}