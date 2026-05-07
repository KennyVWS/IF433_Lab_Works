package oop_00000136177_KennyValentWinaldaSembiring.week10

fun main() {

    val coinRepo = WalletRepository<coin>()
    coinRepo.add(coin("BTC", 103500.0))
    coinRepo.add(coin("ETH", 2500.0))
    coinRepo.add(coin("USDT", 1.0))

    val response = ApiResponse(
        "200 OK",
        coinRepo.getAll()
    )
    println("Status: ${response.status}")
    println()

    response.data.forEach { coin ->
        println("Coin: ${coin.name}")
        println("Balance: ${coin.balance}")
        println()
    }
    val txRepo = WalletRepository<transaction>()

    txRepo.add(transaction("Buy BTC", 0.5))
    txRepo.add(transaction("Sell ETH", 1.2))
    txRepo.add(transaction("Transfer USDT", 300.0))


    println("=== Transactions ===")

    txRepo.getAll().forEach { tx ->
        println("Transaction: ${tx.id}")
        println("Amount: ${tx.amount}")
        println()
    }
}
