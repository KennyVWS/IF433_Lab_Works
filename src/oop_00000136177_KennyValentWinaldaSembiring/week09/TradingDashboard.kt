package oop_00000136177_KennyValentWinaldaSembiring.week09

import kotlin.collections.filter

val tradeHistory: List<TradeLog> = listOf(
    TradeLog("BTCUSDT", "LONG", 10, 15.5, "CLOSED"),
    TradeLog("BTCUSDT", "SHORT", 20, -5.2, "OPEN"),
    TradeLog("ETHUSDT", "LONG", 5, 8.7, "CLOSED"),
    TradeLog("ETHUSDT", "LONG", 10, -12.0, "CLOSED"),
    TradeLog("SOLUSDT", "SHORT", 25, 20.3, "OPEN"),
    TradeLog("BTCUSDT", "LONG", 50, -10.5, "CLOSED")
)
    val closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }

    val winningTrades = closedTrades
            .filter { it.roe > 0}

    val losingTrades = closedTrades
        .filter { it.roe < 0 }

    val topPerformersString = closedTrades
        .filter { it.roe > 0}
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: ${it.roe} ROE (LEV: ${it.leverage})"
        }

    val worstPerformersString = closedTrades
        .filter { it.roe < 0}
        .sortedBy { it.roe }
        .map {
            "LOSS [${it.pair} - ${it.position}]: ${it.roe} ROE (LEV: ${it.leverage})"

        }

    val uniquePairs = closedTrades
        .map { it.pair }
        .toSet()

fun main() {
    println("\n=== CRYPTO TRADING DASHBOARD ===\n")
    topPerformersString.forEach {
        println(it)
    }

    worstPerformersString.forEach {
        println(it)
    }
    uniquePairs.forEach {
        println(it)
    }
}