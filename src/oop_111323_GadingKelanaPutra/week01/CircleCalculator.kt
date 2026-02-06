package oop_111323_GadingKelanaPutra.week01

fun main(Args : Array<String>) {
    var radius: Double = 2.0
    var pi: Double = 3.14

    var area: Double = pi * radius * radius

    println("Radius : " + radius + ", Area : " + area)

    checkSize(area)
}

fun checkSize(area: Double) {
    if (area > 100) {
        println("This is Big Circle")
    } else {
        println("This is Small Circle")
    }
}