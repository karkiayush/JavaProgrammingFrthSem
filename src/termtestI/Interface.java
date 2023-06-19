package termtestI;

interface InterfaceA {
    void display();
}

// Interface 2
interface InterfaceB {
    void display();
}

// Class implementing two interfaces
class MyClass implements InterfaceA, InterfaceB {
    public void display() {
        System.out.println("Displaying in MyClass");
    }
}

// Main class
public class Interface {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display(); // Output: Displaying in MyClass
    }
}
