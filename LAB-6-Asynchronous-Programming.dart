// Exercise 2: Use async and await to wait for a Future to complete.
Future<void> fetchData() async {
  print('Fetching data...');
  await Future.delayed(Duration(seconds: 2));
  print('Data fetched!');
}

// Exercise 3: Use the Future.then method to handle the result of a Future.
Future<int> fetchNumber() {
  return Future.delayed(Duration(seconds: 1), () => 42);
}

void main() async {
  // Example usage of Exercise 2
  await fetchData();
  print('Data processing complete.');

  // Example usage of Exercise 3
  print('Fetching number...');
  fetchNumber().then((value) {
    print('Number fetched: $value');
  });
  print('Fetching number complete.');
}
