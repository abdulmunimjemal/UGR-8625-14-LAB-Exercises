// Exercise: Loops - 2

/**
 * Design a program that generates a random password of a specific length (e.g., 8 characters). 
 * Use a loop to iterate and generate random characters (including uppercase and lowercase letters, numbers, and special symbols) 
 * and append them to a string to build the password. 
 * Finally, print the generated password.
 */

import kotlin.random.Random

fun generateRandomPassword(length: Int): String {
    // Define the characters that can be used in the password
    val charPool = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+"
    var password = ""

    // Loop to construct the password by randomly selecting characters from charPool
    for (i in 1..length) {
        val randomIndex = Random.nextInt(charPool.length)
        password += charPool[randomIndex]
    }

    return password
}

fun main() {
    println("Enter the desired password length:")
    val length = readLine()?.toIntOrNull() ?: 8  // Use 8 as the default length if input is invalid

    val randomPassword = generateRandomPassword(length)
    println("Generated Password: $randomPassword")
}
