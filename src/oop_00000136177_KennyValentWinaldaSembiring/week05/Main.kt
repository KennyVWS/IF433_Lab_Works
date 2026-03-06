package oop_00000136177_KennyValentWinaldaSembiring.week05

fun main() {

    val wallet = EWallet(50000.0, "Kenny")
    val card = CreditCard(100000.0, accountName = "Kenny")

    val paymentMethods: List<PaymentMethod> = listOf(wallet, card)

    for (method in paymentMethods) {
        method.processPayment(75000.0)
    }

}