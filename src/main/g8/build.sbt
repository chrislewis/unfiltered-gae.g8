scalaVersion := "2.8.1"

seq(appengineSettings: _*)

libraryDependencies ++= Seq (
  "net.liftweb" %% "lift-json" % "2.3",
  "net.databinder" %% "unfiltered-filter" % "$unfiltered_version$",
  "net.databinder" %% "unfiltered-jetty" % "$unfiltered_version$",
  "net.databinder" %% "unfiltered-json" % "$unfiltered_version$",
  "net.databinder" %% "unfiltered-spec" % "$unfiltered_version$" % "test",
  "org.scala-tools.testing" %% "specs" %"1.6.6" % "test"
)
