// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    id("org.jetbrains.kotlinx.kover") version "0.7.6"
    id("org.sonarqube") version "4.4.1.3373"
}

sonar {
    properties {
        property("sonar.projectKey", "adurandet_myapplication")
        property("sonar.organization", "adurandet")
        property("sonar.host.url", "https://sonarcloud.io")
        property("sonar.sourceEncoding", "UTF-8")
        property("sonar.java.coveragePlugin", "jacoco")
    }
}

subprojects {
    // exclude Arkose aar Module
    apply(plugin = "org.jetbrains.kotlinx.kover")
    sonar {
        properties {
            property("sonar.coverage.jacoco.xmlReportPaths", "${project.layout.buildDirectory}/reports/kover/reportDebug.xml")
        }
    }
}

project.tasks["sonar"].dependsOn "koverXmlReportDebug"