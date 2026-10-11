# Block Drift City

A solo Minecraft mashup built around a block-city survival loop with drift-heavy vehicle progression.

## Host and companion
- Host: Minecraft Java Edition
- Companion: Drift Legends 2
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

## Melty-ready summary
- Title: Block Drift City
- Tagline: Build, drift, survive
- Format: solo Minecraft mashup
- Host: Minecraft Java Edition
- Companion: Drift Legends 2
- Release state: prototype build ready for Melty listing and packaging

## Publish notes
This project is shaped as a real mashup rather than a fake inspiration project: Minecraft is the primary game and Drift Legends 2 is the real companion. The mod package is built around the Minecraft host and keeps the companion relationship explicit for Melty validation.

## Upload package
The project root includes:
- `melty.json` — metadata for the draft listing
- `publish-ready.txt` — short release summary
- `build/libs/block-drift-city-0.1.0.jar` — the compiled mod jar

## Notes
This project deliberately keeps the host and companion relationship explicit: Minecraft remains the real primary game, while Drift Legends 2 contributes the transport feel, drifts, and car-driven fantasy without shipping copied companion assets.
