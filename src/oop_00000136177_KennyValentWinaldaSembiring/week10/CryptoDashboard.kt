package oop_00000136177_KennyValentWinaldaSembiring.week10

fun main() {

    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 103500.0))
    coinRepo.add(Coin("ETH", 2500.0))
    coinRepo.add(Coin("USDT", 1.0))

    println(coinRepo.getAll())
}