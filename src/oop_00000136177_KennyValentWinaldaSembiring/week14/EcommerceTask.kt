package oop_00000136177_KennyValentWinaldaSembiring.week14

import java.io.File

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

interface NotificationService {
    fun sendNotification(itemName: String)
}

interface PricingStrategy {
    fun calculate(price: Double): Double
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price * 0.90
    }
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double {
        return price
    }
}

class SafeOrderProcessor(val repo: OrderRepository, val notifier: NotificationService) {
    fun processOrder(itemName: String, basePrice: Double, pricingStrategy: PricingStrategy) {
        val finalPrice = pricingStrategy.calculate(basePrice)
        println("Memproses pesanan $itemName seharga $finalPrice")
        notifier.sendNotification(itemName)
    }
}