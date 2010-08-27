import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val scalatePlugin = "net.stbbs.yasushi" % "sbt-scalate-plugin" % "1.0"
}
