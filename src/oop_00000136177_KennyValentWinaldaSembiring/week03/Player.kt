package oop_00000136177_KennyValentWinaldaSembiring.week03

class Player(var username: String) {
    private var xp: Int = 0
//        set(value) {
//            if (value < 0) {
//                println("Xp tidak boleh negatif!")
//            } else {
//                field = value
//            }
//        }
    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount < 0) {
            println("Xp harus positif")
            return
        }

        val oldLevel = level
        xp += amount
        val newLevel = level

        if (newLevel > oldLevel) {
            println("Level up! Selamat $username naik ke level $newLevel")
        }
    }
}
