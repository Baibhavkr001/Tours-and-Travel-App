# Tours and Travel Application
## Table of Contents
  1. Introduction
  2. Features
  3. Technologies Used
  4. Installation
  5. Usage
  6. Database Setup
  7. Contributing
  9. License
  10. Contact
      
## Introduction
The Tours and Travel Application is a desktop-based application designed to manage tour and travel services. The application allows users to book tours, manage bookings, and view available travel packages. It is built using Java with JFrame and Java Swing for the GUI, and MySQL for the backend database. The project is developed using NetBeans IDE.

## Features
  User Registration and Login
  View and Book Travel Packages
  Manage Bookings
  Search for Tours
  Admin Dashboard for Managing Packages and Bookings
  Responsive and user-friendly GUI

## Technologies Used
  Programming Language: Java
  GUI Framework: JFrame, Java Swing
  IDE: NetBeans
  Database: MySQL

## Installation
Prerequisites
  Java Development Kit (JDK)
  NetBeans IDE
  MySQL
  Steps
Clone the Repository:
git clone [https://github.com/your-username/tours-and-travel-application.git](https://github.com/Baibhavkr001/Tours-and-Travel-App.git)
cd tours-and-travel-application
  Open the Project in NetBeans:

  Open NetBeans IDE.
  Go to File > Open Project.
  Navigate to the cloned repository and open the project.
  Set Up the Database:

  Install and configure MySQL.
  Create a new database named tours_and_travel.
  Import the database schema from the database folder in the project directory.
  Configure Database Connection:

  In NetBeans, go to Services > Databases.
  Right-click and choose New Connection.
  Enter your MySQL connection details (hostname, port, username, password, and database name).
  Build and Run the Application:

  Clean and build the project in NetBeans (Run > Clean and Build Project).
  Run the project (Run > Run Project).

## Usage
  User Registration and Login:
  Users can register by providing their details.
  Registered users can log in using their credentials.
  Booking a Tour:
  Browse available travel packages.
  Select a package and book the tour.
  Managing Bookings:
  View all your bookings.
  Cancel or modify bookings if needed.
  Admin Dashboard:
  Admins can log in to manage travel packages and bookings.
  Add, update, or delete travel packages.

## Database Setup
  Database Name: tours_and_travel
  Tables:
  users (id, username, password, email, role)
  packages (id, name, description, price, availability)
  bookings (id, user_id, package_id, booking_date, status)
  Sample SQL for Creating Tables:
  sql
  Copy code
  CREATE DATABASE tours_and_travel;

  USE tours_and_travel;

  CREATE TABLE users (
      id INT AUTO_INCREMENT PRIMARY KEY,
      username VARCHAR(50) NOT NULL,
      password VARCHAR(50) NOT NULL,
      email VARCHAR(50),
      role VARCHAR(10) DEFAULT 'user'
  );

  CREATE TABLE packages (
      id INT AUTO_INCREMENT PRIMARY KEY,
      name VARCHAR(100),
       description TEXT,
      price DECIMAL(10, 2),
      availability INT
  );

  CREATE TABLE bookings (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    package_id INT,
    booking_date DATE,
    status VARCHAR(20),
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (package_id) REFERENCES packages(id)
);

## Contributing
Contributions are welcome! Please follow these steps:

Fork the repository.
  Create a new branch (git checkout -b feature/your-feature-name).
Make your changes.
  Commit your changes (git commit -m 'Add some feature').
Push to the branch (git push origin feature/your-feature-name).
Open a pull request.
## License
This project is licensed under the MIT License.

## Contact
For any questions or suggestions, feel free to reach out:

  Name: Baibhav Kumar 
  Email: baibhavchoudhary5@gmail.com
  GitHub: your-Baibhavkr001
