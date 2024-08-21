package basics

fun main() {
    val matrix = arrayOf(arrayOf(1, 2, 3),arrayOf(4, 5, 6), arrayOf(7, 8, 9))
    for (arr in matrix) {
        for(num in arr){
            print(num)
        }
        println()
    }

    println("row 1 column 2 : ${matrix[0][1]} ")
}