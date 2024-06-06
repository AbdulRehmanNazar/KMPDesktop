import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kotlinxSerialization)

}

kotlin {
    jvm("desktop")

    sourceSets {
        val desktopMain by getting

        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material)
            implementation(compose.ui)
            implementation(compose.components.resources)
            implementation(compose.components.uiToolingPreview)


            implementation(libs.ktor.client.core)
            implementation(libs.ktor.client.cio)
            implementation(libs.ktor.serialization.kotlinx.json)
            implementation(libs.ktor.client.content.negotiation)


            implementation(libs.voyager.navigator)
            implementation(libs.voyager.transitions)

        }
        desktopMain.dependencies {
            implementation(compose.desktop.currentOs)
        }
    }


    task("testClasses")

}


compose.desktop {
    application {
        mainClass = "MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "com.ar.desktopapp"
            packageVersion = "1.0.0"

            macOS { iconFile.set(project.file("resources/avatar.icns")) }
            windows { iconFile.set(project.file("resources/avatar.ico")) }
//            linux {}
        }
    }
}
