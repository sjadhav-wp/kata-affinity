ThisBuild / scalaVersion := "2.13.16"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.kata"

lazy val root = (project in file("."))
  .settings(
    name := "kata-affinity",
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.13",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.13" % Test,
    libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.16.0" % Test
  )
