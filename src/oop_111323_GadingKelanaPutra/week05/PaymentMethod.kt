package oop_111323_GadingKelanaPutra.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}