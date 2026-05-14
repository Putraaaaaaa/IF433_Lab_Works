package oop_111323_GadingKelanaPutra.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    // Checkpoint 16: Populatee
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 100.0))
}