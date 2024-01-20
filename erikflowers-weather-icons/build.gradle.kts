plugins {
    //kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.compose")
    id("com.vanniktech.maven.publish")
}

// setupModuleForComposeMultiplatform()

android {
    namespace = "compose.icons.erikflowersweathericons"
}

android {
    compileSdkVersion(33)
    defaultConfig {
        minSdk = 21
        targetSdk = 33

        //versionCode = 1
        //versionName = "1.0"
    }
}

publishing {
    repositories {
        maven {
            name = "local"
            url = uri("file://${project.gradle.gradleUserHomeDir.parent}/.m2/repository")
        }
    }
}