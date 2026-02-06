package oop_111323_GadingKelanaPutra.week01

fun main(){
    val name = "Gading Kelana"
    val score = 100
    val grade = when(score){
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Nama : $name, Nilai : $score")
    println("Grade : $grade")
    println("Status : ${calculatesStatus(score)}")

    val studentId: String? = null
    val idLenght = studentId?.length ?: 0

    println("Panjang Id : $idLenght")
}

fun calculatesStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"