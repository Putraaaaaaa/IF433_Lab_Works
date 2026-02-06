package oop_111323_GadingKelanaPutra.week01

fun main(Args : Array<String>) {
    val radius = 2.0
    val pi = 3.14

    val area = pi * radius * radius

    println("Radius : $radius, Area : $area")

    checkSize(area)
}

fun checkSize(area: Double) {
    if (area > 100) {
        println("This is Big Circle")
    } else {
        println("This is Small Circle")
    }
}