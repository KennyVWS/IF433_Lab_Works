package oop_00000136177_KennyValentWinaldaSembiring.week09

fun main() {
    println("=== TEST LAMBDA ===")
    val sumLambda = { a: Int, b: Int -> a + b }
    println("Hasil Sum: ${sumLambda(5,10)}")
    val squareImplicit: (Int) -> Int = { it * it }
    println("Hasil Square: ${squareImplicit(4)}")
}