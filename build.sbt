name := "CustomSbtSettings"

version := "0.1"

scalaVersion := "2.12.8"

//Running a specific task {run one app }
val taskRunApp= taskKey[Unit]("Run App")
val flagApp = true

if (flagApp)
  fullRunTask(taskRunApp, Compile, "my.App1")
else
  fullRunTask(taskRunApp, Compile, "my.App2")

//Filter the test
testOptions in Test := Seq(Tests.Filter(s => s.endsWith("1")))

libraryDependencies += "com.typesafe" % "config" % "1.2.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"