package BoardExamPreactise.CH2;

/*Sometimes AKA Nested inner class*/
class Outer {
    private int field = 44;

    // Nested interface
    interface demoInterface {
        void demo();
    }

    // Nested inner class
    class Inner implements demoInterface {
        public void show() {
            System.out.println("In a nested class method");
        }

        public void demo() {
            System.out.println("Defining the abstract method of interface");
        }
    }

}

class NestedInnerClass {
    public static void main(String[] args) {
        /* Note how inner class object is created inside main() */
        Outer.Inner in = new Outer().new Inner();
        /* Calling show() method over above object created */
        in.show();
        in.demo();
    }
}
