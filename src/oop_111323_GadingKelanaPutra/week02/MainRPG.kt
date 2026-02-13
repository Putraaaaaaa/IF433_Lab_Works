package oop_111323_GadingKelanaPutra.week02

fun main() {
    val sc = java.util.Scanner(System.`in`)
    print("Nama Hero: ")
    val name = sc.nextLine()
    print("Damage Hero: ")
    val dmg = sc.nextInt()

    val myHero = Hero(name, dmg)
    var enemyHp = 100

    while (myHero.isAlive() && enemyHp > 0) {
        println("\n--- Turn ---")
        println("1. Serang\n2. Kabur")
        print("Aksi: ")
        val choice = sc.nextInt()

        if (choice == 1) {
            myHero.attack("Musuh")
            enemyHp -= myHero.baseDamage
            println("HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val eDmg = (10..20).random()
                myHero.takeDamage(eDmg)
                println("Musuh membalas! HP $name: ${myHero.hp}")
            }
        } else {
            println("Kabur dari medan tempur!")
            break
        }
    }

    if (enemyHp <= 0) println("Menang!") else if (!myHero.isAlive()) println("Kalah!")
}