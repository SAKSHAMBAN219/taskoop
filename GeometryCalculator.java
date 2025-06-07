class Shape {
    int length;
    int breadth;
    int radius;

    Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Shape(int radius) {
        this.radius = radius;
    }
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Square extends Rectangle {
    Square(int side) {
        super(side, side); // a square is a rectangle with equal sides
    }

    void calculateArea() {
        int area = length * length;
        System.out.println("Area of Square: " + area);
    }
}

class Circle extends Shape {
    Circle(int radius) {
        super(radius);
    }

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class GeometryCalculator {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        rect.calculateArea();

        Square square = new Square(4);
        square.calculateArea();

        Circle circle = new Circle(7);
        circle.calculateArea();
    }
}
