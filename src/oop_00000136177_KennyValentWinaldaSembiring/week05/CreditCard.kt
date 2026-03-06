package oop_00000136177_KennyValentWinaldaSembiring.week05

class CreditCard(val limit: Double, var usedAmount: Double = 0.0 , accountName: String) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Transaksi Berhasil")
        } else {
            println("Transaksi Ditolak")
        }
    }
}