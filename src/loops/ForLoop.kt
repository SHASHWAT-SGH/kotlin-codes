package loops

fun main() {
    for(i in 1..5){
        println(i)
    }
    println("------")
    for(i in 1 until 5){
        println(i)
    }
    println("------")
    for(i in 5 downTo 1){
        println(i)
    }
    println("------")
    for(i in 5 downTo 1 step 2){
        println(i)
    }
    println("------")
    for(i in 1..10 step 2){
        println(i)
    }
}