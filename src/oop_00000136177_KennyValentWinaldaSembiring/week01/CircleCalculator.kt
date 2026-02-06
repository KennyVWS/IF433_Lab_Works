package oop_00000136177_KennyValentWinaldaSembiring.week01

fun main(args: Array<String>) {
    val radius = 7.0
    val pi = 3.14

    val area: Double = pi * radius * radius
    println("Radius : $radius Area: $area")
    checkSize(area)
    val result = checkSize(area)
    println(result)

}
fun checkSize(area: Double): String = when {
    area > 100 -> "This is a Big Circle"
    else -> "This is a Small Circle"
}
