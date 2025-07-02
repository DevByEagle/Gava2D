plugins {
    `java-library`
}

group = "com.devbyeagle.gava"
version = "1.0.0-SNAPSHOT"

java {
    withSourcesJar()
    withJavadocJar()
}

repositories {
    mavenCentral()
}

tasks.withType<Javadoc>().configureEach {
    options.encoding = "UTF-8"
    (options as StandardJavadocDocletOptions).apply {
        addStringOption("Xdoclint:none,-missing", "-quiet")
    }
}

tasks.jar {
    manifest {
        attributes(
            "Implementation-Title" to "Gava2D",
            "Implementation-Version" to project.version
        )
    }
}
