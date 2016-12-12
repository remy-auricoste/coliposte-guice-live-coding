com.typesafe.sbt.SbtScalariform.scalariformSettings

name := "guice-live-coding"

organization := "fr.drysoft"

scalaVersion := "2.11.6"

scalacOptions ++= Seq("-deprecation", "-feature")

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

resolvers ++= Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)

//val SseGuice           = "com.tzavellas"             %   "sse-guice"             %     "0.7.1"
val MockitoCore        = "org.mockito"               %   "mockito-core"          %     "1.10.19"         %  "test"

libraryDependencies ++= Seq(
  ws
  , json
  , MockitoCore
  , specs2
)

play.sbt.PlayImport.PlayKeys.playDefaultPort := 9000

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v", "-a")

lazy val root = (project in file(".")).enablePlugins(PlayScala)