import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

class MyModel extends ChangeNotifier {
  int _counter = 0;

  int get counter => _counter;

  void increment() {
    _counter++;
    notifyListeners(); // Notify listeners that the data has changed
  }

  void decrement() {
    _counter--;
    notifyListeners(); // Notify listeners that the data has changed
  }
}

void main() {
  runApp(
    ChangeNotifierProvider(
      create: (context) => MyModel(),
      child: MyApp(),
    ),
  );
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(title: Text('Incriment and decrement')),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Text('Counter Value:'),
              Consumer<MyModel>(
                builder: (context, myModel, child) {
                  return Text('${myModel.counter}');
                },
              ),
              Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  TextButton(
                      onPressed: () {
                        Provider.of<MyModel>(context, listen: false)
                            .decrement();
                      },
                      child: Icon(Icons.remove)),
                  TextButton(
                      onPressed: () {
                        Provider.of<MyModel>(context, listen: false)
                            .increment();
                      },
                      child: Icon(Icons.add)),
                ],
              ),
            ],
          ),
        ),
      ),
    );
  }
}
