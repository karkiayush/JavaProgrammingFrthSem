package BoardExamPreactise.CH2;

// Java Program to Illustrate Anonymous Inner Classes
// Declaration Without Any Name
// As an implementer of Specified interface

// Interface
interface Hello {

    // Method defined inside interface
    void show();
}

class Demo {

    // Method of helper class
    void show() {
        // Print statement
        System.out.println(
                "i am in show method of super class");
    }
}

// Main class
public class AnonymousInnerClass {

    // Class implementing interface
    static Hello h = new Hello() {

        // Method 1
        // show() method inside main class
        public void show() {
            // Print statement
            System.out.println("i am in anonymous class");
        }
    };

    // class inheriting the parent class i.e
    static Demo d = new Demo() {
        // Method 1
        // show() method
        void show() {
            // Calling method show() via super keyword
            // which refers to parent class
            super.show();

            // Print statement
            System.out.println("i am in Flavor1Demo class");
        }
    };

    // Method 2
    // Main driver method
    public static void main(String[] args) {
        // Calling show() method inside main() method

        System.out.println();
        h.show();
        d.show();
    }
}
