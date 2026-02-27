package oop_00000136177_KennyValentWinaldaSembiring.week04

fun main() {

    val tesla = Car.ElectricCar(
        brand = "Tesla",
        numberOfDoors = 4,
        batteryCapacity = 85
    )
    tesla.openTrunk()
    tesla.honk()
    tesla.accelerate()

}