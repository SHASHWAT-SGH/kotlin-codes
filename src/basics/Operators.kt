package basics

fun main() {
    var a = 10
    var b = 5

    val isTrue = true
    val isFalse = false

    println("$a + $b = ${a+b}")
    println("$a - $b = ${a-b}")
    println("$a * $b = ${a*b}")
    println("$a / $b = ${a/b}")
    println("$a % $b = ${a%b}")
    println()

    println("$a > $b = ${a>b}")
    println("$a < $b = ${a<b}")
    println("$a >= $b = ${a>=b}")
    println("$a <= $b = ${a<=b}")
    println("$a == $b = ${a==b}")
    println("$a != $b = ${a!=b}")
    println()

    print("before : a = $a and b = $b")
    a += 10;
    b += 5;
    println(", after : a = $a and b = $b ")
    print("before : a = $a and b = $b")
    a -= 10;
    b -= 5;
    println(", after : a = $a and b = $b")
    print("before : a = $a and b = $b")
    a *= 10;
    b *= 5;
    println(", after : a = $a and b = $b")
    print("before : a = $a and b = $b")
    a /= 10;
    b /= 5;
    println(", after :  = $a and b = $b")
    print("before : a = $a and b = $b")
    a %= 10;
    b %= 5;
    println(", after : a = $a and b = $b")
    println()

    a = 10
    b = 5
    println("+$a = ${+a}")
    println("-$a = ${-a}")
    println("++$a = ${++a}")
    println("--$a = ${--a}")
    println("!$isTrue = ${!isTrue}")
    println()

    println("$isTrue && $isFalse is ${isTrue && isFalse}")
    println("$isTrue || $isFalse is ${isTrue || isFalse}")
    println("!$isTrue is ${!isTrue}")
    println()


}