package oop_111323_GadingKelanaPutra.week07

class NetworkClient private constructor (val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}