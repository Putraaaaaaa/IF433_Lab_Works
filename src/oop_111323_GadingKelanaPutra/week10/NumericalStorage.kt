package oop_111323_GadingKelanaPutra.week10

class MathBox<T : Number>(val value1: T, val value2: T) {
    fun sum(): Double {
        return value1.toDouble() + value2.toDouble()
    }
    fun <T> myGetMax(a: T, b: T): T where T : Comparable<T> {
        return if (a > b) a else b
    }
}

fun <T> myGetMax(a: T, b: T): T where T : Comparable<T> {
    return if (a > b) a else b
}