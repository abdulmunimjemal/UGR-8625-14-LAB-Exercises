// Exercise: Conditionals

/**
 * Create a program that takes a numeric grade (between 0 and 100) as input. Use a series of conditional statements (if-else or when) to assign a letter grade based on the following scale:
    90-100: A
    80-89: B
    70-79: C
    60-69: D
    Below 60: F
    Print the letter grade corresponding to the user's input.
 */

 fun main() {
    println("Enter a numeric grade (0-100):")
    val grade = readLine()?.toIntOrNull() ?: -1  
    
    if (grade !in 0..100) {
        println("Invalid grade. Please enter a value between 0 and 100.")
    } else {
        val letterGrade = when (grade) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            in 60..69 -> "D"
            else -> "F"
        }
        println("The letter grade for a score of $grade is $letterGrade.")
    }
}
