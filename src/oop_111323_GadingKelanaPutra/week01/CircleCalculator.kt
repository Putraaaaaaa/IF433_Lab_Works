package oop_111323_GadingKelanaPutra.week01

fun main(Args : Array<String>) {
    val radius = 2.0
    val pi = 3.14

    val area = pi * radius * radius

    println("Radius : $radius, Area : $area")

    println(checkSize(area))
}

fun checkSize(area: Double) = if (area > 100) "Circle is Big" else "Circle is Small"
