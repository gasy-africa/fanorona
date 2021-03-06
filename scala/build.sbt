val scala3Version = "3.1.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "gasy-fanorona-scala",
    organization := "africa.gasy",
    description := "Gasy Fanorona",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.10" % Test
    )
  )
