package oop_111323_GadingKelanaPutra.week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    // Chained Safe Calls (?.) dengan fallback Elvis (?:) [cite: 271]
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")
}