package oop_00000136177_KennyValentWinaldaSembiring.week08

sealed class Product(val id: Int, val name: String) {
    class Electronic(id: Int, name: String, val warrantyMonths: Int) : Product(id, name)
    class Clothing(id: Int, name: String, val size: String) : Product(id, name)
}
