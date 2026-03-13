package oop_00000136177_KennyValentWinaldaSembiring.week06

interface SmartDevice {
    val id: String
    val name: String
}

interface Switchable {
     fun turnon()
     fun turnOff()
}

interface Recordable {
    fun startRecord()
    fun stopRecord() {
        println("Perekaman dihentikan dan disimpan ke Cloud")
    }
}