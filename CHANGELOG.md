# Intellij PDF Viewer Plugin Changelog

## 0.14.0
- Fix preview server auth token issue in Android Studio ([#47](https://github.com/FirstTimeInForever/intellij-pdf-viewer/issues/47))
- Update plugin dependencies

## 0.13.0
- Use off-screen rendering for the browser view by default (can be changed via registry value)
- Fix action toolbars creation exceptions
- Bump IJ platform version
- Bump TeXiFy dependency version

## 0.12.0
- Split single plugin project into multiple subprojects
- Web-view is now mostly rewritten in Kotlin
- Cleaned up plugin code
- Added structure view with support for navigation (only for documents with outline)
- Added new search UI (should solve [#16](https://github.com/FirstTimeInForever/intellij-pdf-viewer/issues/16))
- Search actions now use standard shortcuts (you can remap them in settings)
- Added view state persistence (do not lose zoom or page position on reloads) ([#14](https://github.com/FirstTimeInForever/intellij-pdf-viewer/issues/14) and [#30](https://github.com/FirstTimeInForever/intellij-pdf-viewer/issues/30))
- Added actions for navigating through history ([#23](https://github.com/FirstTimeInForever/intellij-pdf-viewer/issues/23))
- Added viewer actions list
- Added hard reload action
- Added mouse wheel bindings for zoom in/out ([#15](https://github.com/FirstTimeInForever/intellij-pdf-viewer/issues/15))
- Added settings combobox for selecting default sidebar view state ([#28](https://github.com/FirstTimeInForever/intellij-pdf-viewer/issues/28))

## 0.11.0
- [Added Add SyncTeX support](https://github.com/FirstTimeInForever/intellij-pdf-viewer/pull/24) by [
  Abby Berkers](https://github.com/slideclimb), [Thomas Schouten](https://github.com/PHPirates) and [@ZhengKeli](https://github.com/ZhengKeli)
- [Fixed document auto-reload on file change](https://github.com/FirstTimeInForever/intellij-pdf-viewer/pull/22) by [@ZhengKeli](https://github.com/ZhengKeli)
- Working on migrating `web-view` to KotlinJS ([notes](https://github.com/FirstTimeInForever/intellij-pdf-viewer/wiki/Moving-web-view-to-KotlinJS))

## 0.10.2
- Initial support for 2021.1 versions

## 0.10.1
- Fixed default keyboard shortcuts for Windows and Linux (related to #16)
- Fixed preview panel was not available while project indexing (#17)

## 0.10.0
- Updated deprecated platform code
- Updated project dependencies
- Dropped support for `2020.2` builds

## 0.9.1
- [Fixed page scale reset on document reload](https://github.com/FirstTimeInForever/intellij-pdf-viewer/issues/13) by [Adam Zambrzycki](https://github.com/Adikso)

## 0.9.0
- [Added "Invert Document Colors" action](https://github.com/FirstTimeInForever/intellij-pdf-viewer/issues/10)
- Updated project dependencies

## 0.8.1
- Fixed listeners issues

## 0.8.0
- Added plugin settings
- Added error reporter
- Added status bar widget for displaying current page number
- Removed sidebar view mode buttons
- Fixed possibly unavailable bookmarks view for large documents
- Fixed incorrect inheritance of IDE colors

## 0.7.0
- Added changelog
- Fix incorrect IDE theme colors inheritance

## 0.0.6+1
- Fix marketplace review
- Update web-view dependencies

## 0.0.6
- Added error notification on failed document load
- Added license
- Refactor UI panels
- Code refactoring
- Spread pages actions are now toggleable

## 0.0.5
- Added presentation mode
- Added `Toggle Fullscreen` action
- Now web-view colors are based on current IDE theme
- Enable previous/next page actions based on current page number

## 0.0.4
- Added `Show Document Info` action

## 0.0.3
- Save last viewed page

## 0.0.2
- Added plugin icon
- Added `Reload Document` action
