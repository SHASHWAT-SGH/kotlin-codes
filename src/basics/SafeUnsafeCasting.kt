package basics

fun main() {
    val a = "hi"
    val b: String = a as String // unsafe
    println("b: $b")

//    val c: Int = a as Int // java.lang.ClassCastException

    val d: String? = a as? String // safe
    println("d: $d")

    val e: Int? = a as? Int
    println("e: $e")

}