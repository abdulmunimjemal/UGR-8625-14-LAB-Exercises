// Exercise 1: Given a list of integers, write a function that returns the highest number in the list.
int findMax(List<int> numbers) {
  if (numbers.isEmpty) {
    return null;
  }
  int max = numbers[0];
  for (int i = 1; i < numbers.length; i++) {
    if (numbers[i] > max) {
      max = numbers[i];
    }
  }
  return max;
}

// Exercise 2: Write a function that takes a Map and prints all its keys and values.
void printMap(Map<dynamic, dynamic> map) {
  map.forEach((key, value) {
    print('$key: $value');
  });
}

// Exercise 3: Write a function that removes duplicates from a list.
List<T> removeDuplicates<T>(List<T> list) {
  Set<T> uniqueItems = list.toSet();
  return uniqueItems.toList();
}

void main() {
  // Example usage of the functions
  List<int> numbers = [5, 10, 15, 20, 15, 30, 10];
  print('Exercise 1: Max number in the list: ${findMax(numbers)}');

  Map<String, int> myMap = {'a': 1, 'b': 2, 'c': 3};
  print('Exercise 2: Printing keys and values of the map:');
  printMap(myMap);

  List<int> numbersWithDuplicates = [1, 2, 3, 2, 1, 4, 5];
  print('Exercise 3: List after removing duplicates: ${removeDuplicates(numbersWithDuplicates)}');
}
