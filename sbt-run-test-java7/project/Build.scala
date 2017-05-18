import com.typesafe.config._
import play.Project._
import sbt.Keys._
import sbt._


object ApplicationBuild extends Build {


  val appName = "sbt-run-test-java7"
	val appVersion = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    javaCore
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
		resolvers += "Maven" at "http://repo1.maven.org/maven2/"
	
  )

}
