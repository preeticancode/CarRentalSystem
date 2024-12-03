# Car Rental System  

A simple console-based Car Rental System developed in Java, showcasing both fundamental and advanced features of the Java language, including the latest enhancements introduced in Java 21.

---

## Features  

### Fundamentals  
1. **Classes**  
   - Demonstrates `this()` for constructor chaining and `this.` for instance variable referencing.  
   - Implements method overloading and variable arguments (`varargs`).  
   - Utilizes Local Variable Type Inference (`var`).  

2. **Encapsulation**  
   - Properly encapsulated fields with getters and constructors.  

3. **Interfaces**  
   - Implements interfaces with default and static methods.  

4. **Inheritance**  
   - Abstract sealed class `Car` with extending classes `ElectricCar` and `SUV`.  
   - Showcases method overriding and polymorphism.  
   - Uses `super()` and `super.` for parent class constructor and method invocation.  

5. **Exceptions**  
   - Demonstrates handling of checked and unchecked exceptions.  

6. **Enums**  
   - Enum `CarType` defines car types such as `ELECTRIC` and `SUV`.  

7. **Arrays and Core APIs**  
   - Uses Java Core APIs: `String`, `StringBuilder`, `List/ArrayList`, and `Date API`.  

---

### Advanced Features  
1. **Call-by-Value and Defensive Copying**  
   - Defensive copying ensures immutability in `RentalHistory`.  

2. **Private, Default, and Static Interface Methods**  
   - Enhanced interface functionalities are demonstrated in `RentalService`.  

3. **Records**  
   - `RentalDetails` record simplifies immutable data representation.  

4. **Custom Immutable Types**  
   - `RentalHistory` is an immutable collection with unmodifiable fields.  

5. **Lambdas and Method References**  
   - Uses lambda expressions with `Predicate` for filtering cars.  
   - Demonstrates `final` and `effectively final` variables in lambdas.  

6. **Switch Expressions and Pattern Matching**  
   - Enhanced switch expressions and pattern matching in the main program logic.  

7. **Sealed Classes**  
   - Sealed class `Car` restricts inheritance to specific types like `SUV` and `ElectricCar`.  

---

## How to Run  

1. **Clone the Repository**  
   ```bash
   git clone https://github.com/your-repo/CarRentalSystem.git
   cd CarRentalSystem
