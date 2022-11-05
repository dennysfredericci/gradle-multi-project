plugins {
    java
    id("org.springframework.boot") version "2.6.4"
}

repositories{
    mavenCentral()
}

dependencies {
    implementation(project(":lib"))
    implementation("org.springframework.boot:spring-boot-starter-web:2.6.4")
}