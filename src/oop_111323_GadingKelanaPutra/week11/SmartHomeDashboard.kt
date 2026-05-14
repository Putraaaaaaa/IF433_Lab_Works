package oop_111323_GadingKelanaPutra.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    val lamp = SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also { homeDevices.add(it) }