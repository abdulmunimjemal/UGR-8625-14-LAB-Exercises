// Exercise 1: Write a function that takes a list of numbers and returns the average
double calculateAverage(List<double> numbers) {
  if (numbers.isEmpty) {
    return 0.0;
  }
  double sum = 0;
  for (var num in numbers) {
    sum += num;
  }
  return sum / numbers.length;
}

// Exercise 2: Write a function that takes a list of numbers and returns the average
double calculateAverageV2(List<double> numbers) {
  if (numbers.isEmpty) {
    return 0.0;
  }
  double sum = numbers.reduce((value, element) => value + element);
  return sum / numbers.length;
}

void main() {
  // Example usage of the functions
  List<double> numbers1 = [5, 10, 15, 20, 25];
  print('Average 1: ${calculateAverage(numbers1)}');

  List<double> numbers2 = [10, 20, 30, 40, 50];
  print('Average 2: ${calculateAverageV2(numbers2)}');
}
