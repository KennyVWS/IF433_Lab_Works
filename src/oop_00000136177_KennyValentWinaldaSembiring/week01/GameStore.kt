package oop_00000136177_KennyValentWinaldaSembiring.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 750000
    val userNote: String? = null

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        userNote = userNote
    )
}

fun printReceipt(title: String, finalPrice: Int, userNote: String?) {
    println("Game Title : $title")
    println("Final Price: $finalPrice")
    println("Note       : ${userNote ?: "Tidak ada catatan"}")
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) price * 20 / 100
    else price * 10 / 100