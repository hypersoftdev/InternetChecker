# Internet Checker
**InternetChecker** provides a simple and effective way to check for internet availability in an Android app. By integrating it into your project, you can easily verify if the device is connected to the internet from any part of your app.

# Key Features:
1. Easy Integration: Just add the library to your project and start using it immediately.
2. Global Availability: Use it anywhere in your project where internet status needs to be checked.
3. Real-time Check: Quickly detects whether the device is connected to the internet or not.


## Step-by-Step Usage:

### 1. Dependency Addition

To use the Internet Checker, follow these steps to update your Gradle files.

#### Gradle Integration

##### Step A: Add Maven Repository
In your **project-level** `build.gradle` or `settings.gradle` file, add the following repository:

```
repositories {
    google()
    mavenCentral()
    maven { url "https://jitpack.io" }
}
```

### Step B: Add Dependencies

Include the Internet Checker in your **app-level** `build.gradle` file. Replace `x.x.x` with the latest version:

```
implementation 'com.github.hypersoftdev:InternetChecker:x.x.x'
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


# Acknowledgements

This work would not have been possible without the invaluable contributions of [Kamran Khan](https://github.com/devangler). His expertise, dedication, and unwavering support have been instrumental in bringing this project to fruition.

![Profile](https://github.com/hypersoftdev/InternetChecker/blob/master/screens/profile_image.jpg?raw=true)

We are deeply grateful for [Kamran Khan](https://github.com/devangler) involvement and his belief in the importance of this work. His contributions have made a significant impact, and we are honored to have had the opportunity to collaborate with him.

# LICENSE

Copyright 2023 Hypersoft Inc

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.




