plugins {
    kotlin("jvm") version "2.3.0"
    application
    id("org.openjfx.javafxplugin") version "0.1.0"
}

group = "io.coco"
version = "1.0.0"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(21)
}

javafx {
    version = "21.0.10"
    modules = listOf("javafx.controls", "javafx.fxml")
}

dependencies {
    // ui
    implementation("org.controlsfx:controlsfx:11.2.3")
    implementation("org.kordamp.ikonli:ikonli-core:12.4.0")

    // persistence
    implementation("org.jetbrains.exposed:exposed-core:1.0.0")
    runtimeOnly("org.jetbrains.exposed:exposed-jdbc:1.0.0")
    runtimeOnly("org.xerial:sqlite-jdbc:3.51.2.0")

    // logging
    implementation("org.slf4j:slf4j-api:2.0.17")
    runtimeOnly("ch.qos.logback:logback-classic:1.5.32")

    // test
    testImplementation("com.tngtech.archunit:archunit-junit5:1.4.1")
    testImplementation("org.junit.jupiter:junit-jupiter:5.13.4")
    testImplementation(kotlin("test"))
}

application {
    mainClass.set("io.coco.haroopyo.HaroopyoApplication")
}


tasks.test {
    useJUnitPlatform()
}