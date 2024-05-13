// Exercise: Conditionals

/**
 * Create a program that calculates a discount on a product. 
 * Declare variables for the original price, discount percentage (as a decimal between 0 and 1), 
 * and a variable to store the final price after discount. 
 * Use a conditional statement to check if the discount is greater than a certain threshold (e.g., 50%). 
 * If the discount is above the threshold, print a message stating that the discount is too high and set the discount to the threshold value. 
 * Otherwise, calculate the final price with the discount and print the original price, discount percentage, and final price.
 */

fun main() {
    val originalPrice: Double = 150.0  
    var discountPercentage: Double = 0.55  
    val discountThreshold: Double = 0.50

    // discount threshold check
    if (discountPercentage > discountThreshold) {
        println("The discount percentage of ${discountPercentage * 100}% is too high. It has been capped at ${discountThreshold * 100}%.")
        discountPercentage = discountThreshold  
    }

    val finalPrice: Double = originalPrice * (1 - discountPercentage)

    println("Original Price: $$originalPrice")
    println("Discount Percentage: ${discountPercentage * 100}%")
    println("Final Price: $$finalPrice")
}

