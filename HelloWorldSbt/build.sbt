name := "hello"

version := "1.0"

scalaVersion := "2.10.3"

lazy val helloTask = taskKey[Unit]("An example task")

helloTask := { println("Hello!") }