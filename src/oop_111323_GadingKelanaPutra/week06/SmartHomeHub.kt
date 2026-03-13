package oop_111323_GadingKelanaPutra.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) { devices.add(device) }

    fun turnOffAllSwitches() {
        for (device in devices) {
            if (device is Switchable) { device.turnoff() }
        }
    }
}