package net.stbbs.yasushi

import sbt._
import FileUtilities._

trait ScalatePlugin extends DefaultWebProject {

  def templateRoots: PathFinder = mainResources
  def generatedDirectory = outputRootPath / "gen"
  override def mainSourceRoots = super.mainSourceRoots +++ (generatedDirectory##)

  override def compileAction = super.compileAction dependsOn(precompile)

  lazy val precompile = precompileAction
  def precompileAction = task {createDirectory(generatedDirectory, log)} && runTask(Some("net.stbbs.yasushi.ScalatePrecompiler"), info.pluginsManagedDependencyPath ** "*.jar", Seq(generatedDirectory.absolutePath) ++ templateRoots.getPaths)

}
