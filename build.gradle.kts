// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    id("org.sonarqube") version "4.4.1.3373"
}

sonar {
    properties {
        property("sonar.projectKey", "adurandet_myapplication")
        property("sonar.organization", "adurandet")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}