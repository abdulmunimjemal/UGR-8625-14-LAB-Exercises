import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Demo navigation',
      home: ScreenOne(),
    );
  }
}

class ScreenOne extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Screen One'),
      ),
      body: Center(
        child: ElevatedButton(
          child: const Text('Next'),
          onPressed: () {
            final acceptedMessage = Navigator.push(
                context,
                MaterialPageRoute(builder: (context) => ScreenTwo(),
                )
            );
            print(acceptedMessage);
          },
        ),
      ),
    );
  }
}

class ScreenTwo extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    // final message = ModalRoute.of(context)!.settings.arguments as String;
    return Scaffold(
        appBar: AppBar(
          title: const Text('Screen Two'),
        ),
        body: Center(
            child: ElevatedButton(
              onPressed: () {
                Navigator.pop(context, 'HiToo');
              },
              child: Text('OK'),
            )
        )
    );
  }
}