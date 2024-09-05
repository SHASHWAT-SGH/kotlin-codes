package realLifeProblems

fun main() {
    println("Enter total purchase amount: ")
    val totalPurchase = readlnOrNull()?.toIntOrNull()
    println("Having membership? ")
    val hasMembership = readln().toBoolean()

    if(totalPurchase != null &&  totalPurchase >= 1000){
        if(hasMembership){
            println("You got 20% discount! Amount to pay : ${0.8 * totalPurchase}")
        }else{
            println("You got 10% discount! Amount to pay : ${0.9 * totalPurchase}")
        }
    }else{
        println("No discount !!! Amount to pay : $totalPurchase")
    }
}