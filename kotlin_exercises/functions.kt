// Exercise: Functions

/**
 * Write a function that takes a string as input. 
 * The function should analyze the string and return the number of words, uppercase letters, and vowels present in the string.
 */

 fun analyzeText(input: String): Triple<Int, Int, Int> {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

    // Splitting the input text into words based on spaces
    val wordsCount = input.split(' ').filter { it.isNotEmpty() }.size
    var uppercaseCount = 0
    var vowelsCount = 0

    // Counting uppercase letters and vowels
    for (char in input) {
        if (char.isUpperCase()) {
            uppercaseCount++
        }
        if (char in vowels) {
            vowelsCount++
        }
    }

    return Triple(wordsCount, uppercaseCount, vowelsCount)
}

fun main() {
    val inputText = "Hello, this is an Example string with VARIOUS Characters."
    val (words, uppercaseLetters, vowels) = analyzeText(inputText)

    println("Words: $words")
    println("Uppercase Letters: $uppercaseLetters")
    println("Vowels: $vowels")
}
