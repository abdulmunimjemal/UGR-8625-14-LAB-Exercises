// Exercise 1: Write a function that throws an exception and use a try-catch block to handle it.
void throwError() {
  throw Exception('An error occurred');
}

// Exercise 2: Use a try-catch block to catch a specific type of exception.
void divide(int a, int b) {
  try {
    if (b == 0) {
      throw Exception('Division by zero');
    }
    print('Result: ${a ~/ b}');
  } catch (e) {
    print('Exception caught: $e');
  }
}

// Exercise 3: Use a finally block to ensure that some code runs no matter what.
void writeFile() {
  try {
    // Simulating file writing
    print('Writing to file...');
    throw Exception('File write error');
  } catch (e) {
    print('Exception caught: $e');
  } finally {
    print('Closing file...');
  }
}

void main() {
  // Example usage of Exercise 1
  try {
    throwError();
  } catch (e) {
    print('Error caught: $e');
  }

  // Example usage of Exercise 2
  divide(10, 2); // Normal division
  divide(10, 0); // Division by zero

  // Example usage of Exercise 3
  writeFile();
}
