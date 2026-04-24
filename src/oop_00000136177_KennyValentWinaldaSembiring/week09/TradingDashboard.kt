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
