package oop_111323_GadingKelanaPutra.week09

fun main() {
    println("=== TEST LAMBDA ===")
    // Eksplisit
    val sumLambda = { a: Int, b: Int -> a + b }
    println("Hasil Sum: ${sumLambda(5, 10)}")

    // Implicit 'it'
    val squareImplicit: (Int) -> Int = { it * it }
    println("Hasil Square: ${squareImplicit(4)}")
}