package oop_00000136177_KennyValentWinaldaSembiring.week08

import sun.jvm.hotspot.debugger.Address

class City(val name: String)
class Address(val city: City?)
class DeliveryDetails(val address: Address?)
class Order(val deliveryDetails: DeliveryDetails?, val totalPrice: Int?)