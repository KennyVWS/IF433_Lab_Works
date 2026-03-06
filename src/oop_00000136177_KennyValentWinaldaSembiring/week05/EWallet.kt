package oop_00000136177_KennyValentWinaldaSembiring.week05

class EWallet(var balance: Double, accountName: String) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Transaksi Berhasil")
        } else {
            println("Saldo Tidak Cukup")
        }
    }
    fun topUp(amount: Double) {
        balance += amount
        println("Topup berhasil Saldo Sekarang: $balance")
    }
}