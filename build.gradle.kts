plugins {
    kotlin("jvm") version "2.1.0"
}

sourceSets {
    main {
        kotlin.srcDir("src")
    }
}

kotlin {
    compilerOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict", "-Werror")
    }
}

tasks {
    wrapper {
        gradleVersion = "8.11.1"
    }
}
