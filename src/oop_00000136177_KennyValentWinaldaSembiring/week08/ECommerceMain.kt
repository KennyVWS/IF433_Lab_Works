package oop_00000136177_KennyValentWinaldaSembiring.week08

fun main() {
    val parser = ApiParser()

    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf(
            "id" to 101,
            "name" to "Laptop",
            "type" to "ELECTRONIC",
            "warranty" to 24
        ),
        mapOf(
            "id" to 201,
            "name" to "T-Shirt",
            "type" to "CLOTHING",
            "size" to "XL"
        ),
        mapOf(
            "id" to 102,
            "name" to "Mouse",
            "type" to "ELECTRONIC",
            "warranty" to "Not An Integer"
        ),
        mapOf(
            "name" to "Ghost Item",
            "type" to "CLOTHING"
        ),
        mapOf(
            "id" to 301,
            "name" to "Unknown",
            "type" to "FOOD"
        )
    )

    println("--- Memulai Proses Batch Checkout ---")

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)

            product?.let {
                val info = when(it) {
                    is Product.Electronic -> "Processing: ${it.name} (Warranty ${it.warrantyMonths})"
                    is Product.Clothing -> "Processing: ${it.name} (Size ${it.size})"
                }
                val details = when(it) {
                    is Product.Electronic -> "(Warranty ${it.warrantyMonths})"
                    is Product.Clothing -> "(Size ${it.size})"
                }
                println("Processing: ${it.name} $details")

                parser.checkout(it)
            } ?: println("Log: [FOOD] di-skip (Tipe produk tidak didukung).")

        } catch (e: IllegalArgumentException) {
            println("Log: Exception ditangkap untuk data korup! -> ${e.message}")
        }
        println("-----------------------------------")
    }

    println("--- Proses Selesai ---")
}