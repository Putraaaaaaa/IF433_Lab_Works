package oop_111323_GadingKelanaPutra.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencba set gaji ke: $value")
            this.salary= value
        }
}

