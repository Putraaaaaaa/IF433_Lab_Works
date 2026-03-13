package oop_111323_GadingKelanaPutra.week06

class Smartphone : Camera, Phone {
    override fun turnon() {
        super<Camera>.turnon()
        super<Phone>.turnon()
        println("Sistem operasi Smartphone berhasil booting.")
    }
}