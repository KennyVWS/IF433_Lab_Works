package oop_00000136177_KennyValentWinaldaSembiring.week04

fun main() {
    val manager = Manager(
        name = "Andi",
        baseSalary = 100000
    )

    val developer = Developer(
        name = "Willbert",
        baseSalary = 500000,
        programmingLanguage = "Kotlin"
    )

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")

}