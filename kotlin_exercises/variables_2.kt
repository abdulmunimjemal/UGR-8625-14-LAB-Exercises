// Exercise: Variable 2

/**
 * Write a program that takes two numbers and an operation (addition, subtraction, multiplication,
 * division) as input using variables. Then, perform the chosen operation on the numbers and print
 * the result.
 */
fun main() {
    val number1: Double = 10.0
    val number2: Double = 5.0
    val operation: String = "addition"

    // Perform the operation
    val result =
            when (operation.lowercase()) {
                "addition" -> number1 + number2
                "subtraction" -> number1 - number2
                "multiplication" -> number1 * number2
                "division" -> if (number2 != 0.0) number1 / number2 else "Cannot divide by zero"
                else -> "Invalid operation"
            }

    // Print the result
    println("The result of $operation between $number1 and $number2 is: $result")
}
