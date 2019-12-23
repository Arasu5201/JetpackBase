plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinAndroidExtensions)
    id(BuildPlugins.kotlinKapt)
}

android {
    compileSdkVersion(AndroidSdk.compile)
    defaultConfig {
        applicationId = "com.android.jetpackbase"
        minSdkVersion(AndroidSdk.min)
        targetSdkVersion(AndroidSdk.target)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"

        javaCompileOptions {
            annotationProcessorOptions {
                includeCompileClasspath = true
            }
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    dataBinding.isEnabled = true
    androidExtensions.isExperimental = true
}

dependencies {
    implementation(Libraries.kotlinStdLib)
    implementation(Libraries.appCompat)
    implementation(Libraries.ktxCore)
    implementation(Libraries.constraintLayout)
    implementation(Libraries.fragmentKtx)
    implementation(Libraries.lifecycleExtensions)
    implementation(Libraries.lifecycleLivedata)
    implementation(Libraries.lifecycleViewmodel)
    implementation(Libraries.navigationFragment)
    implementation(Libraries.navigationUiKtx)
    implementation(Libraries.recyclerView)
    implementation(Libraries.material)
    implementation(Libraries.coroutinesAndroid)
    implementation(Libraries.coroutinesCore)
    // database
    implementation(Libraries.room)
    kapt(Libraries.roomCompiler)
    implementation(Libraries.roomCoroutine)
    testImplementation(Libraries.roomTest)
    // network
    implementation(Libraries.retrofit)
    implementation(Libraries.retrofitConverter)
    implementation(Libraries.retrofitMoshiConverter)
    implementation(Libraries.retrofitAdapter)
    debugImplementation(Libraries.loggingInterceptor)
    //log
    implementation(Libraries.timber)
    //test
    testImplementation(TestLibraries.junit4)
    androidTestImplementation(TestLibraries.testRunner)
    androidTestImplementation(TestLibraries.espresso)
}
