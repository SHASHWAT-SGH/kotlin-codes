package arrays

fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    for (i in numbers){
        println(i)
    }
    println()

    val words: Array<String> = arrayOf("Kotlin", "is", "a", "programming", "language")
    for (i in words){
        println(i)
    }
    println()

    val squares = Array(5) {i -> i*i} // using lambda functions
    for (i in squares){
        println(i)
    }
}