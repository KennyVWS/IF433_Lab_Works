package oop_00000136177_KennyValentWinaldaSembiring.week06

class SmartCCTV (
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("$name dinyalakan")
        startRecord()
    }

    override fun turnOff() {
        println("$name cctv is turned off")
    }

    override fun startRecord() {
    }
}