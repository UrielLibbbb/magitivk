plugins {
    kotlin("jvm") version "1.9.21"
    kotlin("plugin.serialization") version "1.9.21"
    application
}

group = "com.magitivk"
version = "1.0.0"

repositories {
    mavenCentral()
    google()
}

dependencies {
    // Kotlin Standard Library
    implementation(kotlin("stdlib"))
    
    // Serialization
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")
    
    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    
    // Logging
    implementation("org.slf4j:slf4j-api:2.0.9")
    implementation("ch.qos.logback:logback-classic:1.4.11")
    
    // Testing
    testImplementation(kotlin("test"))
    testImplementation("junit:junit:4.13.2")
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("com.magitivk.MainKt")
}

tasks.test {
    useJUnit()
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}
