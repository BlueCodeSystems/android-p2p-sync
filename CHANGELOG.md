# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [0.4.0] - 2025-08-29

### Added
- Android SDK 34 support with modern build system
- AndroidX dependencies migration
- Minimum SDK version raised to 21 for AndroidX compatibility

### Fixed
- Added required `android:exported` attribute to sample app MainActivity
- Updated application name reference in AndroidManifest.xml to use fully qualified class name
- Completed AndroidX import migration across all sample app Java files

### Changed
- **BREAKING**: Migrated from Android Support Library to AndroidX
- **BREAKING**: Minimum SDK version increased from previous version to 21
- Updated build system for modern Android development
- Refactored imports across sample application

### Migration Notes
- Projects using this library will need to migrate to AndroidX if not already done
- Minimum Android API level is now 21 (Android 5.0)

## [0.4.1] - 2025-08-29

### Changed
- Gradle signing: enable `useGpgCmd()` and sign on `publish` and `publishToMavenLocal` for release builds
- Documentation: add Maven Central publishing instructions in README

### Removed
- Legacy root `build.gradle` file no longer used by the current build setup

### Notes
- No functional library code changes; this is a build/doc maintenance release

## [0.4.2] - 2025-08-31

### Fixed
- Enforce positional placeholders in all multi-argument Android string resources to prevent locale reordering issues.
- Correct a malformed placeholder in French resources ("1%s" -> "%1$s").

### Notes
- Backward compatible; no API or behavior changes.

## [0.4.3] - 2025-08-31

### Fixed
- AAPT2 verifyReleaseResources failure caused by an unresolved placeholder in a transitive SQLCipher resource.
- Build stability by limiting packaged locales to English in the library to avoid merging problematic localized resources.

### Dependencies
- Bump SQLCipher to `net.zetetic:android-database-sqlcipher:4.5.4`.
- Bump Saferoom to `com.commonsware.cwac:saferoom.x:1.3.0` and exclude transitive old SQLCipher.

### Removed
- Temporarily remove French locale resources from the library module while strings are corrected. This has no API impact; localized strings can be reintroduced in a future release once verified.
