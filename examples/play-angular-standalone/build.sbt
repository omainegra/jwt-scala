name := """play-angular-standalone"""

version := "0.5.1"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

routesGenerator := InjectedRoutesGenerator

libraryDependencies ++= Seq(
  "com.pauldijou" %% "jwt-play" % "0.4.1"
)
