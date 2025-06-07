class Vehicle {
    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is being driven.");
    }
}

class Motorcycle extends Vehicle {
    public void ride() {
        System.out.println("Motorcycle is being ridden.");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();
        myCar.drive();
        myCar.stopEngine();

        System.out.println();

        Motorcycle myMotorcycle = new Motorcycle();
        myMotorcycle.startEngine();
        myMotorcycle.ride();
        myMotorcycle.stopEngine();
    }
}
