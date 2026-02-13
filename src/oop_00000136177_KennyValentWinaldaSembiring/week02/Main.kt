package oop_00000136177_KennyValentWinaldaSembiring.week02

import java.util.Scanner

fun main() {
    val scanner  = Scanner(System.`in`)
    println("--- APLIKASI PMB UMN ---")
    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        print("Masukkan GPA (atau tekan Enter untuk skip): ")
        val gpaInput = scanner.nextLine()
        val gpa = if (gpaInput.isNotBlank()) gpaInput.toDouble() else 0.0

        val s1 = Student(name = name, nim = nim, gpa = gpa , major = major)
        println("Status: Pendaftaran Selesai")
    }
}