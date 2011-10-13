scalaVersion := "2.9.1"

libraryDependencies ++= Seq (
  "net.databinder" %% "lift-json" % "2.3",
  "net.databinder" %% "unfiltered-filter" % "$unfiltered_version$",
  "net.databinder" %% "unfiltered-jetty" % "$unfiltered_version$",
  "net.databinder" %% "unfiltered-json" % "$unfiltered_version$",
  "net.databinder" %% "unfiltered-spec" % "$unfiltered_version$" % "test"
  "org.scala-tools.testing" %% "specs" %"1.6.9" % "test"
)
