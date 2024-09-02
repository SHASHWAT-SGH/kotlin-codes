package oops

class Person {
    var name: String
    var age: Int

    constructor(name: String, age: Int){
        this.name = name
        this.age = age
    }

    constructor(name: String){
        this.name = name
        this.age = 0
    }

    constructor(){
        this.name = "Rahul"
        this.age = 32
    }

    fun intro(){
        println("My name is $name and my age is $age")
    }
}

fun main() {
    val riya = Person("Riya", 22)
    riya.intro()

    val obj = Person()
    obj.intro()

    val heena = Person("Heena")
    heena.intro()
}
