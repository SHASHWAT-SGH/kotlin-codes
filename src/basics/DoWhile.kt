package basics

fun main() {
    var i = 5
    do{
        println("value: $i")
        i--
    }while (i>0)

    println("----------")

    var num = 1
    do{
        println("value: $num")
        num++
    }while (num<=5)
}