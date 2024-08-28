package functions

fun sum(a: Int = 10, b: Int = 20){
    val c = a+b
    println(c)
}

fun sum2(a: Int, b:Int){
    val c = a+b
    println(c)
}
fun main() {
    sum(20, 50)
    sum()
    sum2(100, 200)
//    sum2() //error, no arguments for parameter ---
}