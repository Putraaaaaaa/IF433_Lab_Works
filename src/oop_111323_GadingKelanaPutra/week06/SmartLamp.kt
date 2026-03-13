package oop_111323_GadingKelanaPutra.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnon() { println("Lampu '$name' menyala terang.") }
    override fun turnoff() { println("Lampu '$name' dimatikan.") }
}