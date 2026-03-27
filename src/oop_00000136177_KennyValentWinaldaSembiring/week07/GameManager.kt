package oop_00000136177_KennyValentWinaldaSembiring.week07

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame() {
        if (isGameRunning == false) {
            isGameRunning = true
            println("Game sudah berjalan!")
        } else {
            println("Game sudah berjalan! Mencegah instansiasi ganda.")
        }
    }
}