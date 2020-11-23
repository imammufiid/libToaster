<h1 align="center">
    Toaster
</h1>

<p align="center">
    <a><img src="https://img.shields.io/badge/Version-0.2.1-brightgreen.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/ID-imufiid-blue.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/Java-Suport-green?logo=java&style=flat"></a>
    <a><img src="https://img.shields.io/badge/Koltin-Suport-green?logo=kotlin&style=flat"></a>
    <a href="https://github.com/imufiid"><img src="https://img.shields.io/github/followers/imufiid?label=follow&style=social"></a>
    <br>
</p>

---

## Example
|![](https://raw.githubusercontent.com/imufiid/libToaster/master/screenshoot/IMG_20201123_153624.jpg)|![](https://raw.githubusercontent.com/imufiid/libToaster/master/screenshoot/IMG_20201123_153613.jpg)|![](https://raw.githubusercontent.com/imufiid/libToaster/master/screenshoot/IMG_20201123_153556.jpg)|![](https://raw.githubusercontent.com/imufiid/libToaster/master/screenshoot/IMG_20201123_153546.jpg)|
|--|--|--|--|
|Success Toast|Info Toast|Warning Toast|Danger Toast|


---
## Download
Add maven `jitpack.io` and `dependencies` in `build.gradle (Project)` :
```gradle
// build.gradle project
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}

// build.gradle app/module
dependencies {
  ...
  implementation 'com.github.imufiid:libToaster:version'
}
```
---
## USE
> **MainActivity.kt**
```kotlin
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        ...

        Toaster.info(this, "Info", Toast.LENGTH_SHORT).show() // Toast Info
        Toaster.success(this, "Success", Toast.LENGTH_SHORT).show() // Toast Success
        Toaster.warning(this, "Warning", Toast.LENGTH_SHORT).show() // Toast Warning
        Toaster.danger(this, "Danger", Toast.LENGTH_SHORT).show() // Toast Danger
    }
}
```

---


### Version
- **0.0.1**
  - First Release
- **0.1.1**
  - update icon Toaster
- **0.2.1**
  - update position Toaster
---

### Contribution
You can sent your constibution to `branche` `open-pull`.

---

```
Copyright 2020 Imam Mufiid
```