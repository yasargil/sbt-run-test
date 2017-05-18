name := "sbt-run-test-java8"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava).settings(
   
)


scalaVersion := "2.11.7"
resolvers += "Maven" at "http://repo1.maven.org/maven2/"

libraryDependencies ++= Seq(
  	cache
)
