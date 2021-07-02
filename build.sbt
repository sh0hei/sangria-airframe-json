// About
name := "sangria-airframe-json"
version := "0.1"
description := "Sangria airframe-json marshalling"
organization := ""
homepage := Some(url("https://github.com/sh0hei/sangria-airframe-json"))
licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))
developers := List(Developer("sh0hei", "Shohei Shimomura", "", url("https://github.com/sh0hei")))
scmInfo := Some(
  ScmInfo(
    browseUrl = url("https://github.com/sh0hei/sangria-airframe-json.git"),
    connection = "scm:git:git@github.com:sh0hei/sangria-airframe-json.git"
  ))

// Build
ThisBuild / crossScalaVersions := Seq("2.12.14", "2.13.6")
ThisBuild / scalaVersion := crossScalaVersions.value.last
ThisBuild / githubWorkflowPublishTargetBranches := List()
ThisBuild / githubWorkflowBuildPreamble ++= List()
ThisBuild / githubWorkflowBuild := Seq(
  WorkflowStep.Use(UseRef.Public("codecov", "codecov-action", "v1"), name = Some("Codecov"))
)

// Compile options
scalacOptions ++= Seq("-deprecation", "-feature", "-target:jvm-1.8")
javacOptions ++= Seq("-source", "8", "-target", "8")

// Dependencies
libraryDependencies ++= Seq(
  "org.wvlet.airframe" %% "airframe-json" % "21.6.0",
  "org.wvlet.airframe" %% "airframe-codec" % "21.6.0",
  "org.sangria-graphql" %% "sangria-marshalling-api" % "1.0.6",
  "org.sangria-graphql" %% "sangria-marshalling-testkit" % "1.0.4" % Test,
  "org.scalatest" %% "scalatest" % "3.2.9" % Test
)

// Misc
ThisBuild / shellPrompt := { state =>
  scala.Console.MAGENTA + Project.extract(state).currentRef.project + " > " + scala.Console.RESET
}
