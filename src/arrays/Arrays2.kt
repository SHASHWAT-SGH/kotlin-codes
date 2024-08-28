package arrays

fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val firstNumber = numbers[0]
    val secondNumber = numbers[1]
    println("First number: $firstNumber")
    println("Second number: $secondNumber")

    numbers[0] = 11
    println("First number after changing: ${numbers[0]}")

    for (num in numbers) {
        println(num)
    }
}