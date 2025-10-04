# Android Firebase Authentication Application

A comprehensive Java-based Android application demonstrating Firebase Authentication with user management features including sign-in, profile management, and password recovery.

## 📱 Overview

This Android application showcases a complete Firebase Authentication system with multiple user management features. Built with Java and following Android development best practices, it provides a solid foundation for authentication-powered mobile applications.

## 🔧 Key Features

- **User Authentication System**
  - User registration and login
  - Password recovery functionality
  - User profile management
- **Firebase Integration**
  - Firebase Authentication (v21.0.1)
  - Firebase Realtime Database (v20.0.3)
- **Modern UI/UX**
  - Material Design components
  - Responsive layouts with CardView and RecyclerView
  - Professional user interface
- **Network Capabilities**
  - Retrofit integration for API calls
  - Glide for efficient image loading
- **Security Features**
  - Secure authentication flow
  - Network state monitoring

## 🏗 App Architecture

The application consists of four main activities:

1. **MainActivity** - Main entry point and launcher activity
2. **UserSignIn** - User authentication interface
3. **ProfileActivity** - User profile management
4. **ForgotPassword** - Password recovery functionality

## 🛠 Tech Stack

- **Language**: Java
- **Platform**: Android (API 26+)
- **Target SDK**: 31
- **Package**: `com.example.firebase`
- **Firebase Services**:
  - Firebase Authentication (v21.0.1)
  - Firebase Realtime Database (v20.0.3)
- **Networking**: Retrofit 2.9.0 with Gson converter
- **UI Libraries**: 
  - Material Design Components (v1.5.0)
  - Android Support Library (AppCompat, Design, CardView, RecyclerView)
  - Glide (v4.12.0) for image loading
- **Build System**: Gradle with Google Services plugin

## 📋 Prerequisites

- Android Studio Arctic Fox or later
- Java 8 or higher
- Android SDK with API level 26 or higher
- Firebase project with Authentication enabled
- Google Services configuration file (`google-services.json`)

## 🚀 Installation & Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/haffarsadok/Android-FireBase-Application.git
   cd Android-FireBase-Application
   ```

2. **Firebase Configuration**
   - Create a new project in the [Firebase Console](https://console.firebase.google.com/)
   - Add your Android app to the Firebase project (package: `com.example.firebase`)
   - Download the `google-services.json` file
   - Replace the existing `google-services.json` in the `app/` directory

3. **Enable Firebase Authentication**
   - Navigate to Authentication in Firebase Console
   - Enable Email/Password authentication
   - Configure other sign-in methods as needed

4. **Set up Realtime Database**
   - Enable Firebase Realtime Database
   - Configure security rules for user data

5. **Build and Run**
   ```bash
   ./gradlew assembleDebug
   ```
   Or open in Android Studio and run directly

## 📱 App Flow

1. **Launch** → MainActivity (Entry point)
2. **Authentication** → UserSignIn (Login/Register)
3. **Profile Management** → ProfileActivity (User profile)
4. **Password Recovery** → ForgotPassword (Reset password)

## 🔐 Permissions

The app requires the following permissions:
- `INTERNET` - For Firebase communication
- `ACCESS_NETWORK_STATE` - For network connectivity monitoring

## 📂 Project Structure

```
app/
├── src/main/
│   ├── java/com/example/firebase/
│   │   ├── MainActivity.java           # Main launcher activity
│   │   ├── UserSignIn.java            # Authentication activity
│   │   ├── ProfileActivity.java       # User profile management
│   │   └── ForgotPassword.java        # Password recovery
│   ├── res/                           # Resources (layouts, strings, etc.)
│   └── AndroidManifest.xml            # App configuration
├── build.gradle                       # Dependencies and build config
└── google-services.json               # Firebase configuration
```

## ⚙️ Configuration

1. **Firebase Authentication**: 
   - Configure email/password authentication
   - Set up password reset email templates
   
2. **Database Security**: 
   - Implement proper Firebase security rules
   - Configure user data access permissions

3. **App Theming**: 
   - Uses `@style/Theme.FireBase` custom theme
   - Material Design components integration

## 📱 Minimum Requirements

- **Minimum SDK**: API 26 (Android 8.0)
- **Target SDK**: API 31 (Android 12)
- **Compile SDK**: API 31
- **Java Version**: 1.8

## 🔧 Build Configuration

The project uses:
- Android Gradle Plugin with Google Services
- ProGuard configuration for release builds
- Support for both debug and release build types

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/NewFeature`)
3. Commit your changes (`git commit -m 'Add NewFeature'`)
4. Push to the branch (`git push origin feature/NewFeature`)
5. Open a Pull Request

## 📄 License

This project is available for educational and testing purposes.

## 👤 Author

**Haffa R Sadok** - [@haffarsadok](https://github.com/haffarsadok)

## 🔗 Useful Resources

- [Firebase Authentication Documentation](https://firebase.google.com/docs/auth)
- [Firebase Realtime Database](https://firebase.google.com/docs/database)
- [Android Developer Guide](https://developer.android.com/guide)
- [Material Design Guidelines](https://material.io/design)

