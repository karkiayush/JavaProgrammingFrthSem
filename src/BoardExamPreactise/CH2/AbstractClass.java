package BoardExamPreactise.CH2;

import java.util.Scanner;

abstract class Bike {
    int chasssisNum = 33;
    double bikePrice;

    abstract void run();

    void nonAbstract() {
        System.out.println("This is not a abstract method");
        System.out.println("This bike can cost you around Rs. " + bikePrice);
    }
}

class AbstractClass extends Bike {
    Scanner scan = new Scanner(System.in);

    void run() {
        System.out.println("running safely");
        System.out.print("Enter the price of bike: ");
        bikePrice = scan.nextDouble();

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
