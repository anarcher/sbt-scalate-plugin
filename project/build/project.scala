import sbt._

class ScalatePluginProject(info: ProjectInfo) extends PluginProject(info) {
  val cli = "net.stbbs.yasushi" % "scalate-cli_2.8.0" % "1.0"

}
