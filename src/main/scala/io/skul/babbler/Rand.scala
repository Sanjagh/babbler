package io.skul.babbler

trait Rand {
  val random = new java.util.Random()

  def int = random.nextInt()
  def int(bound: Int) = random.nextInt(bound)
  def int(b1: Int, b2: Int) = random.nextInt(b2 - b1) + b1

  def char: Char = ('a' + int('z' - 'a')).toChar
  def str(bound: Int): String = (0 to int(1, bound)).map(any => char).mkString
  def str(b1: Int, b2: Int): String = (0 to int(b1, b2)).map(any => char).mkString

  def name = str(3, 10)

  def month = int(1, 12)
  def day = int(1, 31)
  def year = int(1900, 2020)
  def hour = int(24)
  def min = int(60)

  def of[T](l: List[T]) = l(int(l.length))

  def date = s"$year/$month/$day"
  def time = s"$hour:$min:$min"
  def fullDate = s"$date $time"

  def logLevel = of(List("DEBUG", "TRACE", "INFO", "WARN", "ERROR"))

  def path = (0 to int(2, 10)).map(any => name).mkString("/")

  def ipPart = int(255)
  def ip = s"$ipPart.$ipPart.$ipPart.$ipPart"

  def statusCode = of(List(200, 201, 300, 301, 302, 303, 400, 401, 402, 403, 404, 500, 501, 502))

  def host = (0 to int(2, 5)).map(a => name).mkString(".")
}
