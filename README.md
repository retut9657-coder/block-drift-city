# Block Drift City

A solo Minecraft Fabric mod prototype built around a block-city survival loop with drift-heavy vehicle progression.

## Host and companion
- Host: Minecraft Java Edition
- Companion integration: none in this prototype
- Mode: Solo sandbox

## Core fantasy
The player starts in a block city, gathers resources, builds a garage, crafts upgrades, unlocks cars, drifts through city and desert tracks, fights hostile mobs, and expands their territory.

## Project structure
- `src/main/java/com/blockdriftcity` — mod logic and registries
- `src/main/resources/data/blockdriftcity` — game data files
- `src/main/resources/assets/blockdriftcity` — assets and localization

## Development target
This is a Fabric mod scaffold for a playable prototype. It is designed for an early development loop and a clean data-driven design.

## Build
From the project root:

```bash
gradle build
```

## Melty package
- Title: Block Drift City
- Tagline: Build, drift, survive
- Game: Minecraft Java Edition 1.20.1
- Loader: Fabric
- Release state: prototype mod

## Publish notes
This prototype runs as a Minecraft Fabric mod. It does not integrate with or require Drift Legends 2.

## Upload package
The project root includes:
- `melty.json` — metadata for the draft listing
- `publish-ready.txt` — short release summary
- `build/libs/block-drift-city-0.1.1.jar` — the compiled mod jar

## Notes
The release recipe installs the mod into the Minecraft instance's `mods` folder and requires Fabric.
