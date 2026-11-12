plugins {
    kotlin("jvm") version "2.4.10"
    id("java")
    id("com.gradleup.shadow") version "9.6.1"
}

group = "org.jaydy0102"
version = "1.0.0-SNAPSHOT"

repositories {
    maven("https://repo.dmulloy2.net/nexus/repository/public/")
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:26.3.build.+")
    compileOnly("net.dmulloy2:ProtocolLib:5.4.0")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(25))
}

tasks.test {
    useJUnitPlatform()
}