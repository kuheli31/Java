//21. Write a Java program to create a class called "Vehicle" with attributes for make, model, and year. Create subclasses "Car" and "Truck" that add specific attributes like trunk size for cars and payload capacity for trucks. Implement a method to display vehicle details in each subclass.

// Base Vehicle class
class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    
    // Constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    // Method to display basic vehicle details
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    
    // Getters
    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year;
    }
}

// Car subclass
class Car extends Vehicle {
    private double trunkSize; // in cubic feet
    
    // Constructor
    public Car(String make, String model, int year, double trunkSize) {
        super(make, model, year); // Call parent constructor
        this.trunkSize = trunkSize;
    }
    
    // Override displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("=== CAR DETAILS ===");
        super.displayDetails(); // Call parent method
        System.out.println("Trunk Size: " + trunkSize + " cubic feet");
        System.out.println("Vehicle Type: Car");
        System.out.println("==================");
    }
    
    // Getter for trunk size
    public double getTrunkSize() {
        return trunkSize;
    }
    
    // Setter for trunk size
    public void setTrunkSize(double trunkSize) {
        this.trunkSize = trunkSize;
    }
}

// Truck subclass
class Truck extends Vehicle {
    private double payloadCapacity; // in tons
    
    // Constructor
    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year); // Call parent constructor
        this.payloadCapacity = payloadCapacity;
    }
    
    // Override displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("=== TRUCK DETAILS ===");
        super.displayDetails(); // Call parent method
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
        System.out.println("Vehicle Type: Truck");
        System.out.println("====================");
    }
    
    // Getter for payload capacity
    public double getPayloadCapacity() {
        return payloadCapacity;
    }
    
    // Setter for payload capacity
    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }
}

// Main class to test the inheritance
public class Vehicle {
    public static void main(String[] args) {
        System.out.println("Vehicle Inheritance Example\n");
        
        // Create Car objects
        Car car1 = new Car("Toyota", "Camry", 2023, 15.1);
        Car car2 = new Car("Honda", "Civic", 2022, 14.7);
        
        // Create Truck objects
        Truck truck1 = new Truck("Ford", "F-150", 2023, 3.3);
        Truck truck2 = new Truck("Chevrolet", "Silverado", 2022, 2.8);
        
        // Display car details
        System.out.println("CARS:");
        car1.displayDetails();
        System.out.println();
        car2.displayDetails();
        System.out.println();
        
        // Display truck details
        System.out.println("TRUCKS:");
        truck1.displayDetails();
        System.out.println();
        truck2.displayDetails();
        System.out.println();
        
        // Demonstrate polymorphism
        System.out.println("POLYMORPHISM EXAMPLE:");
        Vehicle[] vehicles = {car1, truck1, car2, truck2};
        
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("Vehicle " + (i + 1) + ":");
            vehicles[i].displayDetails();
            System.out.println();
        }
        
        // Accessing specific attributes
        System.out.println("SPECIFIC ATTRIBUTES:");
        System.out.println("Car1 trunk size: " + car1.getTrunkSize() + " cubic feet");
        System.out.println("Truck1 payload capacity: " + truck1.getPayloadCapacity() + " tons");
    }
}