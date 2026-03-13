package oop_00000136177_KennyValentWinaldaSembiring.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name lamp is turned on")
    }

    override fun turnOff() {
        println("$name lamp is turned off")
    }
}