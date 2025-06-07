class Vehicle {
    public void drive() {
        System.out.println("The vehicle is driving.");
    }
}

public class Car extends Vehicle {
    public void display() {
        System.out.println("This is a car.");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
        myCar.display();
    }
}
