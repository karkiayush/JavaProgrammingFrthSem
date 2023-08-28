/*
 * 16Fall1b ko solution
 * In Java, instance variable hiding refers to the situation where a subclass declares an instance variable with the same name as an instance variable in its superclass. This can lead to potential confusion and unexpected behavior when accessing or modifying these variables, especially when dealing with inheritance and polymorphism.

When a subclass declares an instance variable with the same name as a variable in its superclass, it "hides" the superclass variable, and any references to that variable within the subclass will refer to the subclass's variable rather than the superclass's variable. This can lead to scenarios where the expected behavior might not occur due to the subclass variable taking precedence.
 * 
 * 
*/

package BoardExamPreactise.CH2;

class SuperClass {
    int value = 10;
}

class SubClass extends SuperClass {
    int value = 20;

    void printValues() {
        System.out.println("Value in Child: " + value);
        System.out.println("Value in Parent: " + super.value);
    }
}

public class SixteenFallOneB {
    public static void main(String[] args) {
        SubClass child = new SubClass();
        child.printValues();
    }
}
