package basics

fun main() {
    val a = 10
    val b = 20
    println("$a and $b = ${a and b}")
    println("$a or $b = ${a or b}")
    println("$a xor $b = ${a xor b}")
    println("$a inverse = ${a.inv()}")
    println("$a Shift left 1 = ${a shl 1}")
    println("$a Shift right 1 = ${a shr 1}")
    println("$a unsigned shift right 1 = ${a ushr 1}")
}