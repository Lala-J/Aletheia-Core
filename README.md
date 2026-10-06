# Aletheia Core

The core mod for the Aletheia modpack (Minecraft 1.21.1, NeoForge). It handles what KubeJS and datapacks cannot: world shape, factions and the lock, the Hunt, the radar network, gates and capstones. The design lives in the pack repository's `docs/`, in particular `07-core-mod.md`.

- Mod ID: `aletheia`
- Package: `com.vycraft.aletheia`
- Java 21, NeoForge 21.1.256 (kept in step with `pack/pack.toml` in the pack repository), built with ModDevGradle from NeoForge's official 1.21.1 MDK.

## Build

```sh
./gradlew build        # Windows: gradlew.bat build
```

The jar lands in `build/libs/aletheia-<version>.jar`.

## Run in development

```sh
./gradlew runClient
./gradlew runServer
./gradlew runGameTestServer   # runs the automated in-game tests, then exits
```

## Licence

MIT, see `LICENSE`. This covers only the code and assets in this repository; every mod the pack uses keeps its own licence.
