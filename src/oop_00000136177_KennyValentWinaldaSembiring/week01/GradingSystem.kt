package oop_00000136177_KennyValentWinaldaSembiring.week01

fun main() {
    var name: String = "John Thor"
    var score: Int = 80

    println("Nama: $name, Nilai: $score")
    val grade = when (score) {
        in 90.. 100 -> "A"
        in 80..80  -> "B"
        in 70..70  -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")
    println("Status: ${calculateStatus(score)}")
    val studentId: String? = null
    val idLength = studentId?.length ?: 0
    println("Panjang ID : $idLength")
}
fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"