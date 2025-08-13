rootProject.name = "ImFine"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

includeBuild("../gradle-resources")
includeBuild("../kmp-shared")

pluginManagement {
    includeBuild("../gradle-plugins")
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
//        mavenLocal()
    }
}

plugins {
    id("convention.dependencyResolutionManagement")
}

dependencyResolutionManagement {
    repositories {
//        mavenLocal()
    }
}

include(":composeApp")
include(":androidApp")
