plugins {
    kotlin("jvm") version "1.9.10"
    application
}

repositories {
    mavenLocal()
    mavenCentral()
}

sourceSets.main {
    kotlin.srcDirs("src")
}

application {
    mainClass.set(
        // language=jvm-class-name
        "mochadoom.Engine"
    )
    //applicationDefaultJvmArgs = listOf("lotsofmonsters.wad")
}

tasks.named("run", JavaExec::class) {
    //args = listOf("-pwad", "easy.wad")
}
