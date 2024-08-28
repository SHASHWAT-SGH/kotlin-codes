package conditionalStatements

fun main() {
    val dayOfWeek = 3
    val dayName = when(dayOfWeek){
        1 -> "Monday"
        2-> "Tuesday"
        3-> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6-> "Saturday"
        else -> "Invalid day"
    }
    println("Day of the week: $dayOfWeek")
}