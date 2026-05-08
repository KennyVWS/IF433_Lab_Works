package oop_00000136177_KennyValentWinaldaSembiring.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice(
        "Philips WiZ Living Room",
        "Lighting",
        true,
        12
    ).also {
        homeDevices.add(it)
    }
    SmartDevice(
        "Ezviz Outdoor",
        "Camera"
    ).apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }
}