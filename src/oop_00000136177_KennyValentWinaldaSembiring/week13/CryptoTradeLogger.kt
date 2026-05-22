package oop_00000136177_KennyValentWinaldaSembiring.week13
import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String {
    return "$id,$symbol,$type,$margin,$pnl"
}

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val tokens = line.split(",")
        TradeRecord(
            id = tokens[0].trim().toInt(),
            symbol = tokens[1].trim(),
            type = tokens[2].trim(),
            margin = tokens[3].trim().toDouble(),
            pnl = tokens[4].trim().toDouble()
        )
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { line ->
            fromCsvTrade(line)
        }
    } catch (e: FileNotFoundException) {
        println("(Log) File tidak ditemukan di path: $path. Mengembalikan list kosong.")
        emptyList()
    }
}

fun main() {
    println("=== Sistem Log Crypto Trade ===")
    val mockTrades = listOf(
        TradeRecord(id = 1, symbol = "BTCUSDT", type = "LONG", margin = 150.0, pnl = 45.25),
        TradeRecord(id = 2, symbol = "ETHUSDT", type = "SHORT", margin = 80.0, pnl = -12.50),
        TradeRecord(id = 3, symbol = "SOLUSDT", type = "LONG", margin = 50.0, pnl = 8.10)
    )

    val filePath = "crypto_trades.csv"
    saveTrades(mockTrades, filePath)

    File(filePath).appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")

    val loadedData = loadTrades(filePath)
    loadedData.forEach { trade ->
        println("ID: ${trade.id} | ${trade.symbol} | Type: ${trade.type} | Margin: \$${trade.margin} | PnL: \$${trade.pnl}")
    }
    val totalPnl = loadedData.sumOf { it.pnl }
    println("==== TOTAL PnL BERSIH: $$totalPnl ====")

}