package oop_111323_GadingKelanaPutra.week03

fun main() {
    val e = Employee("Budi")

    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerfomance()

    println("Pajak yang harus dibayar: ${e.tax}")

    println("=== TEST WEAPON ===")
    val sword = Weapon("Excalibur")

    sword.damage = -50
    println("Damage sekarang: ${sword.damage}")

    sword.damage = 9999
    println("Damage sekarang: ${sword.damage}")
    println("Tier senjata: ${sword.tier}")

    println("\n=== TEST PLAYER ===")
    val player = Player("Gading")

    // println(player.xp)  // HARUS ERROR (karena private)

    player.addXp(50)   // Masih level 1
    println("Level sekarang: ${player.level}")

    player.addXp(60)   // Total 110 → Level 2
    println("Level sekarang: ${player.level}")
}