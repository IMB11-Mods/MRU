# Changelog

## [1.0.40]

- Downgraded Java requirement to 17 to account for 1.20.1 still recieving builds.

## 1.0.39

### Added
- Port to 26.3-pre-2.
- Backport of `BlockItemId`
- Fixed `Identifier#parse` helper method being private.
- Port of 1.20.6+ common tags to be able to safely use them in multiloader.
- Added a helper interface, `Identifiable`, implemented on various classes that have an associated `Identifier` but do not have an obvious way to access it.

## 1.0.30

### Added
- Greatly expanded the mod's scope to include common registration hooks, APIs for querying the player's inventory, bundles, backpacks, and accessory APIs, and multiversioned helper methods for maintaining mods from 1.20 through 26.2. These APIs will be further expanded in future updates as more and more of Cassian's mods begin to rely on MRU.

### Removed
- Ko-Fi Donation API as IMB11 is no longer actively modding.