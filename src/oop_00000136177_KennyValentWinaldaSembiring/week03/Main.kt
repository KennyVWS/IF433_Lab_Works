package oop_00000136177_KennyValentWinaldaSembiring.week03

fun main() {
    val player = Player("Kenny")

    // println(player.xp) //Ini bakal error

    player.addXp(50)
    println("${player.level}")

    player.addXp(60)
    println("${player.level}")
}