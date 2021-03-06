import android.Keys._

android.Plugin.androidBuild

name := "renderscript"

platformTarget in Android := "android-17"

// need to target different versions on 23.+
buildToolsVersion in Android := Some("25.0.2")

showSdkProgress in Android := false

javacOptions ++= List("-source", "1.7", "-target", "1.7")
