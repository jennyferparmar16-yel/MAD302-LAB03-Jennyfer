# MAD302-LAB03-Jennyfer
Name: Jennyfer
Student ID: A00201240
Course: MAD302 – Android Development
Date: April 23, 2026
This Android app demonstrates permission handling, asynchronous operations using Kotlin Coroutines, and error handling. It requests camera permission, simulates an API call with delay, and displays results in the UI. It also handles permission denial and simulated network failure scenarios.

Overview
This Android application demonstrates key mobile development concepts including permission handling, asynchronous operations using Kotlin Coroutines, and error handling. The app simulates an API call and displays results in the user interface after requesting camera permission.

Features
* Requests Camera Permission at runtime
* Uses ActivityResultContracts for permission handling
* Simulates API call using Kotlin Coroutines (delay)
* Displays results in a TextView
* Handles:
    Permission denied scenario
    Simulated network failure using try-catch

Technologies Used
* Kotlin
* Android SDK
* ConstraintLayout + LinearLayout
* Kotlin Coroutines
* AndroidX Libraries

App Workflow
1. User clicks Fetch Data button
2. App requests Camera Permission
3. If permission is granted:

   * Displays “Loading...”
   * Simulates API call (2-second delay)
   * Shows success or error message
4. If permission is denied:

   * Displays “Permission Denied”

Setup & Installation
1. Clone the repository
2. Open the project in Android Studio
3. Sync Gradle
4. Run the app on emulator or physical device
5. Click Fetch Data and allow permission when prompted

Project Structure
* `MainActivity.kt` → Handles UI logic, permission, and async operations
* `activity_main.xml` → UI layout (Button + TextView)
* `AndroidManifest.xml` → Permission configuration





---

## 🎯 Conclusion

This project successfully demonstrates fundamental Android development practices including handling permissions, managing background tasks, and ensuring robust error handling, all within a simple and user-friendly interface.
