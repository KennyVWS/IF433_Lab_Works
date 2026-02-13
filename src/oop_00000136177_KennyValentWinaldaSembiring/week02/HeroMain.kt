package oop_00000136177_KennyValentWinaldaSembiring.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Masukkan Nama Hero:")
    val nameInput = scanner.nextLine()
    print("Masukkan Base Damage:")
    val damageInput = scanner.nextInt()
    val hero = Hero(Name = nameInput, BaseDamage = damageInput )
    val BaseDamage = scanner.nextLine()
    var HpEnemy = 100

    while(hero.isAlive() && HpEnemy > 0) {
        println("\nHP Kamu: ${hero.Hp} | HP Musuh: $HpEnemy")
        print("1.Serang 2.Kabur: ")
        val pilihan = scanner.nextInt()
        if (pilihan == 1) {
            hero.attack("Musuh")
            HpEnemy -= hero.BaseDamage
            println("Sisa Hp Musuh = $HpEnemy")
                if (HpEnemy > 0) {
                    val monsterDamage = (10..20).random()
                    println("Musuh menyerang! Kamu terkena $monsterDamage damage.")
                    hero.takeDamage(monsterDamage)

                }
        } else if (pilihan == 2) {
            println("Kamu melarikan diri dari pertempuran!")
            break
        }
        else {
            println("Pilihan tidak valid!")
        }
    }
    println("\n==========================")
    if (HpEnemy <= 0) {
        println("Selamat! ${hero.Name} menang!")
    } else if (!hero.isAlive()) {
        println("Sayang sekali, ${hero.Name} telah gugur.")
    } else {
        println("Pertarungan berakhir tanpa pemenang (Kabur).")
    }
}

