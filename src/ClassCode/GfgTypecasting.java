package ClassCode;
// Java program to demonstrate
// Upcasting Vs Downcasting

// Parent class
class Parent {
    String name;

    // A method which prints the
    // signature of the parent class
    void method() {
        System.out.println("Method from Parent");
    }
}

// Child class
class Child extends Parent {
    int id;

    // Overriding the parent method
    // to print the signature of the
    // child class
    @Override
    void method() {
        System.out.println("Method from Child");
    }
}

// Driver code
public class GfgTypecasting {
    public static void main(String[] args) {
        // Upcasting
        Parent p = new Child();// object of child class referred to parent class;
        p.name = "GeeksforGeeks";// parent ko name set vayo

        // Printing the parentclass name
        System.out.println(p.name);
        // parent class method is overridden method hence child method will be executed.
        // If it wasn't overridden, the parent method would be invoked
        p.method();

        // Trying to Downcasting Implicitly
        // Child c = new Parent(); - > compile time error

        // Downcasting Explicitly
        Child c = (Child) p;

        c.id = 1;
        System.out.println("\n" + c.name);
        System.out.println(c.id);
        c.method();
    }
}