import sbt.Keys._
import io.gatling.sbt.GatlingPlugin

name := "selenium-scala"

version := "1.0"

scalaVersion := "2.11.1"

libraryDependencies += "org.seleniumhq.selenium" % "selenium-java" % "2.43.1" % "test"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"

libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.0.1" % "test"

libraryDependencies +=  "io.gatling" % "test-framework" % "1.0" % "test"