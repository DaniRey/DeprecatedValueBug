name := "DeprecatedValueBug"

version := "0.1"

scalaVersion := "2.10.7"

lazy val root = (project in file("."))
  .configs(IntegrationTest)
  .settings(
    Defaults.itSettings
  )