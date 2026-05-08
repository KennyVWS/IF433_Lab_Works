package oop_00000136177_KennyValentWinaldaSembiring.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice(
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    ).also {
        homeDevices.add(it)
    }
}