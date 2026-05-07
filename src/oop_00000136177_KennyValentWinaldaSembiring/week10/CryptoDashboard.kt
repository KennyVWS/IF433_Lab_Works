package oop_00000136177_KennyValentWinaldaSembiring.week10

fun main() {

    data class ApiResponse<T>(
        val status: String,
        val data: T
    )

    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 103500.0))
    coinRepo.add(Coin("ETH", 2500.0))
    coinRepo.add(Coin("USDT", 1.0))

    val response = ApiResponse(
        "200 OK",
        coinRepo.getAll()
    )
    println("Status: ${response.status}")


    response.data.forEach { coin ->
        println("Coin: ${coin.name}")
        println("Price: ${coin.price}")
        println()
    }
    println(response)
}