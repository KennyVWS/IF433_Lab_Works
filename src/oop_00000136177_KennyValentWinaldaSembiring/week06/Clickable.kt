package oop_00000136177_KennyValentWinaldaSembiring.week06

interface Clickable {
    val name: String: String

    fun click()

    class Button(override val name: String) : Clickable {
        override fun click() {
            println("Tombol '$name' berhasil diklik!")
        }
    }
}