package basics

fun main() {
    val a = 10
    val b = 20
    val operator = '*'
    val result: Int

    if(operator == '+'){
        result = a+b
    }else if(operator == '-'){
        result = a-b
    }else if(operator == '*'){
        result = a*b
    }else if(operator == '/'){
        if(b==0){
            println("ZeroDivisionError")
            result = 0
        }else{
            result = a/b
        }
    }else if(operator == '%'){
        result = a%b
    }else{
        result = 0
    }

    println("$a $operator $b = $result")
}