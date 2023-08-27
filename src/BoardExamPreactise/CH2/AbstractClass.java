package BoardExamPreactise.CH2;

abstract class Bike {
    abstract void run();

    void nonAbstract() {
        System.out.println("This is not a abstract method");
    }
}

class AbstractClass extends Bike {
    void run() {
        System.out.println("running safely");
    }

    public static void main(String args[]) {
        /*
         * ----> Reference of parent class to hold the instance of child class
         * ---->This is a common example of polymorphism in Java,
         * 
         * Here in the following code:
         * Bike obj = new AbstractClass();
         * It is a case of having a reference of the abstract class Bike and an instance
         * of the concrete class AbstractClass.
         * 
         * In other words, the variable obj has a reference type of Bike (which is an
         * abstract class), but it's actually holding an instance of the concrete class
         * AbstractClass.
         */
        Bike obj = new AbstractClass();
        obj.run();
        obj.nonAbstract();
    }
}
