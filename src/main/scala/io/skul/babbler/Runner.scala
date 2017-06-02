package io.skul.babbler

object Runner extends Template with App{

  val list: List[() => String] = List(nginxAccess1, nginxErr1)
  while (true) {
    println(of(list)())
    val s = int(100, 3000)
    Thread.sleep(s)
  }
}
