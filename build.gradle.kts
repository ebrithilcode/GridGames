plugins {
    id("com.gradle.build-scan") version "2.1"
    // Apply the Kotlin JVM plugin to add support for Kotlin on the JVM.
    kotlin("jvm") version("1.3.41")

    // Apply the application plugin to add support for building a CLI application.
    application

    id("org.jetbrains.dokka") version "0.9.17"
}

tasks.dokka {
    outputFormat = "html"
    outputDirectory = "$buildDir/javadoc"
}

buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"

    publishAlways()
}
application {
    // Define the main class for the application
    mainClassName = "com.ebrithil.gridgames.GridGamesKt"
}

repositories {
    jcenter()
    //alternatively use maven:
    //mavenCentral()
}

dependencies {
    // Use the Kotlin JDK 8 standard library.
    implementation(kotlin("stdlib-jdk8"))

    // Use the Kotlin test library.
    testImplementation(kotlin("test"))

    // Use the Kotlin JUnit integration.
    testImplementation(kotlin("test-junit"))
}
