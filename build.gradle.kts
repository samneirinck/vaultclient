import org.jetbrains.compose.compose

group = "com.samneirinck"
version = "0.1"

plugins {
    kotlin("jvm") version "1.6.10"
    id("org.jetbrains.compose") version "1.0.1"
}

kotlin {
    jvmToolchain {
        (this as JavaToolchainSpec).languageVersion.set(JavaLanguageVersion.of(17))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(compose.desktop.currentOs)

    testImplementation("io.kotest:kotest-runner-junit5:5.0.3")
}

compose.desktop {
    application {
        mainClass = "MainKt"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}