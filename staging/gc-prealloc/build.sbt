scalaVersion := "2.13.4"

// Set to false or remove if you want to show stubs as linking errors
nativeLinkStubs := true

enablePlugins(ScalaNativePlugin)

resolvers in Global += "Local Maven Repository" at "file://" + Path.userHome + "/.m2/repository"

import scala.scalanative.build._

//envVars in ThisBuild := Map("GC_INITIAL_HEAP_SIZE" -> sys.env.getOrElse("GC_INITIAL_HEAP_SIZE", "1500M"))

nativeConfig ~= {
  _.withLTO(LTO.thin)
    .withMode(Mode.releaseFast)  // change to releaseFull to get optimized binary in target
    .withGC(GC.none)
}
