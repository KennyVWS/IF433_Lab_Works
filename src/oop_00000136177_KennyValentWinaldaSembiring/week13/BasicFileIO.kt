package oop_00000136177_KennyValentWinaldaSembiring.week13
import java.io.File

fun main() {
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Inisiialisasi sitem. \n")
    println("File berhasil dibuat dan ditulis")
    file.appendText("Line 2: menambahkan konfigrasi baru.\n")
    println("Teks berhasil di append")

    println("\n=== TEST READ TEXT ===")
    val fullContent = file.readText()
    println("Membaca sekaligus:\n$fullContent")

    println("=== TEST READ LINES ===")
    val lines = file.readLines()
    lines.forEachIndexed { index, line ->
        println("Isi Indek $index: $line")
    }
}


