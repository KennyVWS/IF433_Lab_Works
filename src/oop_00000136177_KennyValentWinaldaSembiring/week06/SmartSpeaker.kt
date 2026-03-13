package oop_00000136177_KennyValentWinaldaSembiring.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name speaker is turned on")
    }

    override fun turnOff() {
        println("$name speaker is turned off")
    }
    fun playMusic(song: String) {
        println("Memutar lagu $song dari spotify")
    }

}