# Internet Checker Library
This library provides a simple and effective way to check for internet availability in an Android app. By integrating it into your project, you can easily verify if the device is connected to the internet from any part of your app.

# Key Features:
1. Easy Integration: Just add the library to your project and start using it immediately.
2. Global Availability: Use it anywhere in your project where internet status needs to be checked.
3. Real-time Check: Quickly detects whether the device is connected to the internet or not.

# Contributing

We welcome feedback, and code contributions!❤️

# Step-by-Step Usage: 

Add Dependency to Your Project
First, you'll need to add the internet checker library as a dependency to your Android project. You can do this by adding it to the build.gradle file (assuming it's hosted on a repository like Maven or JitPack). If it's a local library, you would need to include the local .aar or .jar file.


## Gradle Integration

### Step A: Add Maven Repository

In your project-level **build.gradle** or **settings.gradle** file, add the JitPack repository:
```
repositories {
    google()
    mavenCentral()
    maven { url "https://jitpack.io" }
}
```  

### Step B: Add Dependencies

Next, include the library in your app-level **build.gradle** file. Replace x.x.x with the latest version [![](https://jitpack.io/v/hypersoftdev/TextCraft.svg)](https://jitpack.io/#hypersoftdev/TextCraft)
```
implementation 'com.github.hypersoftdev:InternetChecker:1.0.0'

```

## Implementation

### Kotlin Example:

```
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        testingInternet()
    }

    private fun testingInternet() {
        if (InternetChecker.isInternetAvailable(this)) {
            Toast.makeText(this, "Internet Available", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Internet Not Available", Toast.LENGTH_SHORT).show()
        }
    }
}
```



