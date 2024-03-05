void main() {
  // Exercise 1: Switch case to print the corresponding day of the week
  int day = 4; // Change this to test different days
  switch (day) {
    case 1:
      print("Monday");
      break;
    case 2:
      print("Tuesday");
      break;
    case 3:
      print("Wednesday");
      break;
    case 4:
      print("Thursday");
      break;
    case 5:
      print("Friday");
      break;
    case 6:
      print("Saturday");
      break;
    case 7:
      print("Sunday");
      break;
    default:
      print("Invalid day");
  }

  // Exercise 2: Print the first 10 numbers in the Fibonacci sequence
  int n = 10;
  int prev = 0;
  int next = 1;
  print(prev);
  print(next);
  for (int i = 2; i < n; i++) {
    int sum = prev + next;
    prev = next;
    next = sum;
    print(sum);
  }
}
