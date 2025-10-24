
class Vehicle {
    protected String make;
    protected String model;
    protected int year;

  
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

 
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    private double trunkSize; 

    public Car(String make, String model, int year, double trunkSize) {
        super(make, model, year);
        this.trunkSize = trunkSize;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n=== Car Details ===");
        super.displayDetails();
        System.out.println("Trunk Size: " + trunkSize + " cubic feet");
    }
}


class Truck extends Vehicle {
    private double payloadCapacity; 

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n=== Truck Details ===");
        super.displayDetails();
        System.out.println("Payload Capacity: " + payloadCapacity + " kg");
    }
}


public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 15.1);
        Truck truck = new Truck("Isuzu", "D-Max", 2021, 1000.0);

        car.displayDetails();
        truck.displayDetails();
    }
}
