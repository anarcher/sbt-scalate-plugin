import sbt._

class Tests(info: ProjectInfo) extends DefaultWebProject(info) with net.stbbs.yasushi.ScalatePlugin {

  val scalate = "org.fusesource.scalate" % "scalate-core" % "1.2"
  val servlet = "javax.servlet" % "servlet-api" % "2.5" % "provided"
  val slf4j = "org.slf4j" % "slf4j-jdk14" % "1.6.1"

}
