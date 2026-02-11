<!-- Keep a Changelog guide -> https://keepachangelog.com -->

# RON Extended Support Changelog

## [Unreleased]

## [0.3.6] - 2026-02-11

- Update to current RR Versions (Platform 252) by @actioninja in https://github.com/AmonDeShir/rustrover-ron-remix/pull/3
- Fix ClassNotFoundException in RustReferenceContributor  by @AmonDeShir in https://github.com/AmonDeShir/rustrover-ron-remix/pull/4
- @actioninja made their first contribution in https://github.com/AmonDeShir/rustrover-ron-remix/pull/3

## [0.3.3]

### Changed

- Updated supported intellij platform to `2024.1`

## [0.3.2]

### Changed

- Updated supported intellij platform to `2023.3`

## [0.3.1] - 2023-07-31

### Added

- Resolve references to rust types and fields. Note that this can only be done probabilistic, because serde's Serialize and Deserialize traits can be implemented with arbitrary code.

### Fixed

- Make parser more resilient on incomplete files

### Changed

- Updated supported intellij platform to `2023.2`

### Internal

- Start testing much of the functionality

## [0.2.11]

### Fixed

- Updated plugin to support new versions of IDE.

## [0.2.10]

### Fixed

- Updated plugin to support new versions of IDE.

## [0.2.9]

### Fixed

- Updated plugin to support new versions of IDE.

## [0.2.8]

### Fixed

- Updated plugin to support new versions of IDE.

## [0.2.7]

### Fixed

- Fixed char literal parsing. Now we support simple char literals.

## [0.2.6]

### Fixed

- Updated plugin to support new versions of IDE

## [0.2.5]

### Fixed

- Fixed incorrect parsing of binary and octal literals (an incorrect literals where considered fine 
so user experience where bad when serde refused to parse a file)

## [0.2.4] 2021-07-30

### Fixed

- Updated plugin to support new versions of IDE

## [0.2.3] 2021-04-07

### Fixed

- Updated plugin to support new versions of IDE
- Got rid of deprecated API usage

## [0.2.2] 2021-03-13

### Fixed

- Fixed incompatibility with old versions of IDEs

## [0.2.1] 2021-03-12

### Added

- New settings panel for code style
- Code formatting
- Error checkers for dictionaries and objects (key uniquenes and more)

### Fixed

- Added an ability to use enums as keys in dictionaries
- Fixed an issue with identifiers containing numeric literals not being parsed as it intended

## [0.1.7] 2021-01-22

### Fixed

- Got rid of compatibility problems

## [0.1.6] 2021-01-22

### Fixed

- Color highlighting options are now annotates demo text as expected

## [0.1.5] 2021-01-21

### Fixed

- Changed plugin name to successfully ship in the market

## [0.1.4] 2021-01-20

### Added

- Initial scaffold created from [IntelliJ Platform Plugin Template](https://github.com/JetBrains/intellij-platform-plugin-template)
- Plugin MVP implemented

[Unreleased]: https://github.com/AmonDeShir/rustrover-ron-remix//compare/v0.3.6...HEAD
[0.3.6]: https://github.com/AmonDeShir/rustrover-ron-remix//compare/v0.3.3...v0.3.6
[0.3.3]: https://github.com/AmonDeShir/rustrover-ron-remix//compare/v0.3.2...v0.3.3
[0.3.2]: https://github.com/AmonDeShir/rustrover-ron-remix//compare/v0.3.1...v0.3.2
[0.3.1]: https://github.com/AmonDeShir/rustrover-ron-remix//compare/v0.2.11...v0.3.1
[0.2.11]: https://github.com/AmonDeShir/rustrover-ron-remix//compare/v0.2.10...v0.2.11
[0.2.10]: https://github.com/AmonDeShir/rustrover-ron-remix//compare/v0.2.9...v0.2.10
[0.2.9]: https://github.com/AmonDeShir/rustrover-ron-remix//compare/v0.2.8...v0.2.9
[0.2.8]: https://github.com/AmonDeShir/rustrover-ron-remix//compare/v0.2.7...v0.2.8
[0.2.7]: https://github.com/AmonDeShir/rustrover-ron-remix//compare/v0.2.6...v0.2.7
[0.2.6]: https://github.com/AmonDeShir/rustrover-ron-remix//compare/v0.2.5...v0.2.6
[0.2.5]: https://github.com/AmonDeShir/rustrover-ron-remix//compare/v0.2.4...v0.2.5
[0.2.4]: https://github.com/AmonDeShir/rustrover-ron-remix//compare/v0.2.3...v0.2.4
[0.2.3]: https://github.com/AmonDeShir/rustrover-ron-remix//compare/v0.2.2...v0.2.3
[0.2.2]: https://github.com/AmonDeShir/rustrover-ron-remix//compare/v0.2.1...v0.2.2
[0.2.1]: https://github.com/AmonDeShir/rustrover-ron-remix//compare/v0.1.7...v0.2.1
[0.1.7]: https://github.com/AmonDeShir/rustrover-ron-remix//compare/v0.1.6...v0.1.7
[0.1.6]: https://github.com/AmonDeShir/rustrover-ron-remix//compare/v0.1.5...v0.1.6
[0.1.5]: https://github.com/AmonDeShir/rustrover-ron-remix//compare/v0.1.4...v0.1.5
[0.1.4]: https://github.com/AmonDeShir/rustrover-ron-remix//commits/v0.1.4
