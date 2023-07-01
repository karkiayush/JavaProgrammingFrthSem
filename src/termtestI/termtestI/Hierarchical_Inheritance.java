package termtestI.termtestI;

// Example of hierarchical inheritance 
// Superclass
class Shape {
    protected double area;

    public void calculateArea() {
        System.out.println("Calculating area of Shape");
    }
}

// Subclass 1
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Subclass 2
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Main class
public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.calculateArea();

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        rectangle.calculateArea();
    }
}
