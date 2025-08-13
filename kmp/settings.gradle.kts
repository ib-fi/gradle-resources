rootProject.name = "kmp-app"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
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
        mavenLocal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        mavenLocal()
    }
    versionCatalogs {
        fun create(name: String, target: String) {
            create(name) { from(files("resources/gradle/versions/$target.toml")) }
        }

        create("core", "build-plugins")
        create("crestfi", "crestfi-plugins")
        // app
        create("shared", "kmp-shared")
        create("libs", "kmp-app")
        // libs
        //create("libs", "kmp-shared")
    }
}

include(":composeApp")
