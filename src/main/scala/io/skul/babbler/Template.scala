package io.skul.babbler

trait Template extends Rand {

  def nginxErr1() = s"""$fullDate [$logLevel] $int#0: *5 open() "$path" failed (2: No such file or directory), client: 127.0.0.1, server: $name.$name, request: "GET $path HTTP/1.1", host: "$name.$name", referrer: "http://$name.$name/" """

  def nginxAccess1() = s"""$ip - - [$fullDate +0430] "GET $path HTTP/1.1" $statusCode $int "http://$host/" "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/$int.$int Safari/$int.$int" """

}
