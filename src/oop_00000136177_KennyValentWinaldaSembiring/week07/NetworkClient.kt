package oop_00000136177_KennyValentWinaldaSembiring.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url")
    }
}