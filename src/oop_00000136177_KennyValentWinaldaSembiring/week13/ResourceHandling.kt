package oop_00000136177_KennyValentWinaldaSembiring.week13
import java.io.File


fun main() {
    println("=== TEST UNSAFE RESOURCE HANDLING ===")
    val unsafeFile = File("unsafe_logs.txt")
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulisa data pengguna...")

    writer.close()
    println("PRoses penulisan unsafe selesai.")

    println("\n=== TEST SAFE RESOURCE HANDLING ===")
    val safeFile = File("safe_logs.txt")

    safeFile.printWriter().use { out ->
        for(i in 1..100) {
            out.println("Safe Log Entry #$i: System Status ok.")
        }
    }
    println("100 baris log berhasil di generate dengan sangat aman")
}