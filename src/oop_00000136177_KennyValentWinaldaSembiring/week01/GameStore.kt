package oop_00000136177_KennyValentWinaldaSembiring.week01

fun main() {
    val gameTitle: String
    val price: Int

}

fun printReceipt(title: String, finalPrice: Int) {
    println("Game Title : $title")
    println("Final Price: $finalPrice")
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) price * 20 / 100
    else price * 10 / 100