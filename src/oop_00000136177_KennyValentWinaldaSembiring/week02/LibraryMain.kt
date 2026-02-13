package oop_00000136177_KennyValentWinaldaSembiring.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- APLIKASI PEMINJAMAN BUKU ---")
    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan Judul Buku: ")
    val judul = scanner.nextLine()

    print("Masukkan Durasi Peminjaman: ")
    var loanDuration = scanner.nextInt()

    if (loanDuration < 0) {
        println("Input tidak valid. Lama pinjam diatur menjadi 1 hari.")
        loanDuration = 1
    }
    
    val loan1 = Loan(
        bookTitle = judul,
        borrower = name,
        loanDuration = loanDuration
    )
    
    var denda = loan1.calculateFine()

    println("--- HASIL PEMINJAMAN ---")
    println("Peminjam: ${loan1.borrower}")
    println("Judul Buku: ${loan1.bookTitle}")
    println("Durasi Peminjaman: ${loan1.loanDuration}")
    println("Denda Peminjaman: Rp $denda")
}