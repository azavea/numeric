// project name
name := "Optimized Numeric Plugin"

//sbtPlugin := true

libraryDependencies <+= scalaVersion("org.scala-lang" % "scala-compiler" % _)

resolvers += "Scala-Tools Maven2 Snapshots Repository" at "http://scala-tools.org/repo-snapshots"

// shrug?
version := "0.1"

// hide backup files
defaultExcludes ~= (filter => filter || "*~")

scalacOptions += "-optimise"

// any of these work, although 2.9.1 performs the best
//scalaVersion := "2.8.1
//scalaVersion := "2.9.0-1"
scalaVersion := "2.9.2"

//crossScalaVersions := List("2.8.1", "2.9.0-1", "2.9.1")
