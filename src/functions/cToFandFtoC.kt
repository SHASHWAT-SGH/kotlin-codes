package functions

fun cToF(c: Double):Double{
    return (9*c/5)+32
}

fun fToC(f: Double):Double{
    return (f-32)*5/9
}

fun main() {
    println(cToF(100.toDouble()))
    println(fToC(212.toDouble()))

}