package oop_00000136177_KennyValentWinaldaSembiring.week09

import oop_00000136177_KennyValentWinaldaSembiring.week02.Student

data class Student(val name: String, val gpa: Double)

fun main() {
    val students = listOf(
        Student("Andi", 3.2),
        Student("Budi", 3.9),
        Student("Citra", 2.8),
        Student("Dewi", 3.7)
    )
}