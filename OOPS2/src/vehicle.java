// Parent class
class Vehicle {
    int maxSpeed;

    // Constructor for parent class
   public  Vehicle(int maxSpeed) {
       super();
	   this.maxSpeed = maxSpeed; // 'this' refers to the current instance's maxSpeed
    }

    // Method to display vehicle details
  public   void displayDetails() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Child class
class Car extends Vehicle {
    String brand;

    // Constructor for child class
    Car(int maxSpeed, String brand) {
        super(maxSpeed); // 'super' calls the parent class constructor
        this.brand = brand; // 'this' refers to the current instance's brand
    }

    // Method to display car details
    void displayCarDetails() {
        System.out.println("Brand: " + brand);
        super.displayDetails(); // Call the parent class method to display maxSpeed
    }
}

// Child class with constructor chaining using 'this'
class SportsCar extends Car {
    String model;

    // Constructor for child class with constructor chaining
    SportsCar(int maxSpeed, String brand, String model) {
       
    	this(maxSpeed, brand); // Call another constructor in the same class
        this.model = model;
    }

    // Overloaded constructor in the same class
    SportsCar(int maxSpeed, String brand) {
        super(maxSpeed, brand); // Call the parent class constructor
    }

    // Method to display sports car details
    void displaySportsCarDetails() {
        System.out.println("Model: " + model);
        displayCarDetails(); // Call the child class method to display brand and maxSpeed
    }
}

