# Yiski Shared Data

Library that contains common shared data classes between Yiski4 module in Yiski bot and the Yiski4 Agent.

Mainly doing this to avoid duplicate code.

## Usage
### Without Version Catalog
```kts
repositories {
    maven("https://mvn.devos.one/snapshots")
}

dependencies {
    implementation("one.devos:yiski-shared-data")
}
```

### With Version Catalog
gradle/libs.versions.toml
```toml
[versions]
# Yiski Shared Data
yiski-shared-data = "0.1.0"

# Yiski Shared Data
yiski-shared-data = { module = "one.devos:yiski-shared-data", version.ref = "yiski-shared-data" }
```

build.gradle.kts
```kts
repositories {
    maven("https://mvn.devos.one/snapshots")
}

dependencies {
    implementation(libs.yiski.shared.data)
}
```

## License
Project is licensed under the [MIT license](LICENSE).
