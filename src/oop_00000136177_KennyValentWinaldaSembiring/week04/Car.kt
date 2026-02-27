package oop_00000136177_KennyValentWinaldaSembiring.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    override fun honk() {
        println("TIN! TIN! Mobil $brand lewat!")
    }

    override fun accelerate() {
        super.accelerate()
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }

    class ElectricCar(brand: String, numberOfDoors: Int, var batteryCapacity: Int ) : Car(brand, numberOfDoors)
    {

        final override fun accelerate() {
            println("Mobil $brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%")
        }

    }
}