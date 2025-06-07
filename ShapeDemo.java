class Shape {
    public double calculateArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public int calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * 3.14 * radius;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 3);
        System.out.println("Rectangle Area: " + rect.calculateArea());
        System.out.println("Rectangle Perimeter: " + rect.calculatePerimeter());

        System.out.println();

        Circle circle = new Circle(7);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Circumference: " + circle.calculateCircumference());
    }
}
