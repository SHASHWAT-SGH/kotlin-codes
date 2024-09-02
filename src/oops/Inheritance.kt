package oops

import kotlin.math.sin

open class Rectangle(val a: Double, val b: Double){
    fun area(): Double{
        return a*b
    }

    open fun display(){
        println("area of rectangle with dimensions $a and $b is ${area()}")
    }
}

class Square(side: Double): Rectangle(side, side){
    override fun display(){
        println("are of square with side $a is ${area()}")
    }
}

fun main() {
    val rec = Rectangle(4.0, 5.0)
    rec.display()

    val sq = Square(4.0)
    sq.display()
}