package BoardExamPreactise.CH2;

class Outer1 {

    // Method inside outer class
    void outerMethod1() {
        System.out.println("inside outerMethod");
        class Inner1 {
            // Method defined inside inner class
            void innerMethod1() {
                // Print statement whenever inner class is
                // called
                System.out.println("inside innerMethod");
            }
        }
        // Creating object of inner class
        Inner1 y = new Inner1();
        // Calling over method defined inside it
        y.innerMethod1();
    }
}

// Driver class
class LocalInnerClass {
    public static void main(String[] args) {
        Outer1 x = new Outer1();
        x.outerMethod1();
    }
}
