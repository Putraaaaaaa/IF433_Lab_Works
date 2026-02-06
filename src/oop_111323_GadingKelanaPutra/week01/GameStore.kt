package oop_001_johnthor.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 600000
    val discount = calculateDiscount(price)

    val userNote: String? = null
    val finalNote = userNote ?: "Tidak ada catatan" [cite: 259]

    printReceipt(title = gameTitle, finalPrice = price - discount, note = finalNote)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(title: String, finalPrice: Int, note: String) {
    println("--- Struk Pembelian ---")
    println("Judul: $title")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan: $note")
}