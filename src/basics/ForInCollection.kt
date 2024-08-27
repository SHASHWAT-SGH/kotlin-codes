package basics

fun main() {
    val fruits = listOf("Apple", "Banana", "Cherry")
    for(fruit in fruits){
        println(fruit)
    }
    for(i in fruits.indices){
        println("$i : ${fruits[i]}")
    }
}