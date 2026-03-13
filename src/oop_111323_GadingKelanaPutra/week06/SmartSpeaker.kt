package oop_111323_GadingKelanaPutra.week06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnon() { println("Speaker '$name' aktif.") }
    override fun turnoff() { println("Speaker '$name' standby.") }
    fun playMusic(song: String) { println("Memutar lagu $song dari Spotify.") }
}