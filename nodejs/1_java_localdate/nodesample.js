var System = Java.type('java.lang.System');
var LocalDate = Java.type('java.time.LocalDateTime');
var DateTimeFormatter = Java.type('java.time.format.DateTimeFormatter');
var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
var http = require('http');

var server = http.createServer(function (req, res) {
	res.write('Hello World!' + formatter.format(LocalDate.now()));
	res.end();
});
server.listen(8080);

