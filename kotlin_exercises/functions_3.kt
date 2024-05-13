// Exercise: Functions

/**
 * Write a function that takes a list of strings and applies all uppercase transformation to each string using map.
 * Write a function that takes a list of integers and filters out only the numbers greater than a certain value (provided as a parameter) using filter.
 * Write a function that takes a list of numbers and calculates the sum of all elements using reduce.
 */

fun toUpperCase(strings: List<String>): List<String> {
    return strings.map { it.uppercase() }
}

fun filterGreaterThan(numbers: List<Int>, threshold: Int): List<Int> {
    return numbers.filter { it > threshold }
}

fun sumOfList(numbers: List<Int>): Int {
    return if (numbers.isNotEmpty()) numbers.reduce { sum, element -> sum + element }
    else 0
}

fun main() {
    // Test toUpperCase function
    val strings = listOf("hello", "world", "kotlin")
    println("Uppercase Strings: ${toUpperCase(strings)}")

    // Test filterGreaterThan function
    val integers = listOf(1, 2, 3, 4, 5, 6, 10, 20, 30)
    println("Filtered Numbers (greater than 5): ${filterGreaterThan(integers, 5)}")

    // Test sumOfList function
    println("Sum of the list: ${sumOfList(integers)}")
}
