// Exercise: Loops

/**
 * Create a program that takes a string as input. 
 * Use a loop to iterate through each character in the string. 
 * Find the minimum and maximum characters (based on their ASCII values) and print them.
 */

 fun main() {
    println("Enter a string:")

    val input = readLine() ?: ""  // Read the input from the user

    if (input.isEmpty()) {
        println("No input provided!")
        return
    }
    var minChar = input[0]
    var maxChar = input[0]

    // find min/max
    for (char in input) {
        if (char < minChar) {
            minChar = char
        }
        if (char > maxChar) {
            maxChar = char
        }
    }
    // results
    println("The minimum ASCII character in the string is: '$minChar'")
    println("The maximum ASCII character in the string is: '$maxChar'")
}
