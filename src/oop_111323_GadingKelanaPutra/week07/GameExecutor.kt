package oop_111323_GadingKelanaPutra.week07

fun processEvent(event: BattleState) {
    when (event) {
        is MonsterEncounter -> println("Awas! ${event.monsterName} muncul!")
        is LootDropped -> {
            val (name, dmg, rarity) = event.item
            println("Dapat loot: $name (Dmg: $dmg, Rarity: $rarity)")
        }
        is GameOver -> println("Game Over: ${event.reason}")
        is SafeZone -> println("Memasuki area aman.")
    }
}