name := "sbt-run-test-java8"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, BuildInfoPlugin).settings(
    buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion, "builtAt" -> {
      val dtf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
      dtf.setTimeZone(java.util.TimeZone.getTimeZone("UTC"))
      dtf.format(new java.util.Date())
    }
    ),
    buildInfoPackage := "buildinfo"
  ).settings(
        publishArtifact in (Compile, packageDoc) := false,
        publishArtifact in packageDoc := false,
        sources in (Compile,doc) := Seq.empty
  
)


scalaVersion := "2.11.7"
resolvers += "Maven" at "http://repo1.maven.org/maven2/"

libraryDependencies ++= Seq(
  	cache
)
