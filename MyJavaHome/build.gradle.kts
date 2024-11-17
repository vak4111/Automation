plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.seleniumhq.selenium:selenium-java:4.21.0")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.10.2")
    testImplementation("org.seleniumhq.selenium:selenium-java:3.141.59")
    testImplementation("org.seleniumhq.selenium:selenium-chrome-driver:3.141.59")
}

tasks.test {
    useJUnitPlatform()
}