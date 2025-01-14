val taboolibVersion: String by rootProject

plugins {
    id("io.izzel.taboolib")
}

taboolib {
    description {
        name(rootProject.name)
    }
    install(
        "common",
        "common-5",
        "expansion-javascript",
        "module-chat",
        "module-lang",
        "module-configuration",
    )
    options(
        "skip-minimize",
        "keep-kotlin-module",
        "skip-taboolib-relocate",
    )
    classifier = null
    version = taboolibVersion
}

repositories {
    mavenCentral()
    maven("https://repo.tabooproject.org/repository/releases")
}

dependencies {
    api("org.openjdk.nashorn:nashorn-core:15.4") // Dreeam - compileOnly -> api, For compatibility
    compileOnly("com.google.code.gson:gson:2.10.1")
    //compileOnly("com.electronwill.night-config:core:3.6.7")
}
tasks.tabooRelocateJar { onlyIf { false } }