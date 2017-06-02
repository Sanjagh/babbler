scalaVersion := "2.11.8"
organization := "io.skul"
name := "babbler"
version := "0.0.1"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

enablePlugins(JavaAppPackaging)
