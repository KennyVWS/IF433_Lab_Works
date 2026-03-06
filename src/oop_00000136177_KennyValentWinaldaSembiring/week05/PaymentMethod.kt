package oop_00000136177_KennyValentWinaldaSembiring.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}