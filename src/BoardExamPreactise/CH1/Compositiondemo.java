/*
 * Composition in Java is a design principle where one class (the composite class) contains an instance of another class (the component class) as a member field. This relationship models a "has-a" or "contains" relationship between classes. Composition allows you to create complex objects by combining simpler objects, promoting code reuse, modularity, and flexibility.
*/
class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    Engine engine = new Engine(); // Composition: Car "has-a" Engine

    void startCar() {
        System.out.println("Car is starting...");
        engine.start(); // Delegate the start operation to the Engine
    }
}

public class Compositiondemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startCar();
    }
}
