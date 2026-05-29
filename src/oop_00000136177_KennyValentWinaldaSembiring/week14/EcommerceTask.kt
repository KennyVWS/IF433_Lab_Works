package oop_00000136177_KennyValentWinaldaSembiring.week14

import java.io.File

//class BadOrderProcessor {
//    private val file = File("orders.csv")
//
//    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
//        val finalPrice = when (customerType) {
//            "REGULAR" -> basePrice
//            "VIP" -> basePrice * 0.90
//            else -> basePrice
//        }
//        println("Memproses pesanan $itemName seharga $finalPrice")
//        file.appendText("$itemName, $finalPrice, $customerType\n")
//        println("Email terkirim: Pesanan $itemName anda telah dikonfirmasi!")
//    }
//}

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

interface NotificationService {
    fun sendNotification(itemName: String)
}

class SafeOrderProcessor(val repo: OrderRepository, val notifier: NotificationService) {

}