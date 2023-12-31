//openai api delete if cause bugs
buildscript {
    repositories{
        mavenCentral()
        maven{ url = uri("https://central.sonatype.com/namespace/com.aallam.openai") }
    }
}

//normal code set up for app
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.phamspect.headsupgame"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.phamspect.headsupgame"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    //buildFeatures added for viewBinding / viewModel
    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.gridlayout:gridlayout:1.0.0")
    
    //two below added for viewBinding / viewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    implementation("androidx.activity:activity-ktx:1.7.2")
    // AI dependencies for accessing open ai server
/*
    implementation("io.ktor:ktor-client-core:2.3.4")
    implementation("io.ktor:ktor-client-cio:2.3.4")
    implementation("io.ktor:ktor-client-json:2.3.4")
    implementation("io.ktor:ktor-client-serialization:2.3.4")
*/
    implementation("com.squareup.okhttp3:okhttp:4.10.0")

    // AI dependencies

    //implementation ("com.aallam.openai:openai-client:3.4.1")
    //implementation("io.ktor:ktor-client-android:2.3.4")

    // Tesseract OCR dependencies
    implementation("com.rmtheis:tess-two:9.1.0")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}