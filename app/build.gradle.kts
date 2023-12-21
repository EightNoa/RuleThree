plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.eightnoa.rulethree"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.eightnoa.rulethree"
        minSdk = 25
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}


dependencies {

    //Core
    implementation(libs.core.ktx)
    implementation(libs.lifecycle.runtime.ktx)
    //Compose
    implementation(libs.activity.compose)
    implementation(platform("androidx.compose:compose-bom:2023.08.00"))
    //noinspection UseTomlInstead
    implementation("androidx.compose.ui:ui")
    //noinspection UseTomlInstead
    implementation("androidx.compose.ui:ui-graphics")
    //noinspection UseTomlInstead
    implementation("androidx.compose.ui:ui-tooling-preview")
    //noinspection UseTomlInstead
    implementation("androidx.compose.material3:material3")
    implementation(libs.appcompat)
    //Icons
    implementation(libs.material.icons.extended)
    //Dagger Hilt
    implementation(libs.hilt.core)

    testImplementation(libs.junit)
    testImplementation(libs.mockk)

    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    //Compose
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.08.00"))
    //noinspection UseTomlInstead
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")


    //noinspection UseTomlInstead
    debugImplementation("androidx.compose.ui:ui-tooling")
    //noinspection UseTomlInstead
    debugImplementation("androidx.compose.ui:ui-test-manifest")


    ksp(libs.room.compiler)
    ksp(libs.hilt.compile)

}