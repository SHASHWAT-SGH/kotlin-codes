package conditionalStatements

fun main() {
    val number = 9
    when{
        number % 2 == 0 -> println("$number is even")
        number % 2 != 0 -> println("$number is odd")
    }
}