package oop_00000136177_KennyValentWinaldaSembiring.week10

data class Coin(
    override val name: String,
    val price: Double
) : HasName

interface HasName {
    val name: String
}

class WalletRepository<T : Any> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun searchByName(keyword: String): List<T> {
        return items.filter {
            it is HasName &&
                    it.name.contains(keyword, ignoreCase = true)
        }
    }
}