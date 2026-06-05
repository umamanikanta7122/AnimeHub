# AnimeHub - Android Anime Discovery Application

## Project Overview

AnimeHub is a modern Android application developed using Java and Android Studio that allows users to discover, search, and explore anime information in an interactive and user-friendly environment.

The application integrates the Jikan API to fetch real-time anime data and display information such as anime titles, ratings, episode counts, synopsis, and images. Users can also view anime details and watch preview videos for selected anime.

This project was developed as part of the Android App Development Internship at ApexPlanet Software Pvt. Ltd.

---

## Objectives

The main objectives of this project are:

* To develop a responsive Android application using Java.
* To implement modern Android UI components.
* To integrate REST APIs using Retrofit.
* To fetch and display real-time anime information.
* To provide a smooth and interactive user experience.
* To understand Android application architecture and development workflow.

---

## Features

### 1. Login System

The application includes a login screen where users enter their username and password before accessing the application.

Features:

* Username validation
* Password validation
* Minimum password length checking
* Error messages for invalid inputs

### 2. Home Screen

The home screen provides a welcoming interface with navigation options that allow users to explore anime content available in the application.

### 3. Anime Collection

The Anime Collection screen displays a list of anime using RecyclerView.

Features:

* Attractive anime cards
* Anime image display
* Anime ratings
* Episode information
* Smooth scrolling

### 4. Search Functionality

Users can search anime by title using the search bar.

Benefits:

* Faster anime discovery
* Instant search filtering
* Improved user experience

### 5. Anime Details Screen

When a user selects an anime, a detailed information screen is displayed.

Information displayed:

* Anime Title
* Anime Banner Image
* Rating
* Number of Episodes
* Synopsis
* Preview Video

### 6. Video Preview Feature

The application includes anime preview videos for selected anime.

Supported Anime:

* One Piece
* Naruto
* Bleach
* Jujutsu Kaisen

This feature enhances user engagement and provides a richer viewing experience.

### 7. API Integration

The application integrates the Jikan API using Retrofit.

API Features:

* Fetch top anime
* Dynamic anime information
* Real-time content updates
* JSON data parsing

### 8. Progress Bar

A loading indicator is displayed while data is being fetched from the API.

Benefits:

* Better user feedback
* Improved application usability

### 9. Error Handling

The application handles API failures gracefully.

Features:

* Error notifications
* Prevention of application crashes
* Better user experience

---

## Technologies Used

### Programming Language

* Java

### Development Environment

* Android Studio

### Libraries and Frameworks

* Retrofit
* Glide
* RecyclerView
* CardView

### API

* Jikan Anime API

### Version Control

* Git
* GitHub

---

## Project Architecture

AnimeHub follows a simple Android application architecture.

Components:

* LoginActivity
* MainActivity
* AnimeApiActivity
* AnimeDetailsActivity
* AnimeAdapter
* RetrofitClient
* ApiService
* Anime Model Classes

---

## Testing Performed

The following tests were performed:

### Functional Testing

* Login validation testing
* Search functionality testing
* API data loading testing
* Anime details testing
* Video preview testing

### UI Testing

* Layout responsiveness
* RecyclerView scrolling
* Button functionality
* Navigation testing

### Error Testing

* Invalid login inputs
* API failure handling
* Empty search results

---

## Challenges Faced

During development, several challenges were encountered:

1. Integrating external APIs.
2. Managing RecyclerView data dynamically.
3. Implementing search functionality.
4. Handling API errors.
5. Managing video previews.
6. Improving UI responsiveness.

These challenges helped improve problem-solving and Android development skills.

---

## Future Enhancements

The following features can be added in future versions:

* Firebase Authentication
* User Registration System
* Favorites and Watchlist
* Dark Mode Support
* Push Notifications
* Offline Anime Storage
* Personalized Recommendations

---

## Learning Outcomes

Through this project, I gained practical experience in:

* Android Application Development
* Java Programming
* REST API Integration
* Retrofit Library
* RecyclerView Implementation
* UI/UX Design
* Error Handling
* Testing and Debugging
* Git and GitHub Version Control

---

## Developer Information

Name: Uma Manikanta

Internship: Android App Development Internship

Organization: ApexPlanet Software Pvt. Ltd.

Duration: 45 Days

---

## GitHub Repository

AnimeHub Android Application Source Code

Thank you for visiting this repository.
