package termtestI.termtestI;

/**
 * InnerClass
 */
class OuterClass {
    private int outerField;

    public OuterClass(int value) {
        outerField = value;
    }

    class InnerClass {
        public void innerMethod() {
            System.out.println("Inner method invoked");
            System.out.println("Value of outerField: " + outerField);
        }
    }

    public void outerMethod() {
        System.out.println("Outer method invoked");

        InnerClass inner = new InnerClass();
        inner.innerMethod();
    }
}

public class InnerClass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass(42);
        outer.outerMethod();
    }
}
