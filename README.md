# Car Rental System

## Overview

The **Car Rental System** is a Java-based console application designed to help both administrators and customers manage car rentals. The system enables admins to add new cars, view available cars, and manage rental transactions. Customers can browse available cars, rent them, and return them when they're done.

## UML Diagram

You can view the UML diagram for the Car Rental System [here](diagrams/car_rental_system_uml.png).

### Key Features:
- **Car Addition**: Admins can add Electric Cars or SUVs to the system.
- **Car Rental**: Customers can rent available cars.
- **Car Return**: Customers can return rented cars.
- **View Available Cars**: Customers and admins can view the list of cars that are available for rent.

The system tracks car availability (AVAILABLE or RENTED), providing real-time updates on the status of the fleet.

## User Story

### As an **Admin**:
1. **Add New Cars**: I want to be able to add different types of cars (Electric Cars and SUVs) to the fleet, specifying details like name, license plate, and specific features (battery capacity for Electric Cars, four-wheel-drive capability for SUVs).
2. **View Available Cars**: I want to check which cars are available for customers to rent, ensuring that the fleet is managed efficiently.
3. **Track Car Rentals**: I want to manage car statuses (AVAILABLE or RENTED) to ensure that rented cars are not shown as available and to update their status when returned.

### As a **Customer**:
1. **Rent a Car**: I want to be able to rent a car by providing my name, customer ID, and selecting a car by its license plate, so I can use it as needed.
2. **Return a Car**: Once my rental period is over, I want to return the car by providing the license plate, updating its status to AVAILABLE.
3. **View Available Cars**: I want to see a list of all cars available for rent, so I can make an informed decision before renting.

## Features

### 1. **Add a Car**
- Admins can choose to add either an **Electric Car** or an **SUV** to the system.
- For **Electric Cars**, admins specify the **battery capacity** (in kWh).
- For **SUVs**, admins indicate whether the car is **four-wheel drive**.
- Each car must have a **name** and **license plate**.

### 2. **View Available Cars**
- Displays a list of all cars that are currently available for rent.
- The status of each car (AVAILABLE or RENTED) is shown.
  
### 3. **Rent a Car**
- Customers can rent a car by providing their **name**, **customer ID**, and the **license plate** of the car they want to rent.
- The car is then marked as **RENTED** and added to the rental transaction log.

### 4. **Return a Car**
- Customers can return a rented car by providing the **license plate**.
- The car's status is updated to **AVAILABLE** once returned.

## Project Structure

The directory structure is organized as follows:


### Breakdown of the Directory Structure:
- **`src/`**: Contains the source code of the application.
  - **`main/`**: The main directory where the core application logic resides.
    - **`Main.java`**: The entry point for the application where the menu and user interaction occurs.
  - **`models/`**: Contains classes for models representing cars and customers.
    - **`Car.java`**: A base class that provides common attributes for all car types.
    - **`ElectricCar.java`**: A subclass of `Car`, adding electric-specific features like battery capacity.
    - **`SUV.java`**: A subclass of `Car`, defining an SUV with four-wheel-drive capabilities.
    - **`Customer.java`**: Holds customer information, such as name and ID.
    - **`CarStatus.java`**: Enum to define the status of a car (AVAILABLE or RENTED).
  - **`services/`**: Contains classes for handling the application's business logic.
    - **`RentalManager.java`**: Manages the process of renting, adding, and returning cars.
    - **`Renter.java`**: Handles interactions related to customers, such as renting and returning cars.
  - **`utils/`**: Contains utility classes for managing transactions.
    - **`RentalTransaction.java`**: Manages information related to a car rental transaction, including car details and customer info.

- **`bin/`**: Contains compiled `.class` files, generated after building the Java project.
- **`README.md`**: Project documentation file containing information about the project, usage, installation, and contribution guidelines.
- **`LICENSE`**: The project's open-source license details.
- **`.gitignore`**: A configuration file used by Git to ignore certain files or directories from being version-controlled (e.g., compiled files, IDE configuration files).

This structure helps in maintaining a modular and clean architecture, ensuring each part of the system is logically organized.

## Installation

To get started with the Car Rental System, follow these steps:

### Step 1: Clone the Repository
```bash
git clone https://github.com/yourusername/car-rental-system.git
cd car-rental-system