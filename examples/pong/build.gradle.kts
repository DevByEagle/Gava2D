plugins {
    java
    application
}

dependencies {
    implementation(project(":"))
}

application {
    mainClass.set("com.devbyeagle.pong.PongGame")
}