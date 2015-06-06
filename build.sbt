name := "actor-sample-scenario"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.9",
  "org.mariusz89016" % "distr_stacktrace_2.11" % "1.0_SNAPSHOT" % Runtime,
  "org.mariusz89016" % "distr_stacktrace_2.11" % "1.0_SNAPSHOT"
)

javaOptions += "-javaagent:" + System.getProperty("user.home") + "/.ivy2/cache/org.aspectj/aspectjweaver/jars/aspectjweaver-1.7.2.jar"

fork := true