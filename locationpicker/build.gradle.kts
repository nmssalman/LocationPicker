plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.nmssalman.locationpicker"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation("com.google.android.material:material:1.11.0-alpha02")
    implementation("androidx.fragment:fragment-ktx:1.6.1")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-guava:1.6.4")

    val playServicesVersion = "18.1.0"
    implementation ("com.google.android.gms:play-services-maps:$playServicesVersion") {
        exclude("com.android.support")
    }
    implementation ("com.google.android.gms:play-services-location:21.0.1") {
        exclude ( "com.android.support")
    }

    implementation ("com.google.android.libraries.places:places:3.2.0") {
        exclude("com.android.support")
    }

    implementation("com.google.maps:google-maps-services:0.2.9")

    val espressoVersion = "3.5.1"
//    androidTestImplementation "androidx.test.espresso:espresso-core:$espressoVersion"
//    androidTestImplementation "androidx.test.espresso:espresso-intents:$espressoVersion"

//    def supportTestVersion = '1.4.0'
//    androidTestImplementation "androidx.test:runner:$supportTestVersion"
//    androidTestImplementation "androidx.test:rules:$supportTestVersion"
//    androidTestImplementation 'androidx.test.uiautomator:uiautomator:2.2.0'
//    androidTestImplementation 'org.mockito:mockito-core:5.4.0'
}