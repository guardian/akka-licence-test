lazy val root = project
  .in(file("."))
  .settings(
    name := "akka-licence-test",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "3.3.0",
    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "0.7.29" % Test,
      "com.typesafe.akka" %% "akka-actor-typed" % "2.8.2"
    )
  )
