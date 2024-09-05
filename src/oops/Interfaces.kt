package oops

interface Shape{
    fun area(): Double
}

open class Rectangle1(val a:Double, val b: Double): Shape{
    override fun area(): Double {
        return a * b
    }

    open fun display(){
        println("Area of rectangle with dimensions $a and $b is ${area()}")
    }
}

class Square1(side: Double): Rectangle1(side, side){
    override fun display(){
        println("Area of square with side $a is ${area()}")
    }
}


fun main() {
    val myRectangle = Rectangle1(4.0, 5.0)
    myRectangle.display()
    val mySquare = Square1(3.0)
    mySquare.display()
    
}