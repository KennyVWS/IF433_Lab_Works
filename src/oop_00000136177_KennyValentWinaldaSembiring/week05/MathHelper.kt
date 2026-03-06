package oop_00000136177_KennyValentWinaldaSembiring.week05

fun hitungLuas(sisi: Int): Int{
    return sisi * sisi
}

fun hitungLuas(panjang: Int, lebar: Int): Int{
    return panjang * lebar
}

fun hitungLuas(jariJari: Double): Double {
    return 3.14 * jariJari * jariJari
}

fun main() {
    println(hitungLuas(4))
    println(hitungLuas(5, 3))
    println(hitungLuas(7.0))
}