// Exercise: Variable

/**
 * Declare variables to store a distance value and a unit (e.g., kilometers, miles). 
 * Write code that converts the distance value to another unit (choose the conversion) 
 * and print the converted value.
 */

fun main() {
    val distanceKilometers: Double = 100.0 
    val unit: String = "kilometers"
    val kilometersToMiles: Double = 0.621371
    val distanceMiles: Double = distanceKilometers * kilometersToMiles
    println("$distanceKilometers $unit is equivalent to $distanceMiles miles.")
}
