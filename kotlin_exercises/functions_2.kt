// Exercise: Functions

/**
 * Write three separate functions:
 * findMax: This function takes a list of integers as input and returns the maximum value in the list.
 * filterEvenNumbers: This function takes a list of integers as input and returns a new list containing only the even numbers from the original list.
 * calculateAverage: This function takes a list of doubles as input and returns the average value of the elements in the list.
 */

fun findMax(numbers: List<Int>): Int? {
    return numbers.maxOrNull()
}

fun filterEvenNumbers(numbers: List<Int>): List<Int> {
    return numbers.filter { it % 2 == 0 }
}

fun calculateAverage(numbers: List<Double>): Double {
    if (numbers.isEmpty()) return 0.0
    return numbers.sum() / numbers.size
}


fun main() {
    // EXAMPLE
    val integers = listOf(3, 5, 10, 15, 20, 25)
    val doubles = listOf(3.0, 5.5, 10.0, 15.5, 20.0, 25.5)

    // Find max in integers
    val max = findMax(integers)
    println("The maximum value is: $max")

    // Filter even numbers
    val evenNumbers = filterEvenNumbers(integers)
    println("Even numbers are: $evenNumbers")

    // Calculate average of doubles
    val average = calculateAverage(doubles)
    println("The average value is: $average")
}

