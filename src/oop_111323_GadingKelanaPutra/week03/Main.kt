package oop_111323_GadingKelanaPutra.week03

fun main() {
    val e = Employee("Budi")

    e.salary = -1000 //Harusnya Print Error
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerfomance()

    println("Pajak yang harus dibayar: ${e.tax}")
}