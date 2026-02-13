package oop_111323_GadingKelanaPutra.week02

fun main() {
    val sc = java.util.Scanner(System.`in`)
    print("Judul Buku: ")
    val title = sc.nextLine()
    print("Peminjam: ")
    val user = sc.nextLine()
    print("Lama Pinjam (hari): ")
    var duration = sc.nextInt()

    if (duration < 0) duration = 1

    val loan = Loan(title, user, duration)
    println("Detail Pinjam: ${loan.bookTitle} oleh ${loan.borrower} selama ${loan.loanDuration} hari.")
    println("Total Denda: Rp ${loan.calculateFine()}")
}