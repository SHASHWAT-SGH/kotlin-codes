package oops

class PrimaryConstructor(var name: String, var age: Int) {

    constructor(x: String): this(){
        this.name = x
        this.age = 0
    }

    constructor(): this("rahul", 50)

    fun intro(){
        println("my name is $name and my age is $age")
    }
}

fun main() {
    val riya = PrimaryConstructor("Riya", 22)
    riya.intro()

    val obj = PrimaryConstructor()
    obj.intro()

    val heena = PrimaryConstructor("Heena")
    heena.intro()
}