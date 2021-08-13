// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    extra.apply {
        set("compose_version", "1.0.1")
    }

    repositories {
        google()
        maven(url = "https://plugins.gradle.org/m2/" )
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.0.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21")
    }
}
