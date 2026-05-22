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