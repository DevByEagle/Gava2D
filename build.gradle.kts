import org.gradle.external.javadoc.StandardJavadocDocletOptions

plugins {
    `java-library`
}

group = "org.gava"
version = "1.0.0"

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
    withSourcesJar()
    withJavadocJar()
}

repositories {
    mavenCentral()
}

tasks.withType<Jar> {
    manifest.attributes["Implementation-Title"] = "Gava2D"
    manifest.attributes["Implementation-Version"] = version
}

tasks.withType<Javadoc>().configureEach {
    (options as StandardJavadocDocletOptions).apply {
        addStringOption("Xdoclint:none", "-quiet") // Disable doclint warnings
    }
}