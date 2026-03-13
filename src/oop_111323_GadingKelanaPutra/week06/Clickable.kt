package oop_111323_GadingKelanaPutra.week06

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}

interface Clickable {
    val name: String
    fun click()
}

