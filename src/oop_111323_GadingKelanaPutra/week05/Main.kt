package oop_111323_GadingKelanaPutra.week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println()
    }

    val math = MathHelper()
    println("=== TEST OVERLOADING MATHHELPER ===")
    println("Luas Persegi (sisi 5): ${math.hitungLuas(5)}")
    println("Luas Persegi Panjang (5x10): ${math.hitungLuas(5, 10)}")
    println("Luas Lingkaran (r 7.0): ${math.hitungLuas(7.0)}")
    println()


    val wallet = EWallet(accountName = "Gading", balance = 50000.0)
    val card = CreditCard(accountName = "Gading", limit = 100000.0)

    val listPayment: List<PaymentMethod> = listOf(wallet, card)

    println("=== SISTEM PEMBAYARAN (Checkpoint 10) ===")
    for (payment in listPayment) {
        payment.processPayment(75000.0)

        if (payment is EWallet && payment.balance < 75000.0) {
            println("=> Recovery: Saldo kurang, otomatis top up 50.000...")
            payment.topUp(50000.0)
            payment.processPayment(75000.0)
        }
        println("-------------------")
    }
}