import 'dart:async';
import 'dart:io';

Future<void> downloadFile(String url, String savePath) async {
  final httpClient = HttpClient();
  final request = await httpClient.getUrl(Uri.parse(url));
  final response = await request.close();
  final file = File(savePath);
  var receivedBytes = 0;
  final totalBytes = response.contentLength;

  response.listen(
    (List<int> data) {
      receivedBytes += data.length;
      if (totalBytes != null) {
        stdout.write(
            '\rDownloading ${(receivedBytes / totalBytes * 100).toStringAsFixed(2)}%');
      }
      file.writeAsBytesSync(data, mode: FileMode.append, flush: true);
    },
    onDone: () {
      httpClient.close();
      stdout.write('\rDownload complete\n');
    },
    onError: (error) {
      print('Error: $error');
    },
    cancelOnError: true,
  );
}

Future<void> main() async {
  final files = [
    {'url': 'https://example.com/file1.txt', 'savePath': 'file1.txt'},
    {'url': 'https://example.com/file2.txt', 'savePath': 'file2.txt'},
    {'url': 'https://example.com/file3.txt', 'savePath': 'file3.txt'},
  ];

  final futures = <Future>[];

  for (var file in files) {
    final future = downloadFile(file['url'], file['savePath']);
    futures.add(future);
  }

  try {
    await Future.wait(futures);
    print('All files downloaded successfully!');
  } catch (e) {
    print('Error downloading files: $e');
  }
}
