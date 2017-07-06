name := "scalajs-lobibox"

description in ThisBuild := "Scala.js wrapper API for Lobibox library (http://lobianijs.com/site/lobibox)."

organization in ThisBuild := "com.greencatsoft"

version in ThisBuild := "0.1-SNAPSHOT"

homepage in ThisBuild := Some(url("http://github.com/greencatsoft/scalajs-lobibox"))

licenses in ThisBuild := Seq("Apache License 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.html"))

pomExtra in ThisBuild := (
  <scm>
    <url>git@github.com:greencatsoft/scalajs-lobibox.git</url>
    <connection>scm:git:git@github.com:greencatsoft/scalajs-lobibox.git</connection>
  </scm>
  <developers>
    <developer>
      <id>mysticfall</id>
      <name>Xavier Cho</name>
      <url>http://github.com/mysticfall</url>
    </developer>
  </developers>
)

resolvers in ThisBuild += Resolver.sonatypeRepo("snapshots")

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if(isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

publishMavenStyle := true

pomIncludeRepository := { _ => false }

val scalaSettings = Seq(
  scalaVersion := "2.11.11",
  crossScalaVersions := Seq("2.11.11", "2.12.1"),
  scalacOptions ++= Seq("-feature","-deprecation"),
  unmanagedSourceDirectories in Compile := (scalaSource in Compile).value :: Nil,
  unmanagedSourceDirectories in Test := (scalaSource in Test).value :: Nil)

lazy val lobibox = (project in file("."))
  .settings(scalaSettings)
  .enablePlugins(ScalaJSPlugin)
