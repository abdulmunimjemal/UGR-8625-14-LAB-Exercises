// Exercise 1: Create a class Car with properties like brand, model, and year.
class Car {
  String brand;
  String model;
  int year;

  Car(this.brand, this.model, this.year);

  void printProperties() {
    print('Brand: $brand, Model: $model, Year: $year');
  }
}

// Exercise 2: Add a method to the Car class that prints “Vroom Vroom”.
class Car {
  String brand;
  String model;
  int year;

  Car(this.brand, this.model, this.year);

  void printProperties() {
    print('Brand: $brand, Model: $model, Year: $year');
  }

  void vroomVroom() {
    print('Vroom Vroom');
  }
}

// Exercise 3: Create a class ElectricCar that inherits from Car and has an additional property batteryLife.
class ElectricCar extends Car {
  int batteryLife;

  ElectricCar(String brand, String model, int year, this.batteryLife)
      : super(brand, model, year);
}

void main() {
  // Example usage of Exercise 1
  Car myCar = Car('Toyota', 'Corolla', 2022);
  myCar.printProperties();

  // Example usage of Exercise 2
  Car myCarWithSound = Car('Ford', 'Mustang', 2023);
  myCarWithSound.vroomVroom();

  // Example usage of Exercise 3
  ElectricCar myElectricCar = ElectricCar('Tesla', 'Model S', 2024, 500);
  myElectricCar.printProperties();
  print('Battery Life: ${myElectricCar.batteryLife} miles');
}
